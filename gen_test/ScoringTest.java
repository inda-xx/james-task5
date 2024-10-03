package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoringTest {

    @Test
    public void testAddScore() {
        Scoring.addScore(10);
        Scoring.addScore(20);
        
        List<Integer> expectedScores = new ArrayList<>();
        expectedScores.add(10);
        expectedScores.add(20);
        
        assertEquals(expectedScores, Scoring.getScores());
        assertEquals(30, Scoring.getTotalScore());
    }
}
```

Please ensure that you have relevant getter methods for testing purposes, such as `getActivePowerUps()`, `getGrid()`, `getScores()`, and `getTotalScore()` in your classes, which are used to verify the outcomes in assertions.