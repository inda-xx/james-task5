package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerUpTest {

    @Test
    public void testPowerUpCreation() {
        PowerUp powerUp = new PowerUp("Shield", 10);
        assertEquals("Shield", powerUp.getType());
        assertEquals(10, powerUp.getDuration());
    }
}

// ScoringTest.java

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

