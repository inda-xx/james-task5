package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameWorldTest {
    
    // Run before each test to ensure a clean grid.
    @Before
    public void setup() {
        GameWorld.initializeGrid();
    }

    @Test
    public void testInitializeGrid() {
        // For testing grid initialization
        GameWorld.initializeGrid();
        boolean isCorrect = true;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (GameWorld.getGridValue(x, y) != 0) {
                    isCorrect = false;
                    break;
                }
            }
        }
        assertTrue("The grid should be initialized to empty", isCorrect);
    }

    @Test
    public void testPlacePlayerWithinBounds() {
        // Test placing the player within boundaries
        GameWorld.placePlayer(4, 5);
        assertEquals("Player should be placed at (4, 5)", 1, GameWorld.getGridValue(4, 5));
        
        // Ensure no other grid positions have a player
        boolean isCorrect = true;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if ((x != 4 || y != 5) && GameWorld.getGridValue(x, y) == 1) {
                    isCorrect = false;
                }
            }
        }
        assertTrue("Player should only be placed at (4, 5)", isCorrect);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlacePlayerOutOfBoundsNegative() {
        // Test placing the player out of bounds (negative coordinates)
        GameWorld.placePlayer(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlacePlayerOutOfBoundsPositive() {
        // Test placing the player out of bounds (coordinates larger than the grid)
        GameWorld.placePlayer(10, 10);
    }

    @Test
    public void testPlayerMoveAndClearPreviousPosition() {
        // Place player to initial position and then move
        GameWorld.placePlayer(2, 2);
        assertEquals("Player should be placed at (2, 2)", 1, GameWorld.getGridValue(2, 2));

        GameWorld.placePlayer(3, 3);
        assertEquals("Player should be placed at (3, 3)", 1, GameWorld.getGridValue(3, 3));
        assertEquals("Previous player position (2, 2) should be empty", 0, GameWorld.getGridValue(2, 2));
    }
    
    @Test
    public void testPrintGridDoesNotModifyGrid() {
        // Check if the printGrid method doesn't change the state of the grid
        GameWorld.placePlayer(1, 1);
        GameWorld.printGrid(); // ensure this doesn't throw an exception

        assertEquals("After printing, player should still be at (1, 1)", 1, GameWorld.getGridValue(1, 1));
    }
}
```

This test suite initializes the grid before each test case to ensure a consistent state. It includes tests for:

1. Initializing the grid to ensure all cells are empty.
2. Correctly placing the player within bounds and ensuring no other cell contains a player.
3. Handling placing the player out of bounds, both negative and positive indices, expecting exceptions.
4. Placing the player in a new location and ensuring the old location is cleared.
5. Verifying that the `printGrid` method does not alter the state of the grid.

Note that `getGridValue(int x, int y)` is a assumed method for direct grid access and should be implemented in the `GameWorld` class for test purposes if it's not already present.