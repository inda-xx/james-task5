package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Before
    public void setUp() {
        // Reset the score before each test
        // A workaround since the score is static, consider refactoring the main class to add a reset method
        Player.updateScore(-Player.playerScore); 
    }

    @Test
    public void testUpdateScoreIncreasesScore() {
        Player.updateScore(5);
        Player.updateScore(10);
        assertEquals(15, Player.playerScore);
    }

    @Test
    public void testUpdateScoreWithNegativePoints() {
        Player.updateScore(10);
        Player.updateScore(-3);
        assertEquals(7, Player.playerScore);
    }

    @Test
    public void testUpdateScoreZero() {
        Player.updateScore(0);
        assertEquals(0, Player.playerScore);
    }
}

// File name: ArraysTest.java

import org.junit.Test;
import static org.junit.Assert.assertEquals;

