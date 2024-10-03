package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyManagerTest {

    @Test
    public void testSpawnEnemyAndDetectCollision() {
        EnemyManager.spawnEnemy(1, 1);
        EnemyManager.spawnEnemy(2, 2);
        EnemyManager.spawnEnemy(3, 3);

        assertFalse("Player should not collide initially", EnemyManager.detectCollision(new int[]{0, 0}));
        assertTrue("Player collides at (1,1)", EnemyManager.detectCollision(new int[]{1, 1}));
        assertFalse("Player does not collide at (1,0)", EnemyManager.detectCollision(new int[]{1, 0}));
        assertTrue("Player collides at (2,2)", EnemyManager.detectCollision(new int[]{2, 2}));
        assertTrue("Player collides at (3,3)", EnemyManager.detectCollision(new int[]{3, 3}));
    }
}
```

```java
// File: PlayerMovementTest.java
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

