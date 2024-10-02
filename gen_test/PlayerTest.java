package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testInitialPosition() {
        Player player = new Player();
        int[] expected = {0, 0};
        assertArrayEquals(expected, player.getPosition());
    }

    @Test
    public void testMoveUp() {
        Player player = new Player();
        player.moveUp();
        int[] expected = {0, -1};
        assertArrayEquals(expected, player.getPosition());
    }

    @Test
    public void testMoveDown() {
        Player player = new Player();
        player.moveDown();
        int[] expected = {0, 1};
        assertArrayEquals(expected, player.getPosition());
    }

    @Test
    public void testMoveLeft() {
        Player player = new Player();
        player.moveLeft();
        int[] expected = {-1, 0};
        assertArrayEquals(expected, player.getPosition());
    }

    @Test
    public void testMoveRight() {
        Player player = new Player();
        player.moveRight();
        int[] expected = {1, 0};
        assertArrayEquals(expected, player.getPosition());
    }

    @Test
    public void testMultipleMoves() {
        Player player = new Player();
        player.moveUp();
        player.moveRight();
        player.moveDown();
        player.moveLeft();
        int[] expected = {0, 0};
        assertArrayEquals(expected, player.getPosition());
    }
}

