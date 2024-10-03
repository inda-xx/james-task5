# 🎮 Build a Basic Game Application: Player Adventure

Welcome to your journey of creating a basic game application with functionalities including player movement, scoring system, and enemy interactions. This task is designed to hone your skills in working with arrays, understanding the static keyword, and using ArrayLists while combining loops and collections. 

---

## 🏁 Learning Goals

- Mastery over using `Arrays` in Java
- Understanding and applying the `static` keyword
- Effectively utilizing `ArrayLists`
- Skillfully combining loops and collections

---

## 📚 Task Overview

You will create a simple console-based game where a player can navigate a grid, collect points, and avoid enemies. The exercises are divided into theoretical and practical coding tasks, progressing from foundational concepts to building the game functionalities.

---

## 📝 Exercises

### Exercise 1 & 2: Theoretical Understanding

#### Exercise 1: 📊 Arrays in Gaming

**Objective:** Deepen your understanding of arrays and how they can be applied in game development.

- **Question 1:** Explain how you would use an array to represent the game grid. Consider the size, possible elements, and their meaning (e.g., player, enemy, obstacles).
  
- **Question 2:** How do arrays facilitate efficient game state management, especially when dealing with static environments?

**Your Task:** Write a short essay (300 words max) detailing your answers. Use diagrams if necessary.

---

#### Exercise 2: 🌀 Static Keyword in Game Design

**Objective:** Grasp the implications and uses of the `static` keyword in game programming.

- **Question 1:** What are the benefits and drawbacks of using static methods and variables in a game application where multiple levels/stages might be involved?
  
- **Question 2:** Provide examples of when a method or variable should be static in the context of player data management.

**Your Task:** Discuss these questions in a report (250 words max) with code snippets as examples.

---

### Exercise 3 & 4: Theory to Practice

#### Exercise 3: 🚶 Player Movement with Arrays

**Objective:** Implement basic player movement logic using arrays.

```java
public static void movePlayer(int[][] grid, int[] playerPosition, String direction)
```

- **Instructions:** Write a method to move the player within a 2D grid based on input directions (`"up"`, `"down"`, `"left"`, `"right"`). The grid is represented as a 2D int array where `0` is empty space, `1` is the player, and `-1` is an enemy.

- **Constraints:** Ensure player cannot move outside the grid or onto tiles occupied by enemies.

**Your Task:** Implement and test this method. Ensure proper handling for edge cases such as boundaries and enemy encounters.

---

#### Exercise 4: 📊 Scoring System with Static Variables

**Objective:** Utilize static variables to manage the player’s score.

```java
public class Game {
    private static int score = 0;
    
    public static void updateScore(int points) {
        // Implement logic to add points to the score
    }
}
```

- **Instructions:** Implement the method `updateScore` to handle score adjustments when the player picks up items or defeats enemies.

- **Task:** Implement `updateScore` and demonstrate its usage within a simple main method simulating game events.

---

### Exercise 5 & 6: Create the Game Features

#### Exercise 5: 🌟 Dynamic Enemy Management using ArrayLists

**Objective:** Manage enemy spawns and interactions using dynamic collections.

```java
public class EnemyManager {
    private static ArrayList<int[]> enemies = new ArrayList<>();
    
    public static void spawnEnemy(int x, int y) {
        // Add enemy to the list
    }
    
    public static boolean detectCollision(int[] playerPosition) {
        // Implement collision detection logic
    }
}
```

- **Instructions:** 
  - Implement `spawnEnemy` to dynamically add enemy positions to the ArrayList.
  - Implement `detectCollision` to check if a player’s move results in a collision with any enemy.

**Your Task:** Write test cases that simulate enemy spawn and check collision status when player moves.

---

#### Exercise 6: 🎯 Game Loop with Integrated Components

**Objective:** Assemble all previous logic into a functioning game loop.

```java
public class Game {
    public static void main(String[] args) {
        // Initialize grid, player, and enemies
        // Implement a game loop to handle player input and update game state
    }
}
```

- **Instructions:** 
  - Set up the game grid and initialize player and enemies.
  - Implement a game loop that processes player movement, updates score, and checks for collisions.
  - Exit the loop if the player collides with an enemy or completes a defined objective (e.g., reach a score).

**Your Task:** Assemble the game components and demonstrate a working prototype. Use console inputs to simulate game interactions.

---

## 🎉 Congratulations!

Completing this task will equip you with the foundational skills needed to develop more sophisticated game applications. You’ll gain experience in managing game states using arrays, collections, and static variables, all while integrating your logic into a functional game loop.

---

## 💡 Submission Instructions

1. Ensure all code is documented with comments explaining logic and function.
2. Submit your source files and a README describing your game and instructions for execution.
3. Review the checklist before submission to ensure all parts are complete.

Good luck, and happy coding!