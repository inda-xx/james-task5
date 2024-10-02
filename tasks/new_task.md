## 🎮 Simple Game Application - Programming Task

Welcome to the development of an engaging and interactive simple game application! In this task, you will build a game that features player movement, a scoring system, and enemy interactions. Through this task, you will solidify your knowledge of arrays, array lists, and the concept of the `static` keyword, as well as how to effectively use loops with collections.

By the end of this task, you should be able to construct parts of a game application, manipulating collections of data to yield interactive gameplay features. Let's dive in!

### 📝 Task Overview

The task is structured into six exercises that gradually increase in complexity. You will start with theoretical questions to consolidate your understanding of key concepts, and then you will apply these concepts to build the game features.

---

### 📚 Exercise 1: Understanding Arrays and `static` ✅

In this exercise, you'll explore fundamental questions regarding arrays and the `static` keyword. Provide detailed answers to the following:

1. **What is an Array?**
   - Define what an array is in Java and highlight its main characteristics. Explain how arrays are used to store data.
  
2. **Using `static`:**
   - Explain the `static` keyword in Java. When should you use it in your code, and what are the implications of marking a method or a variable as `static`?

**Expected Output:**
- Provide your responses in a `.txt` or `.md` file explaining these concepts with examples.

---

### 📚 Exercise 2: Exploring ArrayLists 🔍

ArrayLists are crucial for dynamic data handling in Java. Answer the following:

1. **ArrayList Introduction:**
   - What are the key differences between an array and an ArrayList in Java?
   
2. **ArrayList Methods:**
   - Explain three different methods to manipulate an ArrayList, such as adding, removing items, and checking for an element.

**Expected Output:**
- Document your answers similarly to Exercise 1, using clear explanations and examples.

---

### 💻 Exercise 3: Implementing Player Movements 🕹️

Now let's start coding! Implement a basic system for player movements using arrays. Assume a grid-based game environment.

#### Task:
- Create a Java class `PlayerMovement.java`.
- Implement a `static` method `int[] movePlayer(int[] position, String direction)` that takes the current position of the player on a 2D grid as an integer array `[x, y]`, and a move direction (`"UP"`, `"DOWN"`, `"LEFT"`, `"RIGHT"`). The method should return the new position after the move.

**Example Input/Output:**
```java
int[] startPosition = {0, 0};
int[] newPosition = movePlayer(startPosition, "UP"); // Should return [0, -1]
```

**Hints:**
- Use arrays for position representation.
- The grid can be of size 10x10 for simplicity.

---

### 💻 Exercise 4: Scoring System with ArrayLists 📊

Build a scoring mechanism that updates as the player moves through certain points on the grid.

#### Task:
- In a new Java class `GameScoring.java`, maintain a list of scores using an `ArrayList<Integer>`.
- Implement a method `static void updateScore(String event, ArrayList<Integer> scores)` where the event could be `"SCORE_POINT"`, indicating that a player has scored. Increment the last score in the list or push a new score if it’s a new event.

**Example:**
```java
ArrayList<Integer> scores = new ArrayList<>();
updateScore("SCORE_POINT", scores);
// The scores list should be updated to reflect the new score.
```

**Hints:**
- Utilize ArrayList methods for dynamic score updates.
- Consider using loops to iterate over and update scores when necessary.

---

### 🔧 Exercise 5: Enemy Interactions - Reacting to Enemy Proximity 🚨

Introduce enemies that affect the player's score when they get too close.

#### Task:
- Using the `PlayerMovement.java` class, detect when a player and enemy occupy the same position.
- Implement `static boolean isEnemyNear(int[] playerPosition, ArrayList<int[]> enemyPositions)`. Return true if any enemy is in proximity to the player.

**Instructions:**
- Proximity is defined as an enemy being +/- 1 unit in any direction.
- Update the score detrimentally if an enemy is near.

**Hints:**
- Use nested loops to compare player positions with enemy positions.

---

### 🔧 Exercise 6: Bringing it All Together - Game Simulation 🎯

Combine everything into a simple game loop to simulate player movements, score updates, and enemy interactions.

#### Final Task:
- Create a `SimpleGame.java` class.
- Integrate player movement, scoring, and enemy detection into a main loop.
- Use arrays to represent the grid and player/enemy positions.
- Display the player's score dynamically as they move around the grid.

**Example Simulation:**
```java
// Example of simulating a few moves and updating the score accordingly
int[] playerPosition = {0, 0};
ArrayList<int[]> enemyPositions = new ArrayList<>();
enemyPositions.add(new int[]{1, 1});

while (/* game is running */) {
    // simulate player movements, scoring, and enemy interactions
    // output the player's score
}
```

**Hints:**
- Implement a basic loop to simulate the game session.
- Consolidate the knowledge from previous exercises for handling collections and logic flow.

---

### 🏁 Conclusion

Upon completing these exercises, you will not only have a good grasp of arrays, the `static` keyword, and ArrayLists, but you'll also have a simple, working game as a product of your learning journey. This project offers an excellent base to further explore game development concepts or to enhance your understanding of Java programming.

Happy coding! 🎉