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
        int[] enemy = {x, y};
        enemies.add(enemy);
    }

    /**
     * Moves each enemy one step closer to the player's position.
     * The movement logic is very simple; it moves enemy position
     * one step at a time along a column or row towards the player.
     */
    public static void moveEnemies() {
        for (int[] enemy : enemies) {
            // Move enemy towards player on the x-axis
            if (enemy[0] < playerPosition[0]) {
                enemy[0]++;
            } else if (enemy[0] > playerPosition[0]) {
                enemy[0]--;
            }
            
            // Move enemy towards player on the y-axis
            if (enemy[1] < playerPosition[1]) {
                enemy[1]++;
            } else if (enemy[1] > playerPosition[1]) {
                enemy[1]--;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        spawnEnemy(1, 2);
        spawnEnemy(7, 8);
        
        // Print initial positions
        System.out.println("Initial enemy positions:");
        for (int[] enemy : enemies) {
            System.out.println("Enemy at (" + enemy[0] + ", " + enemy[1] + ")");
        }
        
        // Move enemies
        moveEnemies();
        
        // Print new positions
        System.out.println("\nEnemy positions after moving:");
        for (int[] enemy : enemies) {
            System.out.println("Enemy at (" + enemy[0] + ", " + enemy[1] + ")");
        }
    }
}