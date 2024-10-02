# Implement a simple text-based adventure game.

### Introduction to the Adventure Awaits: A Text-Based Game

Welcome to "Adventure Awaits," a programming task that will guide you through creating a simple, yet captivating text-based adventure game. This medium-difficulty task is designed to enhance your understanding of key programming concepts including arrays, loops, the `static` keyword, and `ArrayLists`. By the end of this task, you'll have a deeper comprehension of how these elements work together to create interactive and dynamic applications.

In this adventure game, players will navigate through a series of rooms, each offering unique challenges and opportunities. Your goal is to implement the core mechanics that allow players to explore this virtual world, making decisions that influence the outcome of their journey.

### Objectives:

1. **Understanding Arrays**: You'll use arrays to manage and store fixed sets of data, such as the different rooms available in the game. This will help you understand how to efficiently access and manipulate data using indices.

2. **Working with Loops**: Loops will be integral to your game's structure, allowing you to repeatedly execute actions like moving between rooms or responding to player inputs. You'll learn to combine loops with conditional statements to create seamless gameplay experiences.

3. **Understanding the `static` Keyword**: As you build your game, you'll encounter scenarios where certain variables or methods need to be shared across different parts of your program. Using the `static` keyword, you'll gain insight into managing shared resources and maintaining consistent game state.

4. **Working with `ArrayLists`**: Unlike arrays, `ArrayLists` offer dynamic sizing, which is perfect for managing collections of items that can change during gameplay, such as an inventory system. You'll learn to add, remove, and iterate over elements in an `ArrayList`, enhancing the flexibility of your game.

5. **Combining Loops and Collections**: Finally, you'll combine your knowledge of loops and collections to implement features like inventory management, where players can collect, use, and inspect items as they progress through the game.

Embark on this adventure to not only craft a fun and interactive game but also to solidify your understanding of these essential programming concepts. Let's get started and see where your code can take you!

### 📝 Preparation

- Review the basic syntax and usage of arrays in your programming language.
- Study examples of loops, including `for`, `while`, and `do-while` loops.
- Learn about the `static` keyword and its purpose in defining class-level variables and methods.
- Explore the `ArrayList` class, focusing on how to add, remove, and access elements.
- Practice combining loops with arrays and `ArrayLists` to iterate over collections.
- Set up your development environment, ensuring you can compile and run simple programs.
- Read a simple text-based adventure game example to understand the game flow and structure.
- Write a small program that uses each of the above concepts to reinforce understanding.

### ✅ Learning Goals

* **Understanding arrays**
* **Working with loops**
* **Understanding the `static` keyword**
* **Working with `ArrayLists`**
* **Combining loops and collections**


### 🏛 Assignment

## Assignment: Create a Simple Text-Based Adventure Game

### Objective:
Develop a simple text-based adventure game that allows players to navigate through different rooms, collect items, and encounter various scenarios. This assignment will help you understand and apply concepts such as arrays, loops, the `static` keyword, and `ArrayLists` in Java.

### Requirements:

1. **Game Structure**:
   - Design a map consisting of at least five rooms. Each room should be represented as a string in an array.
   - Create a storyline that guides the player through these rooms. You can include a starting room, intermediate rooms, and a final room.

2. **Player Movement**:
   - Implement player navigation using a loop that allows the player to move between rooms. Players should be able to input commands such as "go north", "go south", "go east", or "go west" to change rooms.
   - Use an array to keep track of the player's current position on the map.

3. **Item Collection**:
   - Populate the rooms with various items that the player can collect. Use an `ArrayList` to store the items that the player collects.
   - Implement functionality for players to pick up and drop items using commands like "take [item]" and "drop [item]".

4. **Game Logic**:
   - Use loops to handle the main game loop, allowing continuous player interaction until they reach the final room or decide to quit.
   - Implement conditional logic to handle different scenarios, such as encountering obstacles or finding special items.

5. **Static Methods and Variables**:
   - Use the `static` keyword to define any constants or utility methods that are shared across different parts of your game, such as room descriptions or common actions.
   - Justify the use of `static` by ensuring that these methods and variables are not tied to any specific instance of a class.

6. **Combining Loops and Collections**:
   - Use loops to iterate over the `ArrayList` of collected items and display them to the player.
   - Implement a feature that checks whether a certain item is in the player's inventory before allowing them to perform specific actions.

### Guidelines:
- Write clean, readable, and well-documented code. Include comments that explain key sections of your code.
- Ensure your game handles invalid inputs gracefully, providing helpful messages to guide the player.
- Test your game thoroughly to ensure all features work as expected and that it provides

#### Exercise 1

**Exercise 1: Setting the Stage for Your Adventure Game**

**Objective:**  
In this exercise, you will begin creating a simple text-based adventure game. The goal is to understand and utilize arrays to manage game elements. You will set up the initial game environment, which includes defining the locations and possible actions in the game world.

**Problem Statement:**  
Imagine a world where the player can explore different locations, each with unique descriptions and actions. Your task is to create an array to store these locations and their corresponding details. This will form the foundation of your adventure game.

**Instructions:**

1. **Define the Game World:**  
   Create a simple game world with at least five unique locations. Each location should have a name and a brief description. For instance, you might have locations like "Forest", "Cave", "Village", "Riverbank", and "Castle".

2. **Use Arrays to Store Data:**  
   Use a two-dimensional array to store the names and descriptions of these locations. The first dimension will represent each location, while the second dimension will hold the name and description.

   ```java
   String[][] locations = {
       {"Forest", "A dense forest with towering trees and the sound of wildlife."},
       {"Cave", "A dark, damp cave that echoes with mysterious sounds."},
       {"Village", "A small village with friendly inhabitants and cozy cottages."},
       {"Riverbank", "A serene riverbank with flowing water and lush greenery."},
       {"Castle", "An ancient castle with high walls and a grand entrance."}
   };
   ```

3. **Display the Locations:**  
   Write a function that loops through the array and prints out each location's name and description. This will help you practice working with loops and accessing array elements.

   ```java
   public static void displayLocations(String[][] locations) {
       for (int i = 0; i < locations.length; i++) {
           System.out.println("Location: " + locations[i][0]);
           System.out.println("Description: " + locations[i][1]);
           System.out.println();
       }
   }
   ```

4. **Main Method:**  
   In your `main` method, call the `displayLocations` function to verify that your array is correctly set up and that the loop is functioning as expected.

**Expected Output:**

When your program runs, it should output the names and descriptions of all five locations,

#### Exercise 2

### Exercise 2: Expanding Your Adventure with Rooms

In this exercise, you will build upon your text-based adventure game by adding multiple rooms that the player can explore. This will help you understand how to use arrays and loops effectively to manage game state and navigate through different locations.

#### Learning Goals:
- Understanding arrays
- Working with loops
- Introduction to the `static` keyword

#### Problem Statement:

In the previous exercise, you created a basic framework for a text-based adventure game with a single room. Now, you will expand your game by implementing multiple rooms using arrays. Each room will have a description and a set of possible directions the player can move (e.g., north, south, east, west).

#### Requirements:

1. **Define Rooms Using Arrays:**
   - Create an array of strings called `roomDescriptions`. Each element in this array should be a description of a room.
   - Create a 2D array of integers called `roomConnections` that represents the connections between rooms. Each sub-array should contain four integers representing the indices of the connected rooms in the order [north, east, south, west]. Use `-1` to indicate that there is no connection in a particular direction.

   ```java
   String[] roomDescriptions = {
       "You are in a small, dimly lit cave.",
       "You find yourself in a lush, green forest.",
       "You are in a grand hall with high ceilings.",
       "You stand on a sandy beach with waves crashing nearby."
   };

   int[][] roomConnections = {
       {-1, 1, -1, -1}, // connections for room 0 (cave)
       {-1, -1, 2, 0},  // connections for room 1 (forest)
       {1, -1, -1, -1}, // connections for room 2 (hall)
       {-1, -1, -1, -1} // connections for room 3 (beach)
   };
   ```

2. **Implement Room Navigation:**
   - Use a loop to allow the player to navigate through the rooms. Prompt the player for input to choose a direction to move.
   - Update the player's current room based on the chosen direction using the `roomConnections` array.
   - Ensure that the player cannot move in a direction where there is no connection (indicated by `-1`).

3. **Use the `

#### Exercise 3

**Exercise 3: Expanding the Adventure with Dynamic Inventory Management**

**Objective:**
In this exercise, you will enhance your text-based adventure game by implementing a dynamic inventory system using `ArrayLists`. This will allow players to collect, store, and manage items as they explore different locations. You will also use loops to interact with the inventory and understand the use of the `static` keyword to manage game state.

**Problem Statement:**

In the previous exercises, you have set up a basic text-based adventure game with a simple map and player movement. Now, it's time to add an inventory system that will allow players to collect and manage items. The inventory system should be dynamic, allowing players to pick up and drop items as they explore the game world.

**Requirements:**

1. **Create and Manage Inventory:** 
   - Implement an `ArrayList<String>` to store the player's inventory. This will allow you to dynamically add and remove items.
   - Provide options for the player to view their inventory, pick up items, and drop items.

2. **Static Game State:**
   - Use the `static` keyword to manage the game state, such as the current location and available items in each location. This will help maintain a consistent game state across different parts of your program.

3. **Integrate Loops and Collections:**
   - Use loops to display the inventory and allow the player to interact with it.
   - Implement a loop to iterate over available items in the current location, allowing the player to pick them up.

4. **Example Interaction:**
   - As the player enters a new location, display a list of items available to pick up.
   - Allow the player to type commands such as "pick up sword" or "drop shield" to manage their inventory.
   - Use a loop to continuously prompt the player for actions until they decide to move to a different location.

**Code Snippets and Examples:**

Below is a starting point for managing the inventory using an `ArrayList`:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class AdventureGame {
    private static ArrayList<String> inventory = new ArrayList<>();
    private static String currentLocation = "Forest";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            System.out.println("You are in the " + currentLocation);
            System.out

#### Exercise 4

### Exercise 4: Expanding Your Adventure Game with Dynamic Environments

**Objective:** In this exercise, you will enhance your text-based adventure game by introducing dynamic environments and interactive elements using `ArrayLists`. This will deepen your understanding of combining loops with collections and leveraging the `static` keyword for shared game state.

**Problem Statement:**

In the previous exercises, you have created a basic structure for your text-based adventure game. Now, it's time to make the game world more dynamic and interactive by allowing players to explore different environments and interact with items within these environments.

**Requirements:**

1. **Define Environments:**
   - Create a class `Environment` that represents different locations in the game. Each environment should have a name, a description, and a list of items present in that environment.
   - Use an `ArrayList` to store the items in each environment.

2. **Static Game State:**
   - Use the `static` keyword to maintain a shared game state across different environments. For example, a static list of all environments in the game or a static map to track the player's current location.

3. **Player Actions:**
   - Allow players to move between environments by implementing a method `changeEnvironment(String environmentName)`. This method should update the player's current location and display the new environment's description and items.
   - Implement a method `interactWithItem(String itemName)` that allows players to interact with items in the current environment. You can define simple interactions like picking up an item or examining it.

4. **Loop and Collection Integration:**
   - Use loops to iterate over environments and items to display options to the player and handle their choices.
   - Ensure that the player's actions update the game state appropriately and provide feedback to the player.

5. **Example Code Snippet:**

   ```java
   import java.util.ArrayList;

   class Environment {
       private String name;
       private String description;
       private ArrayList<String> items;

       public Environment(String name, String description) {
           this.name = name;
           this.description = description;
           this.items = new ArrayList<>();
       }

       public void addItem(String item) {
           items.add(item);
       }

       public ArrayList<String> getItems() {
           return items;
       }

       public String getName() {
           return name;
       }

       public String getDescription() {
           return description;
       }
   }

   public class Adventure

#### Exercise 5

### Exercise 5: Enhancing the Adventure with Dynamic Events

#### Problem Statement
In this exercise, you will enhance your text-based adventure game by introducing dynamic events that change based on player actions. You'll use `ArrayLists` to manage these events and combine loops and collections to create a more interactive experience.

#### Learning Goals
- Deepen understanding of `ArrayLists` and collections.
- Practice using loops to iterate over dynamic data structures.
- Understand and apply the `static` keyword in a multi-class project.

#### Task Description
1. **Create Dynamic Events:**
   - Introduce a new class called `Event` with properties such as `description`, `impact`, and `isResolved`.
   - Use an `ArrayList` to maintain a list of `Event` objects in your game.

2. **Integrate Events into the Game Loop:**
   - Modify your main game loop to periodically check for and trigger events from your `ArrayList`.
   - Use a loop to iterate through the list of events and apply their effects if certain conditions are met (e.g., player enters a specific area).

3. **Static Event Manager:**
   - Implement a static class `EventManager` that contains static methods to add, remove, and resolve events.
   - Ensure that the `EventManager` can be accessed by different parts of your game without needing to instantiate it.

4. **Player Interaction with Events:**
   - Allow players to interact with events, such as choosing to resolve them or ignore them, affecting the game's outcome.
   - Use loops to present the player with choices and update the `ArrayList` accordingly.

5. **Challenge: Create a Chain Reaction:**
   - Design a scenario where resolving one event triggers another event, demonstrating your understanding of loops and dynamic collections.
   - Use nested loops or recursive methods to handle complex event chains.

#### Example Code Snippets

```java
// Event.java
public class Event {
    private String description;
    private int impact;
    private boolean isResolved;

    public Event(String description, int impact) {
        this.description = description;
        this.impact = impact;
        this.isResolved = false;
    }

    public void resolve() {
        this.isResolved = true;
    }

    public boolean isResolved() {
        return isResolved;
    }

    // Getters and other methods...
}

// EventManager.java
public class EventManager {
    private static ArrayList<Event> events


### ❎ Checklist
- [ ] Complete all exercises.

### 🐞 Bugs and errors?
If you find any inconsistencies or errors in this exercise, please open a [New Issue](#) with the title "Task Error: *summary of error here*".

### 🙏 Acknowledgment
This task was auto-generated based on your theme and the course's learning goals.
