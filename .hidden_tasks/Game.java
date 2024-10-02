import java.util.List;
import java.util.ArrayList;

public class Game {

    // Static 2D array representing a 5x5 game grid
    private static char[][] grid = new char[5][5];

    // Static variables for player position
    private static int playerX = 2;
    private static int playerY = 2;

    // ArrayList to hold enemy positions
    private static ArrayList<Integer> enemies = new ArrayList<>();

    // Player score
    private static int score = 0;

    // Initialize the grid
    static {
        initializeGrid();
    }

    public static void main(String[] args) {
        // Test player movement and enemy interaction
        printGrid();
        movePlayer(0); // Move up
        movePlayer(3); // Move right
        addEnemy(11);  // Add enemy
        addEnemy(7);   // Add enemy
        interactWithEnemies();
        movePlayer(2); // Move left
        movePlayer(1); // Move down
        interactWithEnemies();
    }

    // Initialize the grid with player position
    private static void initializeGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '.';
            }
        }
        grid[playerY][playerX] = 'P';
    }

    // Move player in the given direction
    public static void movePlayer(int direction) {
        // Clear current player position
        grid[playerY][playerX] = '.';

        switch (direction) {
            case 0: // up
                if (playerY > 0) playerY--;
                break;
            case 1: // down
                if (playerY < grid.length - 1) playerY++;
                break;
            case 2: // left
                if (playerX > 0) playerX--;
                break;
            case 3: // right
                if (playerX < grid[0].length - 1) playerX++;
                break;
            default:
                System.out.println("Invalid direction");
                return;
        }

        // Update player position
        grid[playerY][playerX] = 'P';
        printGrid();
    }

    // Print the game grid
    private static void printGrid() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("Player Score: " + score);
        System.out.println();
    }

    // Add an enemy at a specific linear position on the grid
    public static void addEnemy(int position) {
        if (position < 0 || position >= 25) {
            System.out.println("Invalid enemy position");
            return;
        }
        if (!enemies.contains(position)) {
            enemies.add(position);
        }
    }

    // Interact with enemies, increase score, and remove them
    public static void interactWithEnemies() {
        int playerPosition = playerY * grid[0].length + playerX;
        if (enemies.contains(playerPosition)) {
            score++;
            enemies.remove(Integer.valueOf(playerPosition));
            System.out.println("Enemy encountered! Score increased.");
        }
        System.out.println("Current Score: " + score);
    }
}