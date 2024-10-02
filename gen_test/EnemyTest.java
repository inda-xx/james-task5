package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    @Test
    public void testInitialPositions() {
        Enemy enemies = new Enemy();
        int[][] expected = {{1, 2}, {3, 4}, {5, 6}};
        assertArrayEquals(expected, enemies.getPositions());
    }

    @Test
    public void testMoveEnemies() {
        Enemy enemies = new Enemy();
        enemies.moveEnemies();
        int[][] expected = {{2, 1}, {4, 3}, {6, 5}};
        assertArrayEquals(expected, enemies.getPositions());
    }

    @Test
    public void testMultipleMoves() {
        Enemy enemies = new Enemy();
        enemies.moveEnemies();
        enemies.moveEnemies();
        int[][] expected = {{3, 0}, {5, 2}, {7, 4}};
        assertArrayEquals(expected, enemies.getPositions());
    }
}