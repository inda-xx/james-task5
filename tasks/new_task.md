# 🎮 Game Development Task: Building A Basic Game with Player and Enemy Interactions

Welcome to the exciting task of building a simple game application! This task is designed to help you solidify your understanding of object-oriented programming concepts, collections, and static methods in Java. You'll create a game featuring a player, enemies, and interactions, including a scoring system. By the end of this task, you'll have a functional game with basic mechanics and a vast improvement in managing data structures. Let's dive into the exercises!

## 📚 Learning Goals

- Mastery of `Arrays` and `ArrayLists`
- Understanding and application of the `static` keyword
- Combining loops with collections for effective data management

## 🧩 Task Overview

You will progressively build a simple game application by completing the exercises below. Each exercise will focus on a different aspect of game development and programming concepts. You will conceptualize, plan, and code sections of the game in a gradual and structured manner.

---

## 🏫 Exercise 1: Understanding Arrays

**Objective:** Gain a theoretical understanding of arrays and their use in game development.

**Instructions:**

1. **What is an Array?** Explain in your own words what an array is and how it can be used to store player positions in a game. Discuss its limitations and advantages over other data structures.

2. **Array vs. ArrayList:** Compare arrays and `ArrayList` in Java. When would you use one over the other in the context of a game application?

**Expected Outcomes:**

- A clear description of arrays and an understanding of their role in games.
- Insight into the choice between arrays and `ArrayList` for dynamic vs. static data structures.

---

## 🏫 Exercise 2: The Static Keyword

**Objective:** Understand the role and utility of the `static` keyword in Java programs.

**Instructions:**

1. **Static Context:** Explain what the `static` keyword does in Java and how it can be relevant in game development, particularly for managing game states and constants.

2. **Benefits and Risks:** Discuss the benefits and potential risks of using static variables and methods. How can they simplify game logic, and what pitfalls should you be aware of?

**Expected Outcomes:**

- A solid understanding of how and why to use static features in a program.
- Awareness of best practices and common pitfalls in utilizing static attributes.

---

## 🔧 Exercise 3: Player Movement with Arrays

**Objective:** Implement a simple array-based system to track and update player positions.

**Instructions:**

1. **Setup an Array:** Initialize an array to represent the player’s position on a simple grid-based map, such as a 5x5 grid.

2. **Move the Player:** Write a method to update the player’s position within the grid when given directional input (`up`, `down`, `left`, `right`). Ensure the player does not move out of bounds.

```java
public static void movePlayer(int[] position, String direction) {
    // Implement movement logic
}
```

**Expected Outcomes:**

- A functional method that modifies the player's position based on direction, maintaining grid boundaries.
- Practical application of array manipulation in a game context.

---

## 🔧 Exercise 4: Scoring System with ArrayLists

**Objective:** Develop a scoring system for your game using `ArrayLists`.

**Instructions:**

1. **Track Scores:** Create an `ArrayList` to store scores. Implement methods to add a score, calculate the average score, and find the highest score.

```java
public static void addScore(ArrayList<Integer> scores, int score) {
    // Add score to list
}

public static int calculateAverage(ArrayList<Integer> scores) {
    // Calculate average score
}

public static int findHighestScore(ArrayList<Integer> scores) {
    // Find highest score
}
```

2. **Display Scores:** Write a method to print all scores and their statistics.

**Expected Outcomes:**

- Success in building a flexible system that stores and analyzes game scores.
- Enhanced ability to work with `ArrayLists` and manipulate data effectively.

---

## 🚀 Exercise 5: Implementing Enemy Interactions

**Objective:** Create interactions between the player and enemies using loops and data structures.

**Instructions:**

1. **Enemy Positions:** Use an `ArrayList` to store multiple enemy positions on the grid.

2. **Detect Collisions:** Implement a method to check if the player's new position collides with any enemy position.

```java
public static boolean checkCollision(int[] playerPosition, ArrayList<int[]> enemyPositions) {
    // Implement collision detection
}
```

3. **Response to Collision:** Create a method to respond (e.g., reduce player health or reset position) when a collision is detected.

**Expected Outcomes:**

- Competence in checking conditions within loops and using data structures to handle game state.
- Ability to combine different data management techniques to achieve game objectives.

---

## 🚀 Exercise 6: Putting It All Together – Create a Playable Game

**Objective:** Combine all elements to create a basic playable game.

**Instructions:**

1. **Integrate Components:** Use all previously coded methods and logic to build a game with player movement, scoring, and enemy interaction.

2. **Game Loop:** Implement a simple game loop that allows the player to move, avoid enemies, and collect scores until a win/lose condition is met.

```java
public static void runGame() {
    // Use a loop to run the game
}
```

3. **Player Feedback:** Write methods to provide feedback on game actions and display the score at the end of the game.

**Expected Outcomes:**

- Complete a functioning game with core mechanics, demonstrating significant programming effort and integration of learned concepts.
- Develop problem-solving skills and understanding of combining loops and collections in a real-world application.

---

Congratulations! You've completed all exercises and built a foundational game! 🎉 These skills are not only crucial for game development but are also widely applicable in different programming contexts. Keep experimenting with your game, adding new features or refining existing ones to further enhance your skills. Happy coding!