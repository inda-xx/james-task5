import java.util.List;
import java.util.ArrayList;

public class PowerUps {
    private static ArrayList<PowerUp> activePowerUps = new ArrayList<>();

    public static void activatePowerUp(PowerUp powerUp) {
        activePowerUps.add(powerUp);
        System.out.println("Activated power-up: " + powerUp.getType());
    }
    
    public static void deactivatePowerUp(PowerUp powerUp) {
        activePowerUps.remove(powerUp);
        System.out.println("Deactivated power-up: " + powerUp.getType());
    }

    public static void main(String[] args) {
        PowerUp invisibility = new PowerUp("Invisibility", 5);
        activatePowerUp(invisibility);
        // Assume some time has passed and deactivate
        deactivatePowerUp(invisibility);
    }
}