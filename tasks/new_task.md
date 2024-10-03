# 🎮 Game Development Task: Simple Adventure Game

Welcome to this exciting task where you will apply fundamental programming concepts to create a simple adventure game! Throughout this task, you'll tackle various challenges focusing on player movement, scoring systems, and enemy interactions. This task will help you understand arrays, the `static` keyword, ArrayLists, loops, and collections. 

## 🌟 Learning Goals

1. **Working with Arrays**
2. **Understanding the `static` keyword**
3. **Working with ArrayLists**
4. **Combining loops and collections**

**Structure**

- **Exercises 1 & 2**: Theoretical understanding.
- **Exercises 3 & 4**: Practical coding integration.
- **Exercises 5 & 6**: Comprehensive development tasks.

Let's dive into the exercises!

---

## 🧠 Exercise 1: Arrays and Their Applications

**Objective:** Deepen your understanding of `Arrays` in Java.

**Description:** Explain the following:

- How do arrays store multiple elements? Discuss their usefulness in game development, specifically in managing game states like positions and game grids.
  
- What are the advantages and disadvantages of using arrays in a game development context? Consider scenarios like fixed level designs versus dynamic content creation.

**Expected Length:** 150-200 words for each explanation.

*Tip: Think about how arrays can store positions of players and enemies, and what challenges arise when levels change.*

---

## 🚀 Exercise 2: The Power of the `static` Keyword

**Objective:** Understand the `static` keyword and its applications.

**Description:** Discuss the following:

- What role does the `static` keyword play in Java, and how can it be beneficial in developing game utilities or constants?
  
- Imagine a game scoreboard. How would using a `static` method help manage player scores efficiently? Include a hypothetical example.

**Expected Length:** 150-200 words per topic.

*Tip: Focus on scenarios where static elements offer efficiency, such as utility methods or universally accessible constants.*

---

## 💻 Exercise 3: Player Movement using Arrays

**Objective:** Implement a basic player movement system using arrays.

**Task:**

1. Define a 2D array representing a simple game map (e.g., 5x5 grid). Initialize it with a player's starting position.
   
2. Create a method using an array to update the player's position based on input (e.g., move "up", "down", "left", "right").

**Example:**

```java
public static void movePlayer(char[][] map, String direction) {
    // Implement logic to change player position based on direction
}
```

**Deliverables:** The `movePlayer` method in a Java file.

*Ensure player movement is bounded by the array limits!*

---

## 🎯 Exercise 4: Managing Enemies with ArrayLists

**Objective:** Use `ArrayLists` to manage dynamic game entities, such as enemies.

**Task:**

1. Create a class `Enemy` with fields for `position` and `health`.
   
2. Use an `ArrayList` to manage multiple enemy instances in your game. Implement a method to iterate over this list and update enemy positions randomly within the grid.

**Example:**

```java
ArrayList<Enemy> enemies = new ArrayList<>();
enemies.add(new Enemy(2, 2, 100));

public void updateEnemyPositions() {
    // Implement random movement logic for enemies
}
```

**Deliverables:** A Java file containing the `Enemy` class and the `updateEnemyPositions` method.

*Remember to use randomization in a way that respects the grid boundaries.*

---

## 🏆 Exercise 5: Build a Scoring System

**Objective:** Develop a simple scoring system using both `static` variables and loops.

### Step-by-Step Instructions:

1. **Initialize the Score:** Create a `static` variable `score` in a new `Game` class.
   
2. **Implement Scoring Logic:** Develop methods that increase the score when certain events occur (e.g., defeating an enemy). Use loops to iterate over enemy positions to check for interactions.

```java
public static int score = 0;

public static void updateScoreForEnemyDefeat(int points) {
    score += points;
}
```

3. **Display the Score:** Add functionality to display the score inside your loop that manages game updates.

**Deliverables:** A Java file for the `Game` class showing score logic.

*Make the scoring system flexible to accommodate different challenges and victories.*

---

## 🎮 Exercise 6: Player vs. Enemy Interaction

**Objective:** Develop a complete interaction system between player and enemies using all concepts learned.

### Step-by-Step Instructions:

1. **Implement Player Attack Mechanism:**
   - Create a method for the player to attack, reducing an enemy's health if they occupy adjacent positions.
   - Use loops and array/ArrayList operations to manage interactions.

```java
public void playerAttack(int playerX, int playerY) {
    // Check adjacent positions and affect enemies
}
```

2. **Develop Enemy Collision Responses:**
   - If an enemy collides with the player, reduce the player's health.
   - Introduce a simple health management using the static keyword for simplicity.

3. **Integrate Systems:**
   - Combine movement, scoring, and interaction into a seamless gameplay loop.
   - Ensure the game runs playfully, updating positions, checking interactions, and updating scores.

**Deliverables:** A comprehensive Java file integrating all systems into a functional gameplay experience.

*Consider edge cases like simultaneous player/enemy movements and enemy overlaps.*

---

## 📋 Submission Checklist

- [ ] **Exercise 1:** Written explanations on arrays.
- [ ] **Exercise 2:** Written explanations on the `static` keyword.
- [ ] **Exercise 3:** Java file with player movement implementation.
- [ ] **Exercise 4:** Java file managing enemies with `ArrayList`.
- [ ] **Exercise 5:** Scoring system in Java.
- [ ] **Exercise 6:** Complete game interaction logic.

### 🔍 Debugging and Reflection:

As you work through these exercises, maintain logs of challenges or unexpected behaviors. This exercise helps build a problem-solving mindset and will be valuable for documentation.

---

Good luck and have fun developing your game! Remember to use the provided learning goals to assess your understanding as you progress. Share your questions or discoveries with peers or instructors for collaborative learning. Happy coding! 🎉