## 🎮 Simple Game Application with Java

Welcome to the Simple Game Programming Task! In this assignment, you'll create a rudimentary game application where you'll apply fundamental programming concepts like arrays, the `static` keyword, and collections such as `ArrayLists`. Your game will include player movement, a scoring system, and enemy interactions. Let's enhance your skills step-by-step with the exercises below.

### 🌟 Learning Goals

1. **Working with Arrays**
2. **Understanding the `static` Keyword**
3. **Working with `ArrayLists`**
4. **Combining Loops and Collections**

---

## 📝 Exercise Descriptions

Each exercise is crafted to guide you through the process of building a simple game with Java. The tasks progressively increase in complexity to offer you a stimulating challenge and reinforce your understanding of programming concepts.

### 📚 Exercises 1 & 2: Theoretical Foundations

#### Exercise 1: Arrays and Their Use in Games

**Objective:** Understand the purpose and applications of arrays in game development.

**Task:** Explain the advantages of using arrays in managing game entities like players, enemies, or obstacles. Consider how arrays help in organizing game data and ease operations such as movement and collision detection.

**Questions:**
- Why are arrays beneficial for managing multiple game objects?
- How do arrays affect performance and memory in game applications?

#### Exercise 2: The Role of the `static` Keyword

**Objective:** Grasp the concept and usage of the `static` keyword in Java, especially in game programming.

**Task:** Discuss the implications of using the `static` keyword in a game application context. What are the advantages and potential downsides?

**Questions:**
- How does `static` affect data sharing and memory management in a game?
- Provide an example of when it might be appropriate to use `static` in managing game state or utility functions.

### 👨‍💻 Exercises 3 & 4: Coding with Concepts

#### Exercise 3: Implementing Player Movement with Arrays

**Objective:** Use arrays to handle player movement across the game grid.

**Task:** Write a method `public static void movePlayer(char[][] grid, int currentX, int currentY, char direction)` that updates the player's position in a 2D grid based on input direction ('N', 'S', 'E', 'W').

**Hints:**
- Use a 2D array to represent the game grid.
- Handle boundary conditions to prevent the player from moving outside the grid.

#### Exercise 4: Scoring System with ArrayLists

**Objective:** Use `ArrayLists` to track and update the game's scoring system.

**Task:** Implement a method `public static void updateScores(ArrayList<Integer> scores, int scoreToAdd)` to update player scores.

**Hints:**
- `ArrayList<Integer>` should dynamically store and manage score entries.
- Consider how scores can be retrieved, sorted, and displayed.

### 🔥 Exercises 5 & 6: Advanced Game Features

#### Exercise 5: Enemy Interactions Using ArrayLists

**Objective:** Combine loops and collections to manage enemy movement and interactions.

**Task:** Create a method `public static void updateEnemies(ArrayList<int[]> enemies, char[][] grid)` that moves enemies within the grid and checks for player encounters.

**Steps:**
1. Iterate over the list of enemies (each enemy is an `[x, y]` coordinate).
2. Update enemy positions based on some logic (e.g., random movement).
3. Check for collisions with the player and update game state accordingly.

#### Exercise 6: Game Loop Integration and Static Utilities

**Objective:** Integrate the game components into a coherent loop utilizing static utility functions.

**Task:** Implement a basic game loop in a `public static void runGame()` method that manages game state updates and renders the game.

**Steps:**
1. Initialize player, enemies, and scores.
2. Use static methods for player movement, enemy interactions, and score updating.
3. Implement a simple textual UI to display the grid, player, enemies, and score.

**Challenge:**
- Introduce a winning or losing condition.
- Consider random events affecting player scores or enemy behaviors.

---

### 🗒️ Submission Requirements

Ensure all exercises are complete and your code is well-documented. Each method should have comments explaining its functionality and any assumptions or decisions made during implementation.

---

### ⚠️ Important Notes

- Organize your code within classes, maintaining good object-oriented practices.
- Handle exceptions and edge cases gracefully to ensure your game runs smoothly.

---

Good luck, and have fun developing your Simple Game Application! 🌟