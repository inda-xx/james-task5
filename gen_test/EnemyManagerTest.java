package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyManagerTest {

    @Before
    public void setUp() {
        EnemyManager.enemies.clear();
    }

    @Test
    public void testSpawnEnemy() {
        EnemyManager.spawnEnemy(3, 4);
        assertArrayEquals(new int[]{3, 4}, EnemyManager.enemies.get(0));
    }

    @Test
    public void testSpawnMultipleEnemies() {
        EnemyManager.spawnEnemy(3, 4);
        EnemyManager.spawnEnemy(1, 2);
        assertArrayEquals(new int[]{3, 4}, EnemyManager.enemies.get(0));
        assertArrayEquals(new int[]{1, 2}, EnemyManager.enemies.get(1));
    }

    @Test
    public void testMoveEnemiesSingleStep() {
        EnemyManager.spawnEnemy(1, 2);
        EnemyManager.moveEnemies();
        assertArrayEquals(new int[]{2, 3}, EnemyManager.enemies.get(0));
    }

    @Test
    public void testMoveEnemiesToPlayerPosition() {
        EnemyManager.spawnEnemy(5, 5);
        EnemyManager.moveEnemies();
        assertArrayEquals(new int[]{5, 5}, EnemyManager.enemies.get(0));
    }

    @Test
    public void testMoveMultipleEnemies() {
        EnemyManager.spawnEnemy(0, 0);
        EnemyManager.spawnEnemy(10, 10);
        EnemyManager.moveEnemies();
        assertArrayEquals(new int[]{1, 1}, EnemyManager.enemies.get(0));
        assertArrayEquals(new int[]{9, 9}, EnemyManager.enemies.get(1));
    }

    @Test
    public void testMoveEnemiesBoundary() {
        EnemyManager.spawnEnemy(-10, 100);
        EnemyManager.moveEnemies();
        assertArrayEquals(new int[]{-9, 99}, EnemyManager.enemies.get(0));
    }
}

// File name: PlayerTest.java

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

