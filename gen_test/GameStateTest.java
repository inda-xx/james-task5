package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameStateTest {

    @Test
    public void testIncrementScore() {
        GameState.incrementScore(10);
        assertEquals(10, GameState.getScore());
        GameState.incrementScore(20);
        assertEquals(30, GameState.getScore());
    }

    @Test
    public void testGetScoreFromDifferentInstances() {
        GameState state1 = new GameState("State1");
        GameState.incrementScore(10);
        GameState state2 = new GameState("State2");
        assertEquals(10, GameState.getScore());
    }

    @Test
    public void testGetName() {
        GameState state = new GameState("MainState");
        assertEquals("MainState", state.getName());
    }
}
```

GameEntitiesManagerTest.java:
```java
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

