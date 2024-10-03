package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemiesTest {

    @Test
    public void testInitializeGrid() {
        Enemies.initializeGrid();
        assertEquals('P', Enemies.getGrid()[0][0]);
        assertEquals('.', Enemies.getGrid()[0][1]);
    }

    @Test
    public void testGenerateEnemies() {
        Enemies.initializeGrid();
        Enemies.generateEnemies(5);
        
        int enemyCount = 0;
        for (char[] row : Enemies.getGrid()) {
            for (char cell : row) {
                if (cell == 'E') {
                    enemyCount++;
                }
            }
        }
        assertEquals(5, enemyCount);
    }
}

// GameWorldTest.java

import org.junit.Test;
import static org.junit.Assert.*;

