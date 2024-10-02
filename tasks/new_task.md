# 🎮 Simple Game Application Development

Welcome to this task where you will create a simple game application! This game will involve player movement, a scoring system, and enemy interactions. Through this task, you will achieve the following learning goals:

- Master the usage of `Arrays`
- Understand the `static` keyword
- Work with `ArrayLists`
- Combine loops and collections

This task is broken into exercises that gradually increase in complexity, designed to enhance your understanding of key programming concepts as applied to game development.

## 💡 Exercise 1: Theoretical Understanding of Arrays and ArrayLists

**Objective:** To grasp the functional differences and similarities between `Arrays` and `ArrayLists`.

**Instructions:**  
1. Explain the differences between `Arrays` and `ArrayLists` in a few paragraphs. Include concepts like fixed vs. dynamic sizing and type restrictions.
2. Discuss when you would choose one over the other in game development scenarios, citing examples from games you know or have played.

---

## 💡 Exercise 2: The Static Keyword

**Objective:** To comprehend the role and usage of the `static` keyword in Java.

**Instructions:**  
1. Write a brief explanation of the `static` keyword in Java. Include its implications on method and variable sharing across object instances.
2. Provide examples where `static` might be useful in game development, such as in maintaining a global score or game settings.

---

## 🖥️ Exercise 3: Implementing Player Movement with Arrays

**Objective:** To apply your knowledge of `Arrays` by implementing a simple movement system.

**Instructions:**  
1. Create a `Player` class with an `int[] position` to represent its x and y coordinates in a 2D grid.
2. Write methods `moveUp()`, `moveDown()`, `moveLeft()`, and `moveRight()` to update the player's position.
3. Demonstrate the movement with a simple `main` method that moves the player around and prints the position after each move.

Example code snippet:
```java
public class Player {
    private int[] position = {0, 0};

    public void moveUp() { position[1]--; }
    public void moveDown() { position[1]++; }
    public void moveLeft() { position[0]--; }
    public void moveRight() { position[0]++; }
}
```

---

## 🖥️ Exercise 4: Dynamic Scoring System with ArrayLists

**Objective:** To work with `ArrayLists` and understand dynamic data structures by implementing a scoring system.

**Instructions:**  
1. Create a `Score` class with an `ArrayList<Integer>` to store points collected during the game.
2. Implement methods to add new scores, remove specific scores, and calculate the total score.
3. Demonstrate with a `main` method that adds scores, displays them, and shows the total score.

Example code snippet:
```java
import java.util.ArrayList;

public class Score {
    private ArrayList<Integer> scores = new ArrayList<>();

    public void addScore(int score) { scores.add(score); }
    public void removeScore(int score) { scores.remove((Integer) score); }
    public int totalScore() { return scores.stream().mapToInt(Integer::intValue).sum(); }
}
```

---

## 🚀 Exercise 5: Enemy Interaction Using Loops and Arrays

**Objective:** To implement basic enemy interactions using loops to modify arrays.

**Instructions:**  
1. Create an `Enemy` class storing multiple enemies' positions using a 2D `int[][]` array.
2. Implement a method that updates all enemies' positions based on a logic, using loops.
3. Write a `main` method that initializes enemies and simulates their movement multiple times, printing their positions.

Example code snippet:
```java
public class Enemy {
    private int[][] positions = {{1, 2}, {3, 4}, {5, 6}};

    public void moveEnemies() {
        for (int[] position : positions) {
            position[0] += 1; // Move right
            position[1] -= 1; // Move up
        }
    }
}
```

---

## 🚀 Exercise 6: Complete the Game with Static Methods and ArrayLists

**Objective:** To combine static methods and dynamic collections to finalize a simple game loop.

**Instructions:**  
1. Create a `Game` class with a static `main` method to tie together player movement, scoring, and enemy interactions.
2. Utilize static methods to encapsulate game logic, like updating positions and checking collisions.
3. Implement a simple game loop that calls these methods to simulate a game where a player earns points and avoids or confronts enemies.

Example code snippet:
```java
public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Score score = new Score();
        Enemy enemies = new Enemy();
        
        // Main game loop
        for (int i = 0; i < 10; i++) {
            player.moveRight();
            score.addScore(10);
            enemies.moveEnemies();
            
            // Logic for collision detection and score update
            // Print status
        }
    }
}
```

---

**🎉 Congratulations!** By completing these exercises, you've integrated several core concepts into a cohesive game application. These skills form the backbone of many gaming frameworks and set a strong foundation for more advanced game development projects. Keep experimenting and expanding on this project to add more features and complexity!