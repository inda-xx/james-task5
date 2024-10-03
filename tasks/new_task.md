# 🎮 Game Development Exercise: Basic Concepts in Java

Welcome to your new project where you will create a simple game application while deepening your understanding of some fundamental programming concepts in Java. This set of exercises will guide you through developing a basic game with player movement, a scoring system, and enemy interactions. Along the way, you will solidify your skills in using arrays, understanding the `static` keyword, working with `ArrayLists`, and integrating loops and collections.

## Overview

In this task, you will:

1. Understand theoretical concepts related to arrays and the `static` keyword.
2. Implement practical coding exercises focused on using arrays and `ArrayLists`.
3. Develop a simple game application that involves player movement, scoring, and enemy interactions.

## 📚 Exercises

### Exercise 1: 🚀 Theoretical Understanding of Arrays

**Objective:** Ensure a solid understanding of arrays in Java.

- **Task:** Explain how arrays work in Java, including declaration, initialization, accessing elements, and the limitations of arrays compared to `ArrayLists`.
  
- **Questions:**
  - What is an array in Java, and how do you declare it?
  - How do you choose an appropriate size for an array, and what are the consequences of choosing a size that's too small or too large?
  - Compare and contrast arrays with `ArrayLists`. Why would you choose one over the other?
  
- **Explanation:** Provide your responses in detailed paragraphs, using code snippets where helpful.

### Exercise 2: 🏷️ Understanding the `static` Keyword

**Objective:** Comprehend the use of the `static` keyword.

- **Task:** Write a comprehensive explanation on the `static` keyword in Java:
  
- **Questions:**
  - What does it mean when a method or variable is declared `static`?
  - How does Java handle `static` fields and methods, particularly regarding memory allocation?
  - Give practical examples of when and why you would use `static`.

- **Explanation:** Your answer should include code examples showcasing practical uses of `static`.

### Exercise 3: 👾 Player Movement with Arrays

**Objective:** Implement player movement using arrays.

- **Task:** Write a Java method `movePlayer` to simulate a player's movement on a grid. Use a 2D array (`char[][]`) representing a 5x5 grid and position the player as 'P'.

```java
public static void movePlayer(char[][] grid, int newX, int newY) {
    // Implement the logic to move 'P' to the new coordinates.
}
```

- **Instructions:**
  - Initialize the grid with an 'P' at position (0,0).
  - Validate the new position to ensure the player stays within bounds.
  - Update the grid with the player's new position.

### Exercise 4: 🌟 Scoring System using ArrayLists

**Objective:** Create a scoring system using `ArrayLists`.

- **Task:** Implement a scoring mechanism where players collect points. Use an `ArrayList` to store scores collected over time.

```java
public static void addScore(ArrayList<Integer> scores, int points) {
    // Add points to the scores list.
}
```

- **Instructions:**
  - Initialize an `ArrayList` to keep track of scores obtained at various game stages.
  - Implement a method that adds points to this list.
  - Use loops to iterate and calculate the total score from the list.

### Exercise 5: 🎯 Enemy Interactions and Dynamic Arrays

**Objective:** Handle dynamic interactions and new entities using arrays & `ArrayLists`.

- **Task:** Develop a method for enemy interactions. Enemies are stored in an `ArrayList`, with each enemy having a "damage" factor affecting player health.

```java
public static void interactWithEnemies(ArrayList<Integer> enemies, int playerHealth) {
    // Implement logic to apply enemy damage to playerHealth.
}
```

- **Instructions:**
  - Create three enemies, each with distinct damage values stored in an `ArrayList`.
  - Loop through the list to subtract their damage from `playerHealth`.
  - Ensure player health does not drop below zero.

### Exercise 6: 🎮 Complete Game Loop and Integration Challenge

**Objective:** Build the game loop integrating player movement, scoring, and enemy interactions.

- **Task:** Construct a simple game engine using the methods you implemented. Players should be able to move, collect points, and face enemies in a basic game loop.

```java
public static void runGame() {
    char[][] grid = new char[5][5];
    int playerHealth = 100;
    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<Integer> enemies = new ArrayList<>(Arrays.asList(10, 20, 15));

    // Simulate game loop
    movePlayer(grid, 2, 2);
    addScore(scores, 50);
    interactWithEnemies(enemies, playerHealth);
}
```

- **Instructions:**
  - Initialize game components (grid, player health, scores, and enemies).
  - Run code to simulate movements, score increments, and enemy encounters.
  - Test and debug the game loop to ensure proper integration and functionality.

## 💡 Hints & Tips:

- Think carefully about edge cases, especially with array boundaries and dynamic list resizing.
- Reflect on how each component of the game ties together conceptually.
- Testing each component thoroughly before integration will make final debugging easier.

## 🏆 Challenge Yourself

Once you have achieved the basic functionality, consider adding extra features such as power-ups, a more complex map, or additional enemy types to make the task even more challenging and rewarding.

**Good luck, and happy coding!** 🎉