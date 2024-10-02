package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        // Reset the grid and other static variables before each test
        GameTestHelper.resetGame();
    }

    @Test
    public void testInitialPlayerPosition() {
        GameTestHelper.printGrid();
        String expectedGrid = " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  P  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              "Player Score: 0\n\n";
        assertEquals(expectedGrid, outContent.toString());
    }

    @Test
    public void testMovePlayerUp() {
        Game.movePlayer(0);
        String expectedGrid = " .  .  .  .  . \n" +
                              " .  .  P  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              "Player Score: 0\n\n";
        assertEquals(expectedGrid, outContent.toString());
    }

    @Test
    public void testMovePlayerDown() {
        Game.movePlayer(1);
        String expectedGrid = " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  P  .  . \n" +
                              " .  .  .  .  . \n" +
                              "Player Score: 0\n\n";
        assertEquals(expectedGrid, outContent.toString());
    }

    @Test
    public void testMovePlayerLeft() {
        Game.movePlayer(2);
        String expectedGrid = " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  P  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              "Player Score: 0\n\n";
        assertEquals(expectedGrid, outContent.toString());
    }

    @Test
    public void testMovePlayerRight() {
        Game.movePlayer(3);
        String expectedGrid = " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  .  P  . \n" +
                              " .  .  .  .  . \n" +
                              " .  .  .  .  . \n" +
                              "Player Score: 0\n\n";
        assertEquals(expectedGrid, outContent.toString());
    }

    @Test
    public void testInvalidMove() {
        Game.movePlayer(5); // Invalid direction
        String expectedOutput = "Invalid direction\n";
        assertTrue(outContent.toString().contains(expectedOutput));
    }

    @Test
    public void testAddEnemyValidPosition() {
        Game.addEnemy(12); // Middle of the grid
        assertTrue(GameTestHelper.isEnemyPresent(12));
    }

    @Test
    public void testAddEnemyInvalidPosition() {
        Game.addEnemy(-1);
        assertFalse(GameTestHelper.isEnemyPresent(-1));
        assertTrue(outContent.toString().contains("Invalid enemy position"));

        Game.addEnemy(25);
        assertFalse(GameTestHelper.isEnemyPresent(25));
        assertTrue(outContent.toString().contains("Invalid enemy position"));
    }

    @Test
    public void testInteractWithEnemy() {
        Game.addEnemy(12); // Add an enemy where the player is initially located
        Game.interactWithEnemies(); 
        assertEquals(1, GameTestHelper.getScore());
        assertFalse(GameTestHelper.isEnemyPresent(12)); // Enemy should be removed
    }

    @Test
    public void testNoEnemyInteraction() {
        Game.addEnemy(11); // Add an enemy in a different position
        Game.interactWithEnemies();
        assertEquals(0, GameTestHelper.getScore());
        assertTrue(GameTestHelper.isEnemyPresent(11)); // Enemy should still be present
    }

    @Test
    public void testEnemyScoreIncreases() {
        Game.addEnemy(12);
        Game.interactWithEnemies();
        assertEquals(1, GameTestHelper.getScore());
        
        Game.addEnemy(12);
        Game.interactWithEnemies(); // Another interaction at same position to test repeated scoring
        assertEquals(2, GameTestHelper.getScore());
    }
}

class GameTestHelper {

    // Resets the static fields in Game class to their initial state
    public static void resetGame() {
        Game.playerX = 2;
        Game.playerY = 2;
        Game.enemies.clear();
        Game.score = 0;
        Game.initializeGrid();
    }

    // Returns the current score
    public static int getScore() {
        return Game.score;
    }

    // Checks if an enemy is present on the grid
    public static boolean isEnemyPresent(int position) {
        return Game.enemies.contains(position);
    }
    
    // Resets the output stream
    public static void resetOutputStream() {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
    }
    
    // Prints the grid to the output stream for testing
    public static void printGrid() {
        Game.printGrid();
    }
}