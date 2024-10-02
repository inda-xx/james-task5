package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreTest {

    @Test
    public void testAddScore() {
        Score score = new Score();
        score.addScore(10);
        score.addScore(20);
        assertEquals(30, score.totalScore());
    }

    @Test
    public void testRemoveScore() {
        Score score = new Score();
        score.addScore(10);
        score.addScore(20);
        score.removeScore(10);
        assertEquals(20, score.totalScore());
    }

    @Test
    public void testTotalScoreWithEmptyScores() {
        Score score = new Score();
        assertEquals(0, score.totalScore());
    }

    @Test
    public void testRemoveNonExistentScore() {
        Score score = new Score();
        score.addScore(10);
        score.removeScore(20); // Score does not exist
        assertEquals(10, score.totalScore());
    }

    @Test
    public void testAddNegativeScore() {
        Score score = new Score();
        score.addScore(-10);
        score.addScore(-20);
        assertEquals(-30, score.totalScore());
    }

    @Test
    public void testMultipleAddRemove() {
        Score score = new Score();
        score.addScore(10);
        score.addScore(20);
        score.removeScore(10);
        score.addScore(30);
        score.removeScore(20);
        assertEquals(30, score.totalScore());
    }
}

