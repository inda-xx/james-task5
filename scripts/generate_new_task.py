import os
import sys
import subprocess
from openai import OpenAI

def main(api_key):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Embed learning goals directly within the script
    learning_goals = [
        "Understanding arrays",
        "Working with loops",
        "Understanding the `static` keyword",
        "Working with `ArrayLists`",
        "Combining loops and collections"
        # Add more learning goals as needed
    ]

    # Retrieve environment variables
    theme = os.getenv("THEME", "Default Theme")
    difficulty = os.getenv("DIFFICULTY", "medium")
    language = os.getenv("LANGUAGE", "English")

    # Generate each section
    introduction = generate_introduction(client, theme, difficulty, language, learning_goals)
    preparation = generate_preparation(client, theme, language, learning_goals)
    learning_goals_section = generate_learning_goals_section(client, theme, language, learning_goals)
    assignment = generate_assignment(client, theme, language, learning_goals)
    exercises = generate_exercises(client, theme, language, learning_goals, difficulty)

    # Assemble the final markdown content
    final_content = f"# {theme}\n\n"
    final_content += f"{introduction}\n\n"
    final_content += f"### 📝 Preparation\n\n{preparation}\n\n"
    final_content += f"### ✅ Learning Goals\n\n{learning_goals_section}\n\n"
    final_content += f"### 🏛 Assignment\n\n{assignment}\n\n"
    final_content += exercises
    final_content += "\n### ❎ Checklist\n"
    final_content += "- [ ] Complete all exercises.\n\n"
    final_content += "### 🐞 Bugs and errors?\n"
    final_content += "If you find any inconsistencies or errors in this exercise, please open a [New Issue](#) with the title \"Task Error: *summary of error here*\".\n\n"
    final_content += "### 🙏 Acknowledgment\n"
    final_content += "This task was auto-generated based on your theme and the course's learning goals.\n"

    # Write to new_task.md
    output_path = os.path.join("tasks", "new_task.md")
    with open(output_path, "w") as file:
        file.write(final_content)

    print("new_task.md has been generated successfully.")

def generate_introduction(client, theme, difficulty, language, learning_goals):
    prompt = (
        f"In {language}, create an engaging introduction for a programming task based on the following theme and difficulty:\n"
        f"Theme: {theme}\n"
        f"Difficulty: {difficulty}\n"
        f"Learning Goals:\n"
    )
    for goal in learning_goals:
        prompt += f"- {goal}\n"
    prompt += (
        "The introduction should explain the context and objectives of the task, highlighting how it relates to the learning goals. "
        "Keep it concise and focused on programming concepts."
    )

    return generate_with_retries(client, prompt)

def generate_preparation(client, theme, language, learning_goals):
    prompt = (
        f"In {language}, list the preparation steps students should take before starting the programming task based on the theme:\n"
        f"Theme: {theme}\n"
        f"Ensure the preparation aligns with the following learning goals:\n"
    )
    for goal in learning_goals:
        prompt += f"- {goal}\n"
    prompt += "Provide concise bullet points without extended explanations."

    return generate_with_retries(client, prompt)

def generate_learning_goals_section(client, theme, language, learning_goals):
    # Since learning goals are predefined, we can format them directly
    learning_goals_formatted = ""
    for goal in learning_goals:
        learning_goals_formatted += f"* **{goal}**\n"

    return learning_goals_formatted

def generate_assignment(client, theme, language, learning_goals):
    prompt = (
        f"In {language}, provide a detailed 'Assignment' section for a programming task based on the following theme:\n"
        f"Theme: {theme}\n"
        f"Explain what students are expected to do, including specific requirements or guidelines. "
        f"Ensure the assignment aligns with the following learning goals:\n"
    )
    for goal in learning_goals:
        prompt += f"- {goal}\n"
    prompt += "Keep the instructions clear and focused on programming tasks without unnecessary theoretical elaboration."

    return generate_with_retries(client, prompt)

def generate_exercises(client, theme, language, learning_goals, difficulty):
    exercises = ""
    num_exercises = 5  # Adjust as needed
    difficulty_levels = {
        "easy": ["easy", "easy", "medium", "medium", "hard"],
        "medium": ["medium", "medium", "hard", "hard", "hard"],
        "hard": ["hard", "hard", "hard", "very hard", "expert"]
    }
    selected_difficulties = difficulty_levels.get(difficulty.lower(), ["medium"] * num_exercises)

    for idx in range(1, num_exercises + 1):
        exercise_difficulty = selected_difficulties[idx - 1]
        prompt = (
            f"In {language}, create Exercise {idx} for a programming task based on the following theme and difficulty:\n"
            f"Theme: {theme}\n"
            f"Difficulty: {exercise_difficulty}\n"
            f"Each exercise should build upon the previous ones and align with the following learning goals:\n"
        )
        for goal in learning_goals:
            prompt += f"- {goal}\n"
        prompt += (
            "Ensure the exercise is challenging and helps students deepen their understanding. "
            "Provide a clear problem statement and any necessary code snippets or examples."
        )

        exercise_content = generate_with_retries(client, prompt)

        # Format the exercise in Markdown
        exercises += f"#### Exercise {idx}\n\n{exercise_content.strip()}\n\n"

    return exercises

def generate_with_retries(client, prompt, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4o-2024-08-06",
                messages=[
                    {"role": "system", "content": "You are an assistant that helps generate programming tasks for students, focusing on integrating provided themes with specified learning goals."},
                    {"role": "user", "content": prompt}
                ],
                temperature=0.5,  # Adjust as needed
                max_tokens=500  # Adjust as needed
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"Error generating content: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    print("Failed to generate content after multiple retries.")
    sys.exit(1)

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Error: Missing required command line argument 'api_key'")
        sys.exit(1)

    api_key = sys.argv[1]

    main(api_key)
