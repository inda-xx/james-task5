import os
import sys
import subprocess
import openai
from datetime import datetime
import pytz
from pytz import timezone

def main(api_key):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    # Initialize OpenAI API
    openai.api_key = api_key

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
    )

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
        solution_content = generate_with_retries(prompt, max_retries=3)
        if solution_content is None:
            print(f"Error: Failed to generate solution for exercise {exercise_num} after multiple retries.")
            continue

        # Save the solution code to .hidden_tasks
        save_solution(solution_content, exercise_num)

    # Commit and push changes
    commit_and_push_changes("Add solutions to exercises")

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

def generate_with_retries(prompt, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = openai.Completion.create(
                engine="gpt-4o-2024-08-06",
                prompt=prompt,
                max_tokens=1500,
                temperature=0
            )
            return response.choices[0].text.strip()
        except Exception as e:
            print(f"Error generating solution: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def save_solution(solution_content, exercise_num):
    # Save the solution code to .hidden_tasks directory
    hidden_tasks_dir = ".hidden_tasks"
    os.makedirs(hidden_tasks_dir, exist_ok=True)
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

def commit_and_push_changes(commit_message):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "commit", "-m", commit_message], check=True)
        subprocess.run(
            ["git", "push"],
            check=True,
            env=dict(os.environ, GIT_ASKPASS='echo', GIT_USERNAME='x-access-token', GIT_PASSWORD=os.getenv('GITHUB_TOKEN'))
        )
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python generate_solution.py <api_key>")
        sys.exit(1)

    api_key = sys.argv[1]
    main(api_key)
