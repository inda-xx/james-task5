# 🎮 Simple Game Application: Player Movement and Scoring System

Welcome to this programming task, where you will create a simple game application focused on player movement, scoring system, and interactions with enemies. The exercises are designed to guide you through understanding and applying fundamental programming concepts, including working with Arrays, understanding the static keyword, using ArrayLists, and combining loops and collections. As you progress, the exercises will increase in complexity and challenge.

## Learning Goals

- Gain proficiency in utilizing arrays for data storage.
- Understand and apply the `static` keyword in Java.
- Manipulate collections using `ArrayList`.
- Combine loops and collections effectively.

## Exercise Overview

### Theoretical Exercises

#### 🚀 Exercise 1: Basics of Arrays and `static` Keyword

**Objective:** Deepen your understanding of arrays and the `static` keyword through theoretical exploration.

- **Question 1:** Discuss the differences between arrays and other collection types in Java, highlighting use-cases for when arrays are preferred.
- **Question 2:** Explain the `static` keyword and how it affects the state and behavior of variables and methods in a class. Provide examples of practical scenarios where using `static` is beneficial.

#### 🔍 Exercise 2: Deep Dive into `ArrayList`

**Objective:** Explore `ArrayList` and its advantages over arrays.

- **Question 1:** Compare and contrast `ArrayList` with arrays, focusing on dynamic sizing and flexibility. Discuss situations where `ArrayList` would be more appropriate than arrays.
- **Question 2:** Examine how iteration over `ArrayList` differs from arrays and how collections and loops can be combined to solve problems efficiently.

### Practical Implementation

#### 🧑‍💻 Exercise 3: Implementing Player Movement

**Objective:** Write code that manages player movement using arrays.

- **Task:** Create a `Player` class with a position tracked by an array. Implement methods to move the player in four directions (up, down, left, right).
  
```java
public class Player {
    private int[] position = {0, 0}; // Starting at origin (0, 0)

    public void moveUp() { position[1]++; }
    public void moveDown() { position[1]--; }
    public void moveLeft() { position[0]--; }
    public void moveRight() { position[0]++; }

    // Additional methods to print the player's position
}
```

#### 📈 Exercise 4: Dynamic Scoring System with ArrayList

**Objective:** Develop a scoring system that uses `ArrayList` to track scores dynamically.

- **Task:** Implement a `ScoreManager` class using `ArrayList` to keep track of scores earned during gameplay. Include methods to add a score, get the average score, and display all scores.

```java
import java.util.ArrayList;

public class ScoreManager {
    private ArrayList<Integer> scores = new ArrayList<>();

    public void addScore(int score) {
        scores.add(score);
    }

    public double getAverageScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return scores.isEmpty() ? 0 : (double) total / scores.size();
    }

    public void displayScores() {
        System.out.println("Scores: " + scores.toString());
    }
}
```

### Challenging Coding Tasks

#### 🎯 Exercise 5: Enemy Interactions and Collisions

**Objective:** Create a system to manage enemy interactions and detect player collisions using both arrays and `ArrayList`.

**Step-by-step Tasks:**

1. **Create Enemies:** Define an `Enemy` class. Use an array or `ArrayList` to store multiple enemies within the game world.
2. **Handle Collisions:** Write a method to check if a player's position array collides with any enemy position.
3. **Implementing Logic:** When a collision is detected, reduce the player's score via the `ScoreManager` class, and remove the enemy from the list.

```java
import java.util.ArrayList;

public class EnemyManager {
    private ArrayList<int[]> enemies = new ArrayList<>();

    public void addEnemy(int x, int y) {
        enemies.add(new int[]{x, y});
    }

    public boolean checkCollision(Player player) {
        int[] playerPos = player.getPosition();
        for (int[] enemy : enemies) {
            if (enemy[0] == playerPos[0] && enemy[1] == playerPos[1]) {
                enemies.remove(enemy);
                return true;
            }
        }
        return false;
    }
}
```

4. **Integrate:** Use loops to continuously move the player and check for collisions with enemies as part of the game loop.

#### 🔄 Exercise 6: Game Loop Integration and Enhancements

**Objective:** Complete the game loop, integrating all components developed earlier.

**Step-by-step Tasks:**

1. **Create a GameLoop class:** Manage the game state, allowing continuous player movement and interaction detection with enemies.
2. **Score Deduction:** Deduct player score on collision using ScoreManager integrated into the game loop.
3. **Display Game State:** Print player position, scores, and game states after each loop iteration.

```java
public class GameLoop {
    private Player player;
    private EnemyManager enemyManager;
    private ScoreManager scoreManager;

    public GameLoop() {
        player = new Player();
        enemyManager = new EnemyManager();
        scoreManager = new ScoreManager();
        // Initialize enemies and scores
    }

    public void start() {
        while (true) { // Simplified game loop
            // player.move...
            if (enemyManager.checkCollision(player)) {
                scoreManager.addScore(-10); // Deduct points on collision
            }
            // Display game state...
        }
    }
}
```

With these exercises complete, you will have created a simple but functional game application that utilizes arrays and `ArrayList`, understands the `static` keyword, and effectively combines loops and collections. Happy coding! 🎉