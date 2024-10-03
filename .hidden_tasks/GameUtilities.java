// GameUtilities.java
public class GameUtilities {

    /**
     * Converts milliseconds to seconds.
     * This is a utility method and thus made static.
     * 
     * @param milliseconds the time in milliseconds
     * @return the time in seconds
     */
    public static double millisecondsToSeconds(long milliseconds) {
        return milliseconds / 1000.0;
    }

    /**
     * Calculates the distance between two points in a 2D space.
     * 
     * @param x1 the x-coordinate of the first point
     * @param y1 the y-coordinate of the first point
     * @param x2 the x-coordinate of the second point
     * @param y2 the y-coordinate of the second point
     * @return the distance between the two points
     */
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

// GameState.java
public class GameState {

    // Static field to track the score, shared across all instances
    private static int score = 0;

    // Instance field representing the name of the game state
    private String name;

    public GameState(String name) {
        this.name = name;
    }

    /**
     * Increment the score. Demonstrates the use of static
     * to keep a shared state across different parts of the game.
     */
    public static void incrementScore(int points) {
        score += points;
    }

    /**
     * Get the current score.
     * 
     * @return the current score
     */
    public static int getScore() {
        return score;
    }

    /**
     * Get the name of this specific game state instance.
     * 
     * @return the name of the game state
     */
    public String getName() {
        return name;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstration of static utility functions
        long milliseconds = 5000;
        double seconds = GameUtilities.millisecondsToSeconds(milliseconds);
        System.out.println(milliseconds + " milliseconds is " + seconds + " seconds.");

        double distance = GameUtilities.calculateDistance(0, 0, 3, 4);
        System.out.println("The distance between (0,0) and (3,4) is: " + distance);

        // Demonstration of static variable usage in game state
        GameState gameState1 = new GameState("Level 1");
        GameState.incrementScore(10);
        System.out.println("Score after Level 1: " + GameState.getScore());

        GameState gameState2 = new GameState("Level 2");
        GameState.incrementScore(20);
        System.out.println("Score after Level 2: " + GameState.getScore());
    }
}