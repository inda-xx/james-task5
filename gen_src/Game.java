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
        // TODO: Implement this method.
    }

    // Initialize the grid with player position
    private static void initializeGrid() {
        // TODO: Implement this method.
    }

    // Move player in the given direction
    public static void movePlayer(int direction) {
        // TODO: Implement this method.
    }

    // Print the game grid
    private static void printGrid() {
        // TODO: Implement this method.
    }

    // Add an enemy at a specific linear position on the grid
    public static void addEnemy(int position) {
        // TODO: Implement this method.
    }

    // Interact with enemies, increase score, and remove them
    public static void interactWithEnemies() {
        // TODO: Implement this method.
    }
}