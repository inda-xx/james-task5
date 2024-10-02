To create a simple game loop with a scoring system, we need to combine various elements such as game entities (player and enemies), scoring logic, and game loop mechanics handling input and game state updates. Below is a complete Java program that achieves this:

```java
import java.util.ArrayList;
import java.util.Scanner;

// Class representing the game world
public class GameWorld {
    // Static variables to hold the score
    private static int score = 0;

    // Method to update the score and display it
    public static void updateScore(int points) {
        score += points;
        System.out.println("Current Score: " + score);
    }

    // A simple game loop to demonstrate interactive scoring and game state updates
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        // Initialize the player and a list of enemies
        Player player = new Player(0, 0);
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy(1, 1));
        enemies.add(new Enemy(2, 2));

        // Print instructions
        System.out.println("Game started. Use W, A, S, D to move. Type 'quit' to stop.");
        System.out.println("Defeat enemies by moving to their position to gain points.");

        // Game loop
        while (isRunning) {
            System.out.println("\nEnter your move:");
            String input = scanner.nextLine().toLowerCase();

            // Process player input for movement
            switch (input) {
                case "w": player.moveUp(); break;
                case "s": player.moveDown(); break;
                case "a": player.moveLeft(); break;
                case "d": player.moveRight(); break;
                case "quit": isRunning = false; continue;
                default: System.out.println("Invalid input! Use W, A, S, D to move."); continue;
            }

            // Check for player and enemy collisions
            for (int i = 0; i < enemies.size(); i++) {
                Enemy enemy = enemies.get(i);
                if (player.getX() == enemy.getX() && player.getY() == enemy.getY()) {
                    System.out.println("Enemy defeated!");
                    updateScore(100); // Increase score by 100 for each enemy defeated
                    enemies.remove(i); // Remove the enemy from the list
                    i--; // Adjust index since we removed an item
                }
            }

            // Display the state of the game
            System.out.println("Player position: (" + player.getX() + "," + player.getY() + ")");
            System.out.println("Remaining enemies: " + enemies.size());
        }

        // Clean up
        scanner.close();
        System.out.println("Game ended. Final Score: " + score);
    }
}

// Class representing the player
class Player {
    private int x, y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y--; // move up in the grid
    }

    public void moveDown() {
        y++; // move down in the grid
    }

    public void moveLeft() {
        x--; // move left in the grid
    }

    public void moveRight() {
        x++; // move right in the grid
    }

    // Getters for player position
    public int getX() { return x; }
    public int getY() { return y; }
}

// Class representing an enemy
class Enemy {
    private int x, y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters for enemy position
    public int getX() { return x; }
    public int getY() { return y; }
}
```

### Explanation:

1. **Player and Enemy Entities**: The `Player` and `Enemy` classes represent the game entities with simple integer coordinate positions.

2. **Scoring System**: The scoring system is implemented using a static variable `score` in the `GameWorld` class. The `updateScore` method updates and prints the current score.

3. **Game Loop**: The loop listens for user input and updates the player's position accordingly. If the player moves to an enemy's position, the enemy is defeated, and points are awarded.

4. **Input Handling**: Simple console-based commands ('W', 'A', 'S', 'D', and 'quit') allow the user to control the game. 

5. **Collision Detection**: The game checks if the player overlaps with any enemy's position to trigger enemy defeat and score update.

6. **End of Game**: The game ends when the player types 'quit', outputting the final score.

This code provides a basic framework and demonstrates the integration of player input handling, entity management, and a scoring system within a simple game loop. Further enhancements could include more complex game mechanics, UI elements, or expanded game world features.