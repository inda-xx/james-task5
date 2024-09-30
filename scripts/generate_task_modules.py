import os
import sys
import subprocess
from openai import OpenAI

def main(api_key, include_modules):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Read the original task as inspiration
    original_task_path = os.path.join("tasks", "original_task.md")
    try:
        with open(original_task_path, "r") as file:
            original_task_content = file.read()
    except FileNotFoundError:
        print("Error: original_task.md file not found in 'tasks' directory.")
        sys.exit(1)

    # Read the existing task introduction
    task_file_path = os.path.join("tasks", "new_task.md")
    try:
        with open(task_file_path, "r") as file:
            task_description = file.read()
    except FileNotFoundError:
        print("Error: new_task.md file not found in 'tasks' directory.")
        sys.exit(1)

    language = os.getenv("TASK_LANGUAGE", "English")
    learning_goals = os.getenv("LEARNING_GOALS", "")

    # Parse included modules
    modules = [module.strip().lower() for module in include_modules.split(',')]

    # Generate each module based on inclusion
    generated_content = ""

    if 'preparation' in modules:
        preparation = generate_preparation(client, language, original_task_content, learning_goals)
        generated_content += "\n\n## 📝 Preparation\n\n" + preparation

    if 'learning_goals' in modules:
        learning_goals_section = generate_learning_goals(client, learning_goals, language, original_task_content)
        generated_content += "\n\n## ✅ Learning Goals\n\n" + learning_goals_section

    if 'assignment' in modules:
        assignment = generate_assignment(client, language, original_task_content, learning_goals)
        generated_content += "\n\n## 🏛 Assignment\n\n" + assignment

    if 'exercises' in modules:
        exercises = generate_exercises(client, language, original_task_content, learning_goals)
        for idx, exercise in enumerate(exercises, start=1):
            generated_content += f"\n\n#### Exercise {idx}\n\n" + exercise

    # Append generated content to new_task.md
    with open(task_file_path, "a") as file:
        file.write(generated_content)

    # Commit and push changes
    commit_and_push_changes(task_file_path)

def generate_preparation(client, language, original_task, learning_goals):
    prompt = (
        f"In {language}, based on the following original task description:\n\n{original_task}\n\n"
        f"List the preparation steps students should take before starting the task. "
        f"Include any necessary readings, resources, or prerequisites. "
        f"Ensure the preparation aligns with the learning goals:\n{learning_goals}."
    )
    return generate_with_retries(client, prompt)

def generate_learning_goals(client, learning_goals, language, original_task):
    prompt = (
        f"In {language}, based on the following original task description:\n\n{original_task}\n\n"
        f"Outline the learning goals for the task, focusing on:\n{learning_goals}. "
        f"Present them in a clear, bullet-point format."
    )
    return generate_with_retries(client, prompt)

def generate_assignment(client, language, original_task, learning_goals):
    prompt = (
        f"In {language}, based on the following original task description:\n\n{original_task}\n\n"
        f"Provide a detailed assignment description. "
        f"Explain what students are expected to do, including any specific requirements or guidelines. "
        f"Ensure the assignment aligns with the learning goals:\n{learning_goals}."
    )
    return generate_with_retries(client, prompt)

def generate_exercises(client, language, original_task, learning_goals):
    exercises = []
    difficulty_levels = ["easy", "medium", "hard", "harder", "hardest"]
    for idx, difficulty in enumerate(difficulty_levels, start=1):
        prompt = (
            f"In {language}, based on the following original task description and learning goals:\n\n{original_task}\n\n"
            f"Create exercise {idx} with {difficulty} difficulty. "
            f"Each exercise should build upon the previous ones and align with the learning goals:\n{learning_goals}. "
            f"Ensure the exercise is challenging and well-suited for students to deepen their understanding. "
            f"Maintain a similar structure and style to the provided examples."
        )
        exercise = generate_with_retries(client, prompt)
        exercises.append(exercise)
    return exercises

def generate_with_retries(client, prompt, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4o-2024-08-06",
                messages=[
                    {"role": "system", "content": "You are a helpful assistant specialized in generating educational content."},
                    {"role": "user", "content": prompt}
                ]
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"Error generating content: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    print("Failed to generate content after multiple retries.")
    sys.exit(1)

def commit_and_push_changes(task_file_path):
    try:
        # Configure Git locally
        subprocess.run(["git", "config", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "user.name", "GitHub Actions"], check=True)

        subprocess.run(["git", "add", task_file_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add task modules"], check=True)
        subprocess.run(["git", "push"], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)

if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Error: Missing required command line arguments 'api_key' and 'include_modules'")
        sys.exit(1)

    api_key = sys.argv[1]
    include_modules = sys.argv[2]

    main(api_key, include_modules)
