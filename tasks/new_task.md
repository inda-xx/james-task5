# 🎮 Simple Game Application: Coding Challenge

Welcome to the Simple Game Application coding challenge! In this task, you will create a basic game application that includes functionalities such as player movement, a scoring system, and enemy interactions. Along this journey, you'll deepen your understanding of arrays, the static keyword, ArrayLists, and how to combine loops and collections. Let's dive into the exercises!

## 📚 Learning Goals

1. Understanding and using `Arrays`.
2. Leveraging the `static` keyword effectively.
3. Utilizing `ArrayLists`.
4. Combining loops and collections to perform complex operations.

## 📝 Exercises Overview

This task is composed of six exercises, each designed to progressively enhance your understanding and skills.

### Exercise 1: Understanding Arrays 📋

**Objective**: Explain the differences between arrays and ArrayLists in Java.

**Description**: Provide a detailed explanation of arrays and ArrayLists with examples. Discuss their usage scenarios, benefits, and limitations.

**Instruction**: Write a short essay (200-300 words) discussing arrays and ArrayLists. Provide example code snippets illustrating basic operations such as initialization, addition, and retrieval.

---

### Exercise 2: The Role of the `static` Keyword 🔑

**Objective**: Understand and explain the purpose and use of the `static` keyword in Java.

**Description**: Explain how the `static` keyword affects field and method behavior in Java classes. Provide illustrative examples.

**Instruction**: Write an explanation (150-200 words) on the `static` keyword. Include at least two code snippets that demonstrate a static method and a static variable in action.

---

### Exercise 3: Player Movement and Arrays ⏩

**Objective**: Implement basic player movement using an array to represent the game world.

**Description**: Create a simple 10x10 grid system using a 2D array. Allow the player to move within this grid. Manages player positions and prints the grid to the console.

**Instruction**: 
- Define a 2D char array for the grid (use 'P' to denote player and '.' for empty spaces).
- Implement basic movement controls (up, down, left, right) using a `switch` statement in a loop.
- Print the grid after each move.

```java
public class GameWorld {
    public static void main(String[] args) {
        char[][] grid = new char[10][10];
        // Initialize grid and set player's starting position
        // Implement player movement
    }
}
```

---

### Exercise 4: Scoring System with ArrayLists 📈

**Objective**: Implement a scoring system that tracks the player's score using an ArrayList.

**Description**: Create a simple scoring system where each successful move adds points to the player's score. Use an `ArrayList` to store scores for each move.

**Instruction**: 
- Initialize an ArrayList to track scores.
- Implement a method `addScore(int points)` to add points.
- Display the total score and list of scores after each move.

```java
import java.util.ArrayList;

public class Scoring {
    private static ArrayList<Integer> scores = new ArrayList<>();
    
    public static void addScore(int points) {
        // Add implementation details
    }
    
    // Display total score
}
```

---

### Exercise 5: Enemy Interaction 🚫

**Objective**: Introduce enemies into your game world and manage interactions.

**Description**: Add enemies to the grid and implement collision detection. Track enemy locations using a 2D array.

**Instruction**: 
- Modify the grid to include enemies ('E').
- Implement a method to randomly generate enemy positions.
- Detect collisions and end the game if the player collides with an enemy.

```java
public class Enemies {
    private static char[][] grid = new char[10][10];
    
    public static void generateEnemies(int count) {
        // Add implementation for random enemy placement
    }
    
    // Implement collision detection
}
```

---

### Exercise 6: Advanced Game Mechanics and Collections 🎯

**Objective**: Implement advanced mechanics such as power-ups that impact player abilities.

**Description**: Add power-ups that temporarily grant abilities (e.g., invisibility to enemies). Use an `ArrayList` to manage active power-ups.

**Instruction**:
- Create a class `PowerUp` with a type and duration.
- Use an ArrayList to manage active power-ups and their effects.
- Implement methods to activate and deactivate power-ups based on duration.

```java
import java.util.ArrayList;

public class PowerUps {
    private static ArrayList<PowerUp> activePowerUps = new ArrayList<>();
    
    public static void activatePowerUp(PowerUp powerUp) {
        // Manage activation and duration
    }
    
    // Implement method to deactivate power-ups
}
```

## 🏁 Conclusion

Upon completing these exercises, you will have developed a foundational game application incorporating key programming concepts such as arrays, static methods, ArrayLists, and more. This task aims to deepen your understanding of how these concepts integrate into a complex project. Good luck, and have fun coding your game! 🎮