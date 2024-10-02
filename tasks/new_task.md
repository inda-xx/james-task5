# 🎮 Simple Game Application Development

In this assignment, you will create a simple 2D arcade-style game application. The game will feature player movement, a scoring system, and enemy interactions. The focus is on understanding core programming concepts such as arrays, array lists, the static keyword, and combining loops and collections.

## 🎯 Learning Goals

- Working with `Arrays` and `ArrayLists`
- Understanding and utilizing the `static` keyword
- Integrating loops with collections

The task is divided into several exercises that gradually increase in complexity, building towards a complete functional game.

---

## 📝 Exercise 1: Understanding Arrays and ArrayLists

**Goal**: Explore the theoretical aspects of arrays and array lists.

**Instructions**:
1. **Conceptual Clarification**: Describe how `Arrays` and `ArrayLists` differ in Java. When would you prefer one over the other?

2. **Static Keyword**: Explain what the `static` keyword does when applied to variables and methods in Java. Why might it be useful in game development?

---

## 📝 Exercise 2: Static Elements in Game Design

**Goal**: Deepen understanding of the `static` keyword and its application in a game context.

**Instructions**:
1. **Static Key Uses**: List three uses of the `static` keyword in a game application. For example, think about game settings, scoring, or shared resources.

2. **Mutable Vs. Immutable**: Discuss the implications of mutable versus immutable static variables in the context of a game's life cycle.

---

## 💻 Exercise 3: Implementing the Player Movement

**Goal**: Apply arrays to manage player movement and game grid.

**Instructions**:
1. **Setup Grid**: Create a 2D grid (using a 2D array) to represent the game field.
   
2. **Player Movement**: Write a method to move the player across the grid. The player can move up, down, left, or right and should not be able to move outside the grid's boundaries.
   
   ```java
   public static void movePlayer(int[][] grid, int[] playerPosition, String direction)
   ```

---

## 💻 Exercise 4: Scoring System with ArrayLists

**Goal**: Utilize `ArrayLists` to manage dynamic data in the scoring system.

**Instructions**:
1. **Score Tracking**: Create an `ArrayList` to track the player's score over multiple rounds.
   
2. **Update Score**: Implement a function to update the score each time the player collects a 'coin' on the grid.
   
   ```java
   public static void updateScore(ArrayList<Integer> scores, int points)
   ```

---

## 🚀 Exercise 5: Adding Enemy Interactions

**Goal**: Combine loops and collections to add enemy elements to the game.

**Instructions**:
1. **Enemy Creation**: Place enemies randomly on the grid. Use `ArrayLists` to keep track of enemy positions.
   
2. **Enemy Interaction**: Implement logic to handle player-enemy interactions. If a player moves to an enemy-occupied tile, the game should deduct points from the score.

   ```java
   public void handleEnemyCollision(ArrayList<int[]> enemies, int[] playerPosition, ArrayList<Integer> scores)
   ```

---

## 🚀 Exercise 6: Completing the Game Logic

**Goal**: Integrate all components and complete the game logic.

**Instructions**:
1. **Game Loop**: Create a main game loop that only ends when the player decides to quit. The loop should handle player movement, score updates, and enemy interactions.

   ```java
   public static void gameLoop()
   ```

2. **Display Status**: Develop a method to display the current grid state, player position, and score after each move.

   ```java
   public static void displayGameState(int[][] grid, int[] playerPosition, int score)
   ```

---

## 💡 Final Checklist
- Ensure that all components (player movement, scoring, enemy interactions) function together seamlessly.
- Review and test each method thoroughly to handle all edge cases.
- Optimize and refactor code where possible to improve performance and readability.

By completing these exercises, you'll emerge with a nuanced understanding of arrays, static variables, and collections, which are essential in handling complex game logic. This foundation will be invaluable as you progress in game development and software design.

Happy Coding! 🎉