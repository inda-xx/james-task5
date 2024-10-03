import java.util.List;
import java.util.Set;

// GameEntitiesManager.java
import java.util.ArrayList;

/**
 * GameEntitiesManager class demonstrating the use of arrays for managing
 * game entities such as players, enemies, and obstacles.
 */
public class GameEntitiesManager {

    // Maximum number of entities to manage
    private static final int MAX_ENTITIES = 50;

    // Array to store the x-coordinate of each entity
    private int[] xPositions = new int[MAX_ENTITIES];

    // Array to store the y-coordinate of each entity
    private int[] yPositions = new int[MAX_ENTITIES];

    // Array to store the active status of each entity
    private boolean[] activeStatus = new boolean[MAX_ENTITIES];

    /**
     * Initializes the entities with default positions and sets them as active.
     */
    public GameEntitiesManager() {
        for (int i = 0; i < MAX_ENTITIES; i++) {
            xPositions[i] = 0; // Default x position
            yPositions[i] = 0; // Default y position
            activeStatus[i] = true; // Set each entity as active
        }
    }

    /**
     * Updates the position of an entity.
     *
     * @param index The index of the entity to update.
     * @param newX  The new x-coordinate.
     * @param newY  The new y-coordinate.
     */
    public void updateEntityPosition(int index, int newX, int newY) {
        if (index >= 0 && index < MAX_ENTITIES) {
            xPositions[index] = newX;
            yPositions[index] = newY;
        }
    }

    /**
     * Checks for collisions among active entities.
     * Prints message if collision is detected.
     */
    public void checkCollisions() {
        for (int i = 0; i < MAX_ENTITIES; i++) {
            if (!activeStatus[i]) continue; // Skip inactive entities
            for (int j = i + 1; j < MAX_ENTITIES; j++) {
                if (!activeStatus[j]) continue; // Skip inactive entities
                if (xPositions[i] == xPositions[j] && yPositions[i] == yPositions[j]) {
                    System.out.println("Collision detected between entities " + i + " and " + j);
                }
            }
        }
    }

    // More methods to manage entities can be added here

    public static void main(String[] args) {
        GameEntitiesManager manager = new GameEntitiesManager();
        // Simulate a simple scenario for demonstration
        manager.updateEntityPosition(0, 5, 5);
        manager.updateEntityPosition(1, 5, 5);
        manager.checkCollisions();
    }
}