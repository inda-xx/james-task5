# 🎮 Simple Game Development Task: Basic Mechanics in Java

Welcome to the exciting world of game development! In this project, you will build a simple game application where you'll manage player movement, keep track of scores, and handle enemy interactions. Throughout this journey, you'll integrate fundamental programming concepts such as arrays, `static` keywords, `ArrayLists`, loops, and collections in Java.

## 📋 Task Overview

Your goal is to create a basic console-based game using Java. The game will feature a player who can move around a grid, a scoring system, and enemy interactions. Below are exercises that will guide you step-by-step in implementing these functionalities. Start by focusing on theoretical concepts, and then move on to practical coding exercises.

## 📝 Exercise 1: Understanding Arrays and the `static` Keyword

**Objective**: Strengthen your understanding of arrays and the `static` keyword.

- **Question 1**: Explain the concept of arrays in Java. How do they differ from `ArrayList`?
- **Question 2**: What is the `static` keyword in Java? Provide examples of when and why you'd use it.

No coding is required for this exercise. Reflect deeply on these concepts as they lay the foundation for the coding exercises.

## 📝 Exercise 2: Exploring ArrayLists and Loops

**Objective**: Deepen your grasp of `ArrayList` and loop integration.

- **Question 1**: Compare the use of arrays and `ArrayLists` in Java. What are the advantages of using an `ArrayList` over an array?
- **Question 2**: Explain how loops can be used to efficiently manipulate data stored within an `ArrayList`.

This conceptual groundwork will be vital when implementing the game's dynamic features.

## 👩‍💻 Exercise 3: Implementing Player Movement on a Grid

**Objective**: Use arrays and loops to manage player movement.

Create a class called `Game` with a `static` 2D array representing the game grid (e.g., a 5x5 grid). Implement methods to move a player (represented by a 'P' character) around the grid:

```java
public static void movePlayer(char[][] grid, String direction);
```

- "up", "down", "left", and "right" will move the player if the move is within the grid bounds.
- Print the grid after each move to show the player's position.

## 👩‍💻 Exercise 4: Scoring System Using Arrays

**Objective**: Implement a scoring system using arrays.

Create another `static` method to collect items on the grid. Each time the player moves onto an item, increment the score using a scoring array.

```java
public static void updateScore(char[][] grid, int[] score);
```

- The grid should randomly place collectible items ('C'), incrementing the score when collected.
- Use an array to keep track of scores, where each element represents points from different item types if applicable.

## 🚀 Exercise 5: Handling Enemies with ArrayLists

**Objective**: Use `ArrayList` and loops to manage enemy positions and interactions.

Enhance the game by adding enemies represented by 'E' on the grid. Use an `ArrayList` to store enemy positions and implement interactions:

```java
public static void handleEnemies(char[][] grid, ArrayList<int[]> enemies);
```

- Implement logic to randomly move enemies each turn.
- Handle interactions when a player moves onto an enemy. Decrement the player's life or end the game.

## 🚀 Exercise 6: Bringing It All Together

**Objective**: Combine all components to create a cohesive game.

Integrate player movement, scoring, and enemy interactions into a main loop, allowing gameplay to reset or end based on conditions.

- Manage game state using a game loop that updates the player position, checks for collisions, and prints the game state.
- Implement a method to reset the game when it ends, keeping track of total games played and total scores using arrays.

**Main Method Example:**

```java
public static void main(String[] args) {
    char[][] grid = new char[5][5];
    // Initialize grid, player, items, and enemies
    gameLoop(grid);
}
```

## 💡 Additional Challenge

Introduce a feature where new collectible types grant special abilities, such as temporarily disabling enemies. Use `static` methods and properties to manage these powers.

### 📣 Final Notes

This task not only challenges your coding skills but also encourages you to think critically about game logic and design. Ensure your code is well-commented and follows best practices.

Happy coding and enjoy building your game! 🎉