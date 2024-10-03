import os
import sys
import subprocess
import re  # Added for regex operations in the new functions
from datetime import datetime

# Assuming you have an OpenAI client similar to the one in your original script
from openai import OpenAI

def main(api_key, branch_name):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)
    if not branch_name:
        print("Error: Branch name is missing.")
        sys.exit(1)

    # Initialize the OpenAI client
    client = OpenAI(api_key=api_key)

    # Note: We will not switch branches to avoid previous issues.

    # Read the new task from file
    new_task_path = os.path.join("tasks", "new_task.md")
    if not os.path.exists(new_task_path):
        print(f"Error: New task file not found at {new_task_path}")
        sys.exit(1)
    with open(new_task_path, "r") as f:
        new_task_content = f.read()

    # Split the new task into exercises
    exercise_chunks = split_task_into_exercises(new_task_content)

    # Generate solutions for exercises that require coding
    # Assuming that exercises requiring coding start from Exercise 3
    coding_exercises = identify_coding_exercises(exercise_chunks)

    # Sample code to use as inspiration
    sample_code = """
    // Example of a simple class modeling arrays
    /**
    * Reference solutions for Task 5, Arrays
    * @author Linus Östlund
    * This would not have been possible without my computer, a M1 Macbook Air.
    */
    public class Arrays {

        /**
        * Count the average value of array with integers
        * @param array of integers
        * @return the average of element integer sum
        */
        public static int average(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum / array.length;
        }

        // ... rest of the sample code ...
    }

    // Example of a simple class using array lists
    import java.util.ArrayList;

    public class SetTheory {

        // The maximum threshold
        private static final int MAX = 100;

        /**
        * Generate an ArrayList between min and max
        * @param min lower bound, inclusive
        * @param max upper bound, non-inclusive
        * @return an ArrayList with all integers in [min, max - 1]
        */
        public static ArrayList<Integer> generateSet(int min, int max) {
            ArrayList<Integer> set = new ArrayList<>();
            if (min >= max) {
                // return empty list
                return set;
            } else {
                // Ternary operator to see if max > 100
                for (int i = Math.max(min, 0); i < Math.min(max, MAX); i++) {
                    set.add(i);
                }
                return set;
            }
        }

        // ... rest of the sample code ...
    }
    """

    # Additional instructions to include in the prompt
    additional_instructions = (
        "Ensure that each class is saved in its own appropriately named file, and that there are no 'leftover' "
        "initializers or class definitions from subsequent files.\n"
        "Ensure all imports, public classes, and everything related to the class is included in the appropriate file.\n"
        "Write NO TEXT beyond the code itself, whatsoever."
        "IMPORTANT: The response must be plain Java code with no markdown formatting or ```java blocks. "
        "Ensure that each class is entirely self-contained and is not left incomplete. "
    )

    # Ensure the .hidden_tasks directory exists
    hidden_tasks_dir = os.path.join(".hidden_tasks")
    os.makedirs(hidden_tasks_dir, exist_ok=True)

    # Generate solutions
    for exercise_num, exercise_content in coding_exercises.items():
        # Build the prompt for the AI
        prompt = (
            f"You are an expert Java programmer and educator. Generate a complete and correct solution "
            f"to the following exercise, including any necessary code. The code should be robust, well-documented "
            f"with comments where appropriate, and adhere to best practices.\n\n"
            f"Exercise {exercise_num}:\n{exercise_content}\n\n"
            f"Use the following sample code as inspiration:\n{sample_code}\n\n"
            f"{additional_instructions}"
        )

        # Call OpenAI API to generate the solution
        solution_content = generate_with_retries(client, prompt, max_retries=3)
        if solution_content is None:
            print(f"Error: Failed to generate solution for exercise {exercise_num} after multiple retries.")
            continue

        # Clean and process the generated code
        solution_content = clean_class_block(solution_content)
        solution_content = check_and_add_missing_imports(solution_content)

        # Save the solution code to .hidden_tasks
        save_solution(hidden_tasks_dir, solution_content, exercise_num)

    # Commit and push changes
    commit_and_push_changes(branch_name, hidden_tasks_dir)

def split_task_into_exercises(task_content):
    # This function splits the task content into separate exercises
    # Assuming each exercise starts with '#### Exercise'
    exercises = {}
    lines = task_content.split('\n')
    current_exercise = []
    exercise_num = None
    for line in lines:
        if line.strip().startswith('#### Exercise'):
            if current_exercise and exercise_num is not None:
                exercises[exercise_num] = '\n'.join(current_exercise)
                current_exercise = []
            exercise_num = line.strip().split(' ')[2]
        elif exercise_num is not None:
            current_exercise.append(line)
    if current_exercise and exercise_num is not None:
        exercises[exercise_num] = '\n'.join(current_exercise)
    return exercises

def identify_coding_exercises(exercises):
    # Identify which exercises require coding
    coding_exercises = {}
    for num, content in exercises.items():
        if requires_coding(content):
            coding_exercises[num] = content
    return coding_exercises

def requires_coding(exercise_text):
    # Simple heuristic to determine if an exercise requires coding
    keywords = ['Write a method', 'Implement', 'Create a class', 'Code', 'Program', 'Develop', 'Design']
    return any(keyword.lower() in exercise_text.lower() for keyword in keywords)

def generate_with_retries(client, prompt, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4o-2024-08-06",
                messages=[
                    {"role": "system", "content": "You are an expert Java programmer and educator."},
                    {"role": "user", "content": prompt}
                ]
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"Error generating solution: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def save_solution(hidden_tasks_dir, solution_content, exercise_num):
    # Extract the class name from the code
    class_name = extract_class_name(solution_content)
    if not class_name:
        class_name = f"Exercise_{exercise_num}_Solution"
    file_name = f"{class_name}.java"
    file_path = os.path.join(hidden_tasks_dir, file_name)
    with open(file_path, "w") as file:
        file.write(solution_content)
    # Add the file to git
    subprocess.run(["git", "add", file_path], check=True)

def extract_class_name(code):
    # Simple parser to extract the class name from the code
    lines = code.split('\n')
    for line in lines:
        if line.strip().startswith("public class"):
            parts = line.strip().split()
            if len(parts) >= 3:
                return parts[2]
    return None

def clean_class_block(block):
    """Ensure the block only contains content until the last closing brace."""
    # Find the position of the last closing brace '}'
    last_closing_brace = block.rfind("}")
    if last_closing_brace != -1:
        # Truncate the block at the last closing brace
        block = block[:last_closing_brace + 1]
    return block

def check_and_add_missing_imports(block):
    """
    Check the class block for missing imports and add necessary imports based on the content.
    """
    required_imports = {
        "List": "import java.util.List;",
        "ArrayList": "import java.util.ArrayList;",
        "Map": "import java.util.Map;",
        "HashMap": "import java.util.HashMap;",
        "Scanner": "import java.util.Scanner;",
        "Set": "import java.util.Set;",
        "HashSet": "import java.util.HashSet;",
        "Random": "import java.util.Random;"
    }

    # Extract existing imports from the block
    existing_imports = re.findall(r'^\s*import .*;', block, re.MULTILINE)

    # Add missing imports
    imports_to_add = []
    for class_name, import_statement in required_imports.items():
        if class_name in block and import_statement not in existing_imports:
            imports_to_add.append(import_statement)

    # Prepend missing imports at the start of the block
    if imports_to_add:
        block = "\n".join(imports_to_add) + "\n\n" + block

    return block

def commit_and_push_changes(branch_name, hidden_tasks_dir):
    try:
        # Ensure we're on the correct branch
        subprocess.run(["git", "checkout", branch_name], check=True)

        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        # Add the .hidden_tasks directory to git
        subprocess.run(["git", "add", hidden_tasks_dir], check=True)

        # Check if there are changes to commit
        status_output = subprocess.check_output(["git", "status", "--porcelain"]).decode().strip()
        if not status_output:
            print("No changes to commit.")
            return

        subprocess.run(["git", "commit", "-m", f"Add solutions to exercises in {hidden_tasks_dir}"], check=True)
        subprocess.run(
            ["git", "push", "--set-upstream", "origin", branch_name],
            check=True,
            env=dict(os.environ, GIT_ASKPASS='echo', GIT_USERNAME='x-access-token', GIT_PASSWORD=os.getenv('GITHUB_TOKEN'))
        )
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)

if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Usage: python generate_solution.py <api_key> <branch_name>")
        sys.exit(1)

    api_key = sys.argv[1]
    branch_name = sys.argv[2]
    main(api_key, branch_name)