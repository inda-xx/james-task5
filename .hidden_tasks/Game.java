// Game.java
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final int GRID_SIZE = 5;
    private static final char PLAYER_SYMBOL = 'P';
    private static final char ENEMY_SYMBOL = 'E';

    private static int playerRow;
    private static int playerCol;
    private static int enemyRow;
    private static int enemyCol;
    private static int score;

    public static void main(String[] args) {
        runGame();
    }

    /**
     * Runs the main game loop. Initializes game components,
     * updates the game state, and renders the game.
     */
    public static void runGame() {
        initializeGame();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayGrid();
            System.out.println("Score: " + score);
            
            // Winning condition
            if (score >= 10) {
                System.out.println("You win!");
                break;
            }

            System.out.print("Enter WASD to move: ");
            char move = scanner.nextLine().toUpperCase().charAt(0);
            if (!movePlayer(move)) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            if (checkCollision()) {
                System.out.println("You were caught by the enemy! Game over.");
                break;
            }

            score += updateScore();
            moveEnemy();
        }

        scanner.close();
    }

    /**
     * Initializes the game components, setting initial positions for the player
     * and the enemy and resetting the score.
     */
    private static void initializeGame() {
        playerRow = GRID_SIZE / 2;
        playerCol = GRID_SIZE / 2;
        enemyRow = GRID_SIZE - 1;
        enemyCol = GRID_SIZE - 1;
        score = 0;
    }

    /**
     * Moves the player in the specified direction if the move is valid.
     * @param direction Character representing direction ('W', 'A', 'S', 'D').
     * @return true if move is valid, false otherwise.
     */
    private static boolean movePlayer(char direction) {
        switch (direction) {
            case 'W': // Up
                if (playerRow > 0) {
                    playerRow--;
                    return true;
                }
                break;
            case 'A': // Left
                if (playerCol > 0) {
                    playerCol--;
                    return true;
                }
                break;
            case 'S': // Down
                if (playerRow < GRID_SIZE - 1) {
                    playerRow++;
                    return true;
                }
                break;
            case 'D': // Right
                if (playerCol < GRID_SIZE - 1) {
                    playerCol++;
                    return true;
                }
                break;
            default:
                return false;
        }
        return false;
    }
    
    /**
     * Checks for a collision between the player and the enemy.
     * @return true if player and enemy are in the same position, false otherwise.
     */
    private static boolean checkCollision() {
        return playerRow == enemyRow && playerCol == enemyCol;
    }

    /**
     * Moves the enemy randomly in any valid direction.
     */
    private static void moveEnemy() {
        Random random = new Random();
        switch (random.nextInt(4)) {
            case 0: // Up
                if (enemyRow > 0) enemyRow--;
                break;
            case 1: // Left
                if (enemyCol > 0) enemyCol--;
                break;
            case 2: // Down
                if (enemyRow < GRID_SIZE - 1) enemyRow++;
                break;
            case 3: // Right
                if (enemyCol < GRID_SIZE - 1) enemyCol++;
                break;
        }
    }

    /**
     * Updates and returns the score by introducing random events.
     * @return Score increment or decrement caused by an event.
     */
    private static int updateScore() {
        Random random = new Random();
        int event = random.nextInt(10);
        // Let's assume event '9' deducts points due to some random event
        return event == 9 ? -1 : 1;
    }

    /**
     * Displays the current state of the grid, player, and enemies.
     */
    private static void displayGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (i == playerRow && j == playerCol) {
                    System.out.print(PLAYER_SYMBOL + " ");
                } else if (i == enemyRow && j == enemyCol) {
                    System.out.print(ENEMY_SYMBOL + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}