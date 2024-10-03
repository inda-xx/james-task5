package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerUpsTest {

    @Test
    public void testActivatePowerUp() {
        PowerUp powerUp = new PowerUp("Speed", 5);
        PowerUps.activatePowerUp(powerUp);
        // Check that the power-up is active
        assertTrue(PowerUps.getActivePowerUps().contains(powerUp));
    }

    @Test
    public void testDeactivatePowerUp() {
        PowerUp powerUp = new PowerUp("Speed", 5);
        PowerUps.activatePowerUp(powerUp);
        PowerUps.deactivatePowerUp(powerUp);
        // Check that the power-up is no longer active
        assertFalse(PowerUps.getActivePowerUps().contains(powerUp));
    }

    @Test(expected = NullPointerException.class)
    public void testDeactivateNonexistentPowerUp() {
        PowerUp powerUp = new PowerUp("Invisibility", 5);
        PowerUps.deactivatePowerUp(powerUp);
    }
}

// CounterTest.java

import org.junit.Test;
import static org.junit.Assert.*;

