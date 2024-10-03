import java.util.List;

```java
// File: EnemyManager.java
import java.util.ArrayList;

public class EnemyManager {
    private static ArrayList<int[]> enemies = new ArrayList<>();
    
    /**
     * Spawns a new enemy at the specified coordinates.
     *
     * @param x the x-coordinate of the enemy
     * @param y the y-coordinate of the enemy
     */
    public static void spawnEnemy(int x, int y) {
        enemies.add(new int[]{x, y});
    }
    
    /**
     * Detects whether the player has collided with any enemy.
     *
     * @param playerPosition an array containing the player's x and y coordinates
     * @return true if there is a collision, false otherwise
     */
    public static boolean detectCollision(int[] playerPosition) {
        for (int[] enemy : enemies) {
            if (enemy[0] == playerPosition[0] && enemy[1] == playerPosition[1]) {
                return true; // Collision detected
            }
        }
        return false; // No collision
    }
}
```

```java
// File: EnemyManagerTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyManagerTest {

    @Test
    public void testSpawnEnemyAndDetectCollision() {
        // Clear any previous state (usually a good practice for static lists in tests)
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
// File: Main.java
public class Main {
    public static void main(String[] args) {
        EnemyManager.spawnEnemy(5, 5);
        EnemyManager.spawnEnemy(10, 10);
        
        int[] playerPosition = {5, 5};
        
        if (EnemyManager.detectCollision(playerPosition)) {
            System.out.println("Collision detected!");
        } else {
            System.out.println("No collision.");
        }
    }
}
```

```xml
<!-- File: build.xml -->
<project name="EnemyManagerProject" default="compile" basedir=".">
    <property name="src.dir" value="."/>
    <property name="build.dir" value="bin"/>
    
    <target name="clean">
        <delete dir="${build.dir}"/>
    </target>
    
    <target name="compile" depends="clean">
        <mkdir dir="${build.dir}"/>
        <javac srcdir="${src.dir}" destdir="${build.dir}" includeantruntime="false">
            <classpath>
                <pathelement location="junit-4.12.jar"/>
            </classpath>
        </javac>
    </target>
    
    <target name="run-tests" depends="compile">
        <junit haltonfailure="yes" printsummary="yes">
            <classpath>
                <pathelement location="${build.dir}"/>
                <pathelement location="junit-4.12.jar"/>
                <pathelement location="hamcrest-core-1.3.jar"/>
            </classpath>
            <formatter type="plain"/>
            <batchtest fork="no" todir="./results">
                <fileset dir="${build.dir}