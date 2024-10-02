import os
import sys
import subprocess
from datetime import datetime
import pytz
from pytz import timezone

# Import the OpenAI client
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


    # Read the new task from file
    new_task_path = os.path.join("tasks", "new_task.md")
    if not os.path.exists(new_task_path):
        print(f"Error: New task file not found at {new_task_path}")
        sys.exit(1)
    with open(new_task_path, "r") as f:
        new_task_content = f.read()

    # Split the new task into exercises
    exercise_chunks = split_task_into_exercises(new_task_content)

    # Generate solutions for exercises that require coding (Exercises 3 to 6)
    code_exercises = exercise_chunks[2:]  # Exercises 3 onwards

    for i, exercise in enumerate(code_exercises, start=3):
        # Determine if the exercise requires coding
        if requires_coding(exercise):
            # Build messages for OpenAI API
            messages = [
                {
                    "role": "system",
                    "content": (
                        "You are an expert Java programmer and educator. Generate a complete and correct solution "
                        "to the following exercise, including any necessary code. The code should be well-documented "
                        "with comments where appropriate. Use the following code examples as inspiration."
                    )
                },
                {
                    "role": "user",
                    "content": (
                        "// Example of a simple class modeling arrays\n"
                        "/**\n"
                        "* Reference solutions for Task 5, Arrays\n"
                        "* @author Linus Östlund\n"
                        "* This would not have been possible without my computer, a M1 Macbook Air.\n"
                        "*/\n"
                        "public class Arrays {\n"
                        "    public static int average(int[] array) {\n"
                        "        int sum = 0;\n"
                        "        for (int i = 0; i < array.length; i++) {\n"
                        "            sum += array[i];\n"
                        "        }\n"
                        "        return sum / array.length;\n"
                        "    }\n"
                        "    public static double average(double[] array) {\n"
                        "        double sum = 0;\n"
                        "        for (int i = 0; i < array.length; i++) {\n"
                        "            sum += array[i];\n"
                        "        }\n"
                        "        return sum / array.length;\n"
                        "    }\n"
                        "    public static int smallestElement(int[] array) {\n"
                        "        if (array.length == 0) {\n"
                        "            throw new IllegalArgumentException(\"The list is empty!\");\n"
                        "        }\n"
                        "        int min = array[0];\n"
                        "        for (int i = 0; i < array.length; i++) {\n"
                        "            if (array[i] < min) {\n"
                        "                min = array[i];\n"
                        "            }\n"
                        "        }\n"
                        "        return min;\n"
                        "    }\n"
                        "    public static int[] reverse(int[] array) {\n"
                        "        int[] reversed = new int[array.length];\n"
                        "        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {\n"
                        "            reversed[j] = array[i];\n"
                        "        }\n"
                        "        return reversed;\n"
                        "    }\n"
                        "    public static int[] evenNumbers(int[] array) {\n"
                        "        int evenNumbers = 0;\n"
                        "        for (int i = 0; i < array.length; i++) {\n"
                        "            if (array[i] % 2 == 0) {\n"
                        "                evenNumbers++;\n"
                        "            }\n"
                        "        }\n"
                        "        int[] evenArray = new int[evenNumbers];\n"
                        "        for (int i = 0, j = 0; i < array.length; i++) {\n"
                        "            if (array[i] % 2 == 0) {\n"
                        "                evenArray[j++] = array[i];\n"
                        "            }\n"
                        "        }\n"
                        "        return evenArray;\n"
                        "    }\n"
                        "}\n\n"
                        "// Example of a simple class using array lists\n"
                        "import java.util.ArrayList;\n"
                        "public class SetTheory {\n"
                        "    private static final int MAX = 100;\n"
                        "    public static ArrayList<Integer> generateSet(int min, int max) {\n"
                        "        ArrayList<Integer> set = new ArrayList<>();\n"
                        "        for (int i = Math.max(min, 0); i < Math.min(max, MAX); i++) {\n"
                        "            set.add(i);\n"
                        "        }\n"
                        "        return set;\n"
                        "    }\n"
                        "    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {\n"
                        "        ArrayList<Integer> union = new ArrayList<>(a);\n"
                        "        for (Integer i : b) {\n"
                        "            if (!union.contains(i)) {\n"
                        "                union.add(i);\n"
                        "            }\n"
                        "        }\n"
                        "        return union;\n"
                        "    }\n"
                        "    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {\n"
                        "        ArrayList<Integer> res = new ArrayList<>();\n"
                        "        for (Integer i : a) {\n"
                        "            if (b.contains(i)) {\n"
                        "                res.add(i);\n"
                        "            }\n"
                        "        }\n"
                        "        return res;\n"
                        "    }\n"
                        "    public static ArrayList<Integer> complement(ArrayList<Integer> a) {\n"
                        "        ArrayList<Integer> res = new ArrayList<>();\n"
                        "        for (int i = 0; i < MAX; i++) {\n"
                        "            if (!a.contains(i)) {\n"
                        "                res.add(i);\n"
                        "            }\n"
                        "        }\n"
                        "        return res;\n"
                        "    }\n"
                        "    public static int cardinality(ArrayList<Integer> a) {\n"
                        "        return a.size();\n"
                        "    }\n"
                        "    public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b) {\n"
                        "        return cardinality(union(a, b));\n"
                        "    }\n"
                        "}\n\n"
                        "Exercise {i} from the task:\n\n{exercise}\n\n"
                        "Please provide the complete solution code.\n"
                        "Ensure that each class is saved in its own appropriately named file, and that there are no 'leftover' initializers or class definitions from subsequent files.\n"
                        "Ensure all imports, public classes, and everything related to the class is included in the appropriate file.\n"
                        "Write NO TEXT beyond the code itself, whatsoever."
                    )
                }
            ]

            # Call OpenAI API to generate the solution
            solution_content = generate_with_retries(client, messages, max_retries=3)
            if solution_content is None:
                print(f"Error: Failed to generate solution for exercise {i} after multiple retries.")
                continue

            # Save the solution code to .hidden_tasks
            solution_file_name = f"Exercise_{i}_Solution.java"
            hidden_tasks_dir = ".hidden_tasks"
            os.makedirs(hidden_tasks_dir, exist_ok=True)
            solution_file_path = os.path.join(hidden_tasks_dir, solution_file_name)

            with open(solution_file_path, "w") as file:
                file.write(solution_content)

            # Add the solution file to git
            subprocess.run(["git", "add", solution_file_path], check=True)

    # Commit and push changes
    commit_and_push_changes(branch_name, "Add solutions to exercises")

def split_task_into_exercises(task_content):
    # This function splits the task content into separate exercises
    # For simplicity, let's assume that each exercise starts with '#### Exercise'
    exercises = []
    lines = task_content.split('\n')
    current_exercise = []
    in_exercise = False
    for line in lines:
        if line.strip().startswith('#### Exercise'):
            if current_exercise:
                exercises.append('\n'.join(current_exercise))
                current_exercise = []
            in_exercise = True
        if in_exercise:
            current_exercise.append(line)
    if current_exercise:
        exercises.append('\n'.join(current_exercise))
    return exercises

def requires_coding(exercise_text):
    # Simple heuristic to determine if an exercise requires coding
    keywords = ['Write a method', 'Implement', 'Create a class', 'Code', 'Program']
    return any(keyword.lower() in exercise_text.lower() for keyword in keywords)

def generate_with_retries(client, messages, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4o-2024-08-06",
                messages=messages
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"Error generating solution: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def checkout_branch(branch_name):
    try:
        subprocess.run(["git", "fetch"], check=True)
        subprocess.run(["git", "checkout", branch_name], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Error checking out branch {branch_name}: {e}")
        sys.exit(1)

def commit_and_push_changes(branch_name, commit_message):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "commit", "-m", commit_message], check=True)
        subprocess.run(
            ["git", "push", "--set-upstream", "origin", branch_name],
            check=True,
            env=dict(os.environ, GIT_ASKPASS='echo', GIT_USERNAME='x-access-token', GIT_PASSWORD=os.getenv('GITHUB_TOKEN'))
        )
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)

if len(sys.argv) != 3:
    print("Usage: python generate_solution.py <api_key> <branch_name>")
    sys.exit(1)

api_key = sys.argv[1]
branch_name = sys.argv[2]

main(api_key, branch_name)
