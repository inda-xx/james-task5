### 🎮 Simple Game Application Development Task

Welcome to your programming task, where you'll apply your knowledge of arrays, static keywords, and collections to build a simple game application. This task is designed to challenge your understanding of these concepts and to help you develop a hands-on approach to programming in Java. By completing this task, you will implement key functionalities for a game, such as player movement, scoring systems, and enemy interactions.

## Learning Goals

- Master working with `Arrays` and `ArrayLists`.
- Understand and apply the `static` keyword in your code.
- Combine loops and collections to manipulate game mechanics.

### 📝 Task Overview:

This task is divided into six exercises, each increasing in difficulty. The initial exercises focus on deepening your theoretical understanding, while the later exercises require complete practical implementations in Java.

---

### 📚 Exercises 1 & 2: Theoretical Understanding

#### Exercise 1: Understanding Arrays and ArrayLists
- **Objective**: Examine the differences and use-cases for `Arrays` and `ArrayLists` in Java.
- **Task**: Write a short essay (200-300 words) discussing:
  - How arrays and ArrayLists are declared and initialized.
  - The pros and cons of using each in a game application.
  - Provide an example of when an array might be more efficient than an ArrayList, and vice versa.

#### Exercise 2: The Static Keyword
- **Objective**: Understand the `static` keyword in Java and its use cases.
- **Task**: Answer the following questions:
  - What does the `static` keyword signify in Java?
  - Describe a scenario in a game application where a `static` method or variable might be preferred over a non-static one.

---

### 💻 Exercises 3 & 4: Practical Implementation

#### Exercise 3: Implementing Player Movement
- **Objective**: Create arrays to store player positions and commands.
- **Code Task**:
  - Define an array representing a player's position on a 10x10 grid. Initialize the player at position (0, 0).
  - Create a method `public static void movePlayer(char command)` to update the player's position based on input commands ('W', 'A', 'S', 'D').
  - Ensure the player never moves outside the grid boundaries.

```java
public static int[] playerPosition = {0, 0};

public static void movePlayer(char command) {
    switch (command) {
        case 'W': playerPosition[0] = Math.max(0, playerPosition[0] - 1); break;
        case 'A': playerPosition[1] = Math.max(0, playerPosition[1] - 1); break;
        case 'S': playerPosition[0] = Math.min(9, playerPosition[0] + 1); break;
        case 'D': playerPosition[1] = Math.min(9, playerPosition[1] + 1); break;
    }
}
```

#### Exercise 4: Scoring System with Static Variables
- **Objective**: Use static variables to track and manage player scores.
- **Code Task**:
  - Create a static `int` variable for player score.
  - Implement a method `public static void updateScore(int points)` to modify the score based on game events.
  - Provide a sample scenario where the score updates, and describe why `static` is appropriate here.

```java
public static int playerScore = 0;

public static void updateScore(int points) {
    playerScore += points;
    System.out.println("Score updated! Current Score: " + playerScore);
}
```

---

### 🚀 Exercises 5 & 6: Advanced Coding Challenges

#### Exercise 5: Enemy Interaction using ArrayLists
- **Objective**: Manage multiple enemies on the grid using an ArrayList.
- **Code Task**:
  - Use `ArrayList` to store enemy positions as integer arrays (e.g., `ArrayList<int[]>`).
  - Implement a `public static void spawnEnemy(int x, int y)` method to add new enemies to the list.
  - Develop a loop that moves each enemy towards the player, simulating simple AI behavior (e.g., if the enemy is not on the same row/column as the player, it moves one step closer in that dimension).

```java
public static ArrayList<int[]> enemies = new ArrayList<>();

public static void spawnEnemy(int x, int y) {
    int[] enemy = {x, y};
    enemies.add(enemy);
}

public static void moveEnemies() {
    for (int[] enemy : enemies) {
        if (enemy[0] < playerPosition[0]) enemy[0]++;
        if (enemy[0] > playerPosition[0]) enemy[0]--;
        if (enemy[1] < playerPosition[1]) enemy[1]++;
        if (enemy[1] > playerPosition[1]) enemy[1]--;
    }
}
```

#### Exercise 6: Complete Game Loop and Collision Detection
- **Objective**: Integrate all elements into a functioning game loop.
- **Code Task**:
  - Create a method `public static void gameLoop()` that handles player movement and enemy interactions in a continuous loop.
  - Implement collision detection to check if an enemy has reached the player. End the game on collision and display a game-over message.
  - Use loops and conditionals to maintain this functionality.

```java
public static void gameLoop() {
    // Sample Loop (extend with real conditions and input)
    while (true) {
        // Get player command (example: from console input)

        // Update player position
        movePlayer('W');  // Example player move

        // Move enemies
        moveEnemies();

        // Check for collisions
        for (int[] enemy : enemies) {
            if (enemy[0] == playerPosition[0] && enemy[1] == playerPosition[1]) {
                System.out.println("Game Over! Enemy reached you.");
                return;
            }
        }

        // Simulate game delay (e.g., Thread.sleep in real scenarios)
    }
}
```

---

### 🎉 Conclusion

By completing these exercises, you will solidify your understanding of arrays, static variables, and collections in Java. You'll gain practical experience in coding a simple but functional game application, integrating several core programming concepts. Happy coding!