import java.util.Random;
import java.util.Scanner;

public class SimpleGame {
    // Constants for movement directions
    private static final char MOVE_UP = 'W';
    private static final char MOVE_DOWN = 'S';
    private static final char MOVE_LEFT = 'A';
    private static final char MOVE_RIGHT = 'D';

    // Game grid dimensions
    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 10;

    // Player and enemy positions
    private static int[] playerPosition = {5, 5}; // Start in the middle of the grid
    private static int[][] enemies = new int[][] {
        {0, 0}, {9, 9} // Sample enemy positions
    };

    public static void gameLoop() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Main game loop
        while (true) {
            // Display the grid
            displayGrid();

            // Get player command
            System.out.print("Enter move (W/A/S/D): ");
            char command = scanner.next().toUpperCase().charAt(0);

            // Update player position based on command
            movePlayer(command);

            // Move enemies randomly
            moveEnemies(random);

            // Check for collisions
            if (checkCollisions()) {
                System.out.println("Game Over! Enemy reached you.");
                break;
            }

            // Simulate game delay
            try {
                Thread.sleep(500); // 0.5 second delay
            } catch (InterruptedException e) {
                // Handle exception
                e.printStackTrace();
            }
        }

        scanner.close();
    }

    private static void movePlayer(char command) {
        switch (command) {
            case MOVE_UP:
                if (playerPosition[1] > 0) {
                    playerPosition[1]--;
                }
                break;
            case MOVE_DOWN:
                if (playerPosition[1] < GRID_HEIGHT - 1) {
                    playerPosition[1]++;
                }
                break;
            case MOVE_LEFT:
                if (playerPosition[0] > 0) {
                    playerPosition[0]--;
                }
                break;
            case MOVE_RIGHT:
                if (playerPosition[0] < GRID_WIDTH - 1) {
                    playerPosition[0]++;
                }
                break;
            default:
                System.out.println("Invalid move. Use W/A/S/D.");
        }
    }

    private static void moveEnemies(Random random) {
        for (int[] enemy : enemies) {
            int direction = random.nextInt(4);
            switch (direction) {
                case 0: // Move up
                    if (enemy[1] > 0) enemy[1]--;
                    break;
                case 1: // Move down
                    if (enemy[1] < GRID_HEIGHT - 1) enemy[1]++;
                    break;
                case 2: // Move left
                    if (enemy[0] > 0) enemy[0]--;
                    break;
                case 3: // Move right
                    if (enemy[0] < GRID_WIDTH - 1) enemy[0]++;
                    break;
            }
        }
    }

    private static boolean checkCollisions() {
        for (int[] enemy : enemies) {
            if (enemy[0] == playerPosition[0] && enemy[1] == playerPosition[1]) {
                return true;
            }
        }
        return false;
    }

    private static void displayGrid() {
        for (int y = 0; y < GRID_HEIGHT; y++) {
            for (int x = 0; x < GRID_WIDTH; x++) {
                if (playerPosition[0] == x && playerPosition[1] == y) {
                    System.out.print("P ");
                } else if (isEnemyAtPosition(x, y)) {
                    System.out.print("E ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isEnemyAtPosition(int x, int y) {
        for (int[] enemy : enemies) {
            if (enemy[0] == x && enemy[1] == y) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        gameLoop();
    }
}