package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameUtilitiesTest {

    @Test
    public void testMillisecondsToSeconds() {
        assertEquals(5.0, GameUtilities.millisecondsToSeconds(5000), 0.0);
        assertEquals(0.0, GameUtilities.millisecondsToSeconds(0), 0.0);
    }

    @Test
    public void testCalculateDistance() {
        assertEquals(5.0, GameUtilities.calculateDistance(0, 0, 3, 4), 0.0);
        assertEquals(0.0, GameUtilities.calculateDistance(0, 0, 0, 0), 0.0);
    }
}
```

GameStateTest.java:
```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

