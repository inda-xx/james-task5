## 🎮 Simple Game Application: Player Movement and Interactions

### Overview
In this task, you'll develop a simple game application focusing on key programming concepts. The game will involve player movement, a scoring system, and enemy interactions. Throughout this task, essential programming skills related to arrays, the `static` keyword, and collections like `ArrayList` will be emphasized. You'll progressively integrate these concepts through a series of exercises, culminating in a working game prototype.

### Learning Goals
- Mastery of `Arrays` and `ArrayLists`
- Understanding and application of the `static` keyword
- Skillful use of loops in combination with collections

---

### 🧠 Exercise 1: Theory of Arrays and Collections

🔍 **Objective**: Understand the difference between `Arrays` and `ArrayLists`, and their use cases.

**Instructions**: 
1. Describe the primary differences between `Arrays` and `ArrayLists`. Provide examples of scenarios where each would be preferred.
2. Explain the memory management aspects of `Arrays` and `ArrayLists`. How do their internal structures impact performance and usage?
   
✏️ **Submission**: Provide a concise two-paragraph explanation for each point.

---

### 🧠 Exercise 2: Deciphering the `static` Keyword

🔍 **Objective**: Grasp the concepts and implications of the `static` keyword in Java.

**Instructions**:
1. Explain how the `static` keyword affects variables and methods. Include an example of a static method and a static variable, describing their roles in the context of a game.
2. Discuss the advantages and drawbacks of using static methods and variables in game design, particularly in player or scoring systems.

✏️ **Submission**: Write a short essay (200-300 words) on static use cases in game programming.

---

### 💻 Exercise 3: Implementing Basic Player Movement

🔍 **Objective**: Use arrays to manage and update player movement within a game grid.

**Instructions**:
1. Create an `int` array to represent a 2D grid (e.g., 10x10). Each element should hold a value indicating whether the space is occupied by the player (`1` as occupied, `0` as empty).
2. Implement a method `movePlayer(int[] grid, int direction)` where `direction` indicates movement (e.g., `0` for up, `1` for right, etc.). Update the player's position within the array.

```java
public static void movePlayer(int[] grid, int direction) {
    // Implement logic to move the player within the grid based on direction
}
```
**Submission**: Submit your implementation of the `movePlayer` function with test cases demonstrating functionality.

---

### 💻 Exercise 4: Developing a Scoring System Using `ArrayList`

🔍 **Objective**: Manage a dynamic scoring system using `ArrayLists`.

**Instructions**:
1. Design an `ArrayList<Integer>` to hold scores achieved during the game.
2. Implement methods `addScore(int score)` and `averageScore()` to manage and compute the average of scores in the list.

```java
public class ScoringSystem {
    private static ArrayList<Integer> scores = new ArrayList<>();

    public static void addScore(int score) {
        // Add score to the ArrayList
    }

    public static double averageScore() {
        // Calculate and return the average score
    }
}
```

**Submission**: Provide your `ScoringSystem` class with methods implemented and tested.

---

### 🚀 Exercise 5: Enemy Interactions – The Game Logic

🔍 **Objective**: Integrate player movement and scoring into a simple game loop with enemy interactions.

**Instructions**:
1. Create a game loop combining player movement and enemy interactions. Use an array to represent enemy positions.
2. Each time a player moves, determine interactions with enemies:
   - If the player encounters an enemy, deduct points.
   - If the player avoids enemies successfully for a round, add points.

```java
public class Game {
    private static int[] grid = new int[100]; // 10x10 grid
    private static ArrayList<Integer> scores = new ArrayList<>();
    
    public static void gameLoop() {
        // Implement game loop logic
    }
}
```

**Submission**: Submit a complete, functional game with documented logic.

---

### 🎯 Exercise 6: Challenge – Enhancements and Features

🔍 **Objective**: Enhance your game with additional features and complexity.

**Instructions**:
1. Introduce new features like power-ups that affect player score or ability to move across dangerous grid sections.
2. Implement game-win and game-over conditions based on player score and remaining grid spaces.
3. Consider using static methods to manage global game state, like a high score.

**Submission**: Provide a video demonstration of your enhanced game, with explanations of the new features and code snippets highlighting major enhancements.

---

### ✅ Checklist Before Submission
- [ ] Exercises 1 & 2: Essay responses covering arrays, collections, and `static` keyword usage.
- [ ] Exercise 3: Player movement implemented in a grid.
- [ ] Exercise 4: Scoring system with `ArrayList`, including tests.
- [ ] Exercise 5: Working game loop with enemy interactions.
- [ ] Exercise 6: Completed and enhanced game with additional features and conditions.

📤 **Submit** all code files and supporting documents as a compressed archive to your assigned submission portal. Ensure code readability with comments explaining key sections.

### 🌟 Have fun! We look forward to seeing your creative solutions! 🌟