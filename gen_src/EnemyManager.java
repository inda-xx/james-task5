import java.util.List;
import java.util.ArrayList;

public class EnemyManager {

    // List to store enemy positions
    public static ArrayList<int[]> enemies = new ArrayList<>();
    
    // Player's position for simplicity. This should be dynamic in a real scenario.
    // Example: Player is at position (5, 5)
    public static int[] playerPosition = {5, 5};

    /**
     * Spawns a new enemy at the specified x and y coordinates.
     * 
     * @param x The x-coordinate of the enemy.
     * @param y The y-coordinate of the enemy.
     */
    public static void spawnEnemy(int x, int y) {
        // TODO: Implement this method.
    }

    /**
     * Moves each enemy one step closer to the player's position.
     * The movement logic is very simple; it moves enemy position
     * one step at a time along a column or row towards the player.
     */
    public static void moveEnemies() {
        // TODO: Implement this method.
    }

    public static void main(String[] args) {
        // TODO: Implement this method.
    }
}