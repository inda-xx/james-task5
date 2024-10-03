package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameWorldTest {

    @Test
    public void testMakeMove() {
        GameWorld.initializeGrid();
        GameWorld.makeMove('S');
        
        assertEquals('.', GameWorld.getGrid()[0][0]);
        assertEquals('P', GameWorld.getGrid()[1][0]);
    }

    @Test
    public void testMakeMoveBoundary() {
        GameWorld.initializeGrid();
        GameWorld.makeMove('W');
        assertEquals('P', GameWorld.getGrid()[0][0]);
        
        GameWorld.makeMove('A');
        assertEquals('P', GameWorld.getGrid()[0][0]);
    }

    @Test
    public void testMakeInvalidMove() {
        GameWorld.initializeGrid();
        GameWorld.makeMove('X');
        assertEquals('P', GameWorld.getGrid()[0][0]); // No movement should occur
    }
}

// PowerUpTest.java

import org.junit.Test;
import static org.junit.Assert.*;

