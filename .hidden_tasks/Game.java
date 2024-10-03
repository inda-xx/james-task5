```java
import java.util.Scanner;
import java.util.Random;

/**
 * Game class that initializes, runs the game loop, and handles game logic.
 * This simple game involves moving the player in a grid to avoid collisions with enemies
 * and reach a score objective.
 */
public class Game {

    // Grid size constants
    private static final int GRID_SIZE = 5;
    
    // Score required to win
    private static final int WINNING_SCORE = 5;

    public static void main(String[] args) {
        // Initialize grid, player, and enemies
        char[][] grid = new char[GRID_SIZE][GRID_SIZE];
        int playerX = 0, playerY = 0;
        int score = 0;
        int enemyX, enemyY;

        // Randomly place an enemy on the grid (different from player default position)
        Random random = new Random();
        do {
            enemyX = random.nextInt(GRID_SIZE);
            enemyY = random.nextInt(GRID_SIZE);
        } while (enemyX == playerX && enemyY == playerY);

        // To read user input
        Scanner scanner = new Scanner(System.in);

        // Implement game loop to handle player input and update game state
        boolean isRunning = true;
        while (isRunning) {
            // Display grid
            clearGrid(grid);
            grid[playerX][playerY] = 'P';
            grid[enemyX][enemyY] = 'E';
            printGrid(grid);

            // Instructions
            System.out.println("Move: W (up), A (left), S (down), D (right) | Current Score: " + score);
            
            // Get user input
            String move = scanner.nextLine().toUpperCase();
            
            // Process user input
            int newPlayerX = playerX;
            int newPlayerY = playerY;
            switch (move) {
                case "W": if (playerX > 0) newPlayerX--; break;
                case "S": if (playerX < GRID_SIZE - 1) newPlayerX++; break;
                case "A": if (playerY > 0) newPlayerY--; break;
                case "D": if (playerY < GRID_SIZE - 1) newPlayerY++; break;
                default: System.out.println("Invalid move. Try again."); continue;
            }

            // Check collision with enemy
            if (newPlayerX == enemyX && newPlayerY == enemyY) {
                System.out.println("Collision with enemy! Game Over.");
                break;
            }

            // Update player position
            playerX = newPlayerX;
            playerY = newPlayerY;

            // Update score
            score++;
            
            // Check win condition
            if (score >= WINNING_SCORE) {
                System.out.println("Congratulations! You've reached the score objective and won!");
                isRunning = false;
            }
        }

        // Close scanner
        scanner.close();
    }

    /**
     * Clears the grid by setting all positions to '.'
     * @param grid The game grid
     */
    private static void clearGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '.';
            }
        }
    }

    /**
     * Prints the current state of the grid.
     * @param grid The game grid
     */
    private static void printGrid(char[][] grid) {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}