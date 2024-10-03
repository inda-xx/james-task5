package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameScoreManagerTest {

    private ArrayList<Integer> scores;

    @Before
    public void setUp() {
        scores = new ArrayList<>();
    }

    @Test
    public void testUpdateScoresWithPositiveScore() {
        GameScoreManager.updateScores(scores, 50);
        assertEquals(1, scores.size());
        assertEquals(Integer.valueOf(50), scores.get(0));
    }

    @Test
    public void testUpdateScoresWithZeroScore() {
        GameScoreManager.updateScores(scores, 0);
        assertEquals(0, scores.size());
    }

    @Test
    public void testUpdateScoresWithNegativeScore() {
        GameScoreManager.updateScores(scores, -10);
        assertEquals(0, scores.size());
    }

    @Test
    public void testGetHighestScoreWithMixedScores() {
        GameScoreManager.updateScores(scores, 50);
        GameScoreManager.updateScores(scores, 75);
        GameScoreManager.updateScores(scores, -10);
        GameScoreManager.updateScores(scores, 100);
        assertEquals(100, GameScoreManager.getHighestScore(scores));
    }

    @Test
    public void testGetHighestScoreWithNoScores() {
        assertEquals(0, GameScoreManager.getHighestScore(scores));
    }

    @Test
    public void testSortScoresDescending() {
        GameScoreManager.updateScores(scores, 50);
        GameScoreManager.updateScores(scores, 75);
        GameScoreManager.updateScores(scores, 100);
        GameScoreManager.sortScoresDescending(scores);
        assertEquals(Integer.valueOf(100), scores.get(0));
        assertEquals(Integer.valueOf(75), scores.get(1));
        assertEquals(Integer.valueOf(50), scores.get(2));
    }
}
```

GameUtilitiesTest.java:
```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

