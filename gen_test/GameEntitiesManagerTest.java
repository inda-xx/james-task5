package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameEntitiesManagerTest {

    private GameEntitiesManager manager;

    @org.junit.Before
    public void setUp() {
        manager = new GameEntitiesManager();
    }

    @Test
    public void testUpdateEntityPosition() {
        manager.updateEntityPosition(0, 5, 5);
        // no direct way to assert private fields; rely on behavior in this simple example
        manager.updateEntityPosition(1, 10, 10);
        manager.checkCollisions(); // should print no output
    }

    @Test
    public void testCheckCollisions() {
        manager.updateEntityPosition(0, 5, 5);
        manager.updateEntityPosition(1, 5, 5);
        manager.checkCollisions(); // collision expected between entities 0 and 1
    }
}
```

Save each of these test classes in their respective files named according to the class name with a `.java` extension. Ensure you have a test framework like JUnit in your classpath to run these tests.