# Game Development Task: Basic Game Application 🎮

Welcome to this exciting task where you will create a simple 2D game application! This game will feature essential components such as player movement, a scoring system, and enemy interactions. The primary objective is not just to build an entertaining game but to deepen your understanding of fundamental programming concepts, including Arrays, ArrayLists, the `static` keyword, and the synergy between loops and collections.

## Learning Goals 📚

- Working with `Arrays` and `ArrayLists`
- Understanding the `static` keyword in Java
- Combining loops and collections for dynamic results

## Task Exercises 🏆

This task consists of six exercises, strategically structured to guide you from theoretical concepts to practical implementations. Let's dive in!

---

### Exercise 1: Understanding Arrays and `static` Keyword 🧠

**Goal:** Develop a theoretical understanding of arrays and the `static` keyword's role in Java.

**Instructions:**

1. **Explain Arrays:**
   - Define what an array is in Java.
   - Discuss the benefits and limitations of using arrays.

2. **Role of `static`:**
   - Describe what the `static` keyword does in Java.
   - Provide examples of when you would use `static` in your programs.

3. **Theoretical Question:**
   - Why might you choose an array over an ArrayList in certain scenarios?

*No coding required for this exercise, but make sure to provide detailed and thorough explanations.*

---

### Exercise 2: ArrayLists and Dynamic Collections 🌌

**Goal:** Deepen your theoretical understanding of ArrayLists and their advantages over arrays.

**Instructions:**

1. **Define ArrayLists:**
   - What is an ArrayList, and how does it differ from an array in Java?
   - Discuss scenarios where ArrayLists are more advantageous than arrays.

2. **Combining with Loops:**
   - Theoretically explain how loops can be used to dynamically modify the elements in an ArrayList.
   - Consider both adding and removing elements.

*Like the previous exercise, focus on crafting well-rounded explanations.*

---

### Exercise 3: Implementing Player Movement with Arrays 🚀

**Goal:** Use arrays to manage player positions in a 2D game grid.

**Instructions:**

1. **Create a Grid:**
   - Initialize a 2D array to represent a game grid.
   - Assume dimensions of `10x10` for simplicity.

2. **Player Positioning:**
   - Use a method with the header `public static void updatePlayerPosition(int[][] grid, int x, int y)` that updates the player's position on the grid.
   - Ensure boundaries are respected, so the player doesn't move outside the grid.

**Code Snippet:**

```java
public static void updatePlayerPosition(int[][] grid, int x, int y) {
    // Clear previous position
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            if (grid[i][j] == 1) grid[i][j] = 0;
        }
    }
    // Set new position
    if (x < grid.length && y < grid[0].length) {
        grid[x][y] = 1;
    }
}
```

*Implement the method and ensure it works as expected on a 10x10 grid.*

---

### Exercise 4: Developing a Scoring System with ArrayLists 🎯

**Goal:** Utilize ArrayLists to track and manage scores in the game.

**Instructions:**

1. **Initialize Scores:**
   - Create an ArrayList to store scores for each round of the game.
   - The ArrayList should dynamically adjust based on the number of rounds.

2. **Scoring Method:**
   - Implement a method `public static void addRoundScore(ArrayList<Integer> scores, int score)` that adds a score for a new round.
   - Ensure all new scores append to the ArrayList efficiently.

**Code Snippet:**

```java
public static void addRoundScore(ArrayList<Integer> scores, int score) {
    scores.add(score);
}
```

*Test the function by simulating score inputs for multiple rounds.*

---

### Exercise 5: Enemy Interactions with Arrays 🌟

**Goal:** Design and implement enemy behavior using arrays to enhance gameplay.

**Instructions:**

1. **Enemy Initial Positions:**
   - Populate a separate 2D array with enemy positions on the same grid.

2. **Movement Patterns:**
   - Implement a method `public static void moveEnemies(int[][] enemyGrid)` that changes enemy positions in a predetermined pattern (e.g., move all enemies one step down).

3. **Interaction Detection:**
   - Create a method `public static boolean isPlayerCaught(int[][] grid, int[][] enemyGrid)` that checks if the player is caught by an enemy.

**Code Snippet:**

```java
public static void moveEnemies(int[][] enemyGrid) {
    // Move each enemy down by one row
    for (int i = enemyGrid.length - 2; i >= 0; i--) {
        for (int j = 0; j < enemyGrid[i].length; j++) {
            enemyGrid[i + 1][j] = enemyGrid[i][j];
            enemyGrid[i][j] = 0;
        }
    }
}
```

*Develop complex enemy movements and ensure interaction logic is precise.*

---

### Exercise 6: Advanced Gameplay Integration with ArrayLists & Loops 💡

**Goal:** Elevate your game by integrating all elements with loops and collections effectively.

**Instructions:**

1. **Gameplay Loop:**
   - Create a main gameplay loop that continuously updates player and enemy positions, checks for scoring, and determines game-over conditions.

2. **Game Logic Method:**
   - Design a method called `public static void runGame()` that integrates player movement, enemy interaction, and the scoring system from previously written methods.

3. **Dynamic Updates:**
   - Use loops to simulate continuous game rounds and modify player and enemy positions in each cycle.

**Code Snippet:**

```java
public static void runGame() {
    int[][] grid = new int[10][10];
    int[][] enemyGrid = new int[10][10];
    ArrayList<Integer> scores = new ArrayList<>();

    // Example game loop
    while (true) {
        updatePlayerPosition(grid, getNextX(), getNextY());
        moveEnemies(enemyGrid);
        addRoundScore(scores, calculateScore(grid));

        if (isPlayerCaught(grid, enemyGrid)) {
            System.out.println("Game Over!");
            break;
        }
    }
}
```

*Conceptualize your complete game logic, iterate through the loops and refine edge cases.*

---

---
**Submission & Evaluation**: Aim to complete each exercise with thorough understanding and implementation. You'll demonstrate your mastery by creating a simple yet complete game with cohesive features and efficiently structured code.

*Good luck, and have fun coding!* 🎉

---