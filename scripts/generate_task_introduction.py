import os
import sys
import subprocess
from openai import OpenAI
import pytz
from pytz import timezone

def main(api_key):
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

    # Define learning goals directly within the script
    learning_goals = [
        "Understanding arrays",
        "Working with loops",
        "Understanding the `static` keyword",
        "Working with `ArrayLists`",
        "Combining loops and collections"
        # Add more learning goals as needed
    ]

    # Generate task introduction
    introduction = generate_introduction(client, learning_goals, original_task_content)

    # Append introduction to new_task.md
    with open(task_file_path, "a") as file:
        file.write("\n\n# Task Introduction\n\n" + introduction)

    # Commit and push changes
    commit_and_push_changes(task_file_path)

    # Output the branch name for the next job
    branch_name = get_current_branch()
    print(f"::set-output name=branch_name::{branch_name}")

def generate_introduction(client, learning_goals, original_task):
    prompt = (
        f"In English, based on the following original task description:\n\n{original_task}\n\n"
        f"Create an engaging introduction for a programming task. "
        f"Include a brief overview of the task's purpose and how it relates to the learning goals:\n"
    )
    for goal in learning_goals:
        prompt += f"- {goal}\n"

    prompt += "Keep the introduction concise and focused on programming concepts."

    return generate_with_retries(client, prompt)

def generate_with_retries(client, prompt, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4o-2024-08-06",
                messages=[
                    {"role": "system", "content": "You are a helpful assistant specialized in generating concise programming educational content."},
                    {"role": "user", "content": prompt}
                ],
                temperature=0.5,  # Lower temperature for more deterministic output
                max_tokens=300  # Adjust as needed
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"Error generating introduction: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    print("Failed to generate introduction after multiple retries.")
    sys.exit(1)

def commit_and_push_changes(task_file_path):
    try:
        # Configure Git locally
        subprocess.run(["git", "config", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "user.name", "GitHub Actions"], check=True)

        subprocess.run(["git", "add", task_file_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add task introduction"], check=True)
        subprocess.run(["git", "push"], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)

def get_current_branch():
    try:
        result = subprocess.run(["git", "rev-parse", "--abbrev-ref", "HEAD"], capture_output=True, text=True, check=True)
        return result.stdout.strip()
    except subprocess.CalledProcessError as e:
        print(f"Error retrieving current branch: {e}")
        sys.exit(1)

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Error: Missing required command line argument 'api_key'")
        sys.exit(1)

    api_key = sys.argv[1]

    main(api_key)
