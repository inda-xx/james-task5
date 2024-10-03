# 🎮 Simple Game Application Task

## Overview
In this task, you will create a simple 2D console-based game application in Java. The game will integrate player movement, a scoring system, and interactions with enemies. The focus is on working with arrays, understanding and using the `static` keyword, utilizing `ArrayLists`, and combining loops with collections. By the end of this task, you should have a solid understanding of these fundamental concepts in Java. 

### 🏆 Learning Goals
- Mastery of `Arrays` and `ArrayLists`
- Comprehension of the `static` keyword
- Proficient use of loops with collections
- Application of these concepts in a practical, game-based scenario

---

## 📚 Exercises

### Exercise 1: Understanding Arrays and Static Keyword

#### 🎯 Goal
Solidify your theoretical understanding of arrays and the static keyword in Java.

#### 📘 Task
- **Question 1**: Explain how arrays work in Java. What are their strengths and limitations?
- **Question 2**: Discuss the `static` keyword. What are its uses and why is it important in defining methods or variables within a class?

Use examples where necessary to illustrate your points.

---

### Exercise 2: ArrayLists and Looping Concepts

#### 🎯 Goal
Enhance your theoretical grasp of `ArrayLists` and combining loops with collections.

#### 📘 Task
- **Question 1**: Describe the main differences between an `Array` and an `ArrayList`. When would you choose one over the other?
- **Question 2**: Explain how loops (such as for-loops and while-loops) can be used to manipulate collections. Why are these loops powerful when dealing with both arrays and `ArrayLists`?

Think about scenarios involving dynamic collections and iterating over elements.

---

### Exercise 3: Setting Up Game Components

#### 🎯 Goal
Implement basic elements of your game using arrays and static components.

#### 🛠 Task
- Define a `static` array for the player's position.
- Create methods to move the player in a 2D grid, i.e., `moveUp()`, `moveDown()`, `moveLeft()`, `moveRight()`. 
  ```java
  public static void moveUp(int[] playerPosition) { /* implementation */ }
  ```

Ensure the player's position does not move out of the predefined grid bounds (e.g., a 10x10 grid).

---

### Exercise 4: Managing Dynamic Objects with ArrayLists

#### 🎯 Goal
Utilize `ArrayLists` to handle dynamic game elements such as enemies.

#### 🛠 Task
- Implement an `ArrayList` to hold positions of enemies on the grid.
- Create methods to randomly generate enemy positions on the grid, avoiding player’s position:
  ```java
  public static void spawnEnemies(ArrayList<int[]> enemies) { /* implementation */ }
  ```

Design the methods so that they dynamically adjust the list of enemies.

---

### Exercise 5: Combining Player Movements and Enemy Interactions

#### 🎯 Goal
Integrate player movements and detect interactions with enemies.

#### 🛠 Task - Step-by-Step
1. Enhance your movement methods to check for collisions:
   ```java
   public static boolean checkCollision(int[] playerPosition, ArrayList<int[]> enemies) { /* implementation */ }
   ```
2. If a player collides with an enemy, remove that enemy from the grid and increase the player's score.

3. Define a static variable for the player's score:
   ```java
   public static int playerScore = 0;
   ```

Test this logic by simulating several player moves and enemy interactions.

---

### Exercise 6: Scoring System & Game Over Condition

#### 🎯 Goal
Finalize the scoring system and implement a game over condition.

#### 🛠 Task - Step-by-Step
1. Define a `static` variable to set a score threshold for winning the game.
   ```java
   public static final int WINNING_SCORE = 10;
   ```

2. Implement a method to check if the player has won:
   ```java
   public static boolean checkWinCondition() { /* implementation */ }
   ```

3. Create a game loop that continues until the player wins or decides to quit. Display the current score and available moves to the player.

Reflect on how `static` can simplify accessing shared resources such as scores and winning conditions between methods.

---

## 🌟 Conclusion
Integrating arrays, `ArrayLists`, and static components with loops will give you a strong foundation in developing interactive applications. Challenge yourself by expanding on this game: ideas include adding power-ups, increasing difficulty, or implementing a graphical UI. Happy coding! ✨