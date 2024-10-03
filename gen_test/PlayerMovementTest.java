package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerMovementTest {

    @Test
    public void testMovePlayerUp() {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int[] playerPosition = {1, 1};
        PlayerMovement.movePlayer(grid, playerPosition, "up");
        assertArrayEquals(new int[]{0, 1}, playerPosition);
    }

    @Test
    public void testMovePlayerDown() {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int[] playerPosition = {1, 1};
        PlayerMovement.movePlayer(grid, playerPosition, "down");
        assertArrayEquals(new int[]{2, 1}, playerPosition);
    }

    @Test
    public void testMovePlayerLeft() {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int[] playerPosition = {1, 1};
        PlayerMovement.movePlayer(grid, playerPosition, "left");
        assertArrayEquals(new int[]{1, 0}, playerPosition);
    }

    @Test
    public void testMovePlayerRight() {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int[] playerPosition = {1, 1};
        PlayerMovement.movePlayer(grid, playerPosition, "right");
        assertArrayEquals(new int[]{1, 2}, playerPosition);
    }

    @Test
    public void testMoveBlockedByBoundary() {
        int[][] grid = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        int[] playerPosition = {0, 0};
        PlayerMovement.movePlayer(grid, playerPosition, "up");
        assertArrayEquals(new int[]{0, 0}, playerPosition);
    }

    @Test
    public void testMoveBlockedByEnemy() {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, -1},
            {0, 0, 0}
        };
        int[] playerPosition = {1, 1};
        PlayerMovement.movePlayer(grid, playerPosition, "right");
        assertArrayEquals(new int[]{1, 1}, playerPosition);
    }
}
```