import java.util.List;
import java.util.ArrayList;
import java.util.Set;

// StaticKeywordExplanation.java

/**
 * This class provides answers to the questions about the static keyword in Java.
 */
public class StaticKeywordExplanation {

    /**
     * Answer to what the 'static' keyword signifies in Java.
     * 
     * Static variables/methods belong to the class, rather than any specific instance.
     * Use cases: constants and utility methods that don't depend on instance variables.
     */
    public static String staticKeywordExplanation() {
        return "The 'static' keyword in Java signifies that the particular field or method belongs to the class\n" +
               "itself, rather than to instances (objects) of that class. They are shared across all instances and\n" +
               "only one copy exists in memory. Static fields or methods can be accessed without creating an object\n" +
               "of the class. They are often used for constants, utility or helper methods that do not require\n" +
               "access to instance-specific data.";
    }

    /**
     * Provides a scenario in a game application where a static variable might be preferred.
     * 
     * In a game application, using static variables/methods might be appropriate to manage the game's state,
     * like score or configuration settings, which should be consistent across all instances of the game objects.
     */
    public static String gameScenarioWithStatic() {
        return "In a game application, a static variable can be utilized to track the number of players currently online or\n" +
               "the global high score. Since these values are shared across all game instances and do not rely on any\n" +
               "specific instance data, storing them as static ensures there is only one copy of these variables in memory.\n" +
               "For instance, accessing or updating the game's global high score is best managed through a static method,\n" +
               "ensuring consistency and ease of access across the entire application.";
    }

    public static void main(String[] args) {
        System.out.println(staticKeywordExplanation());
        System.out.println();
        System.out.println(gameScenarioWithStatic());
    }
}

// Arrays.java

/**
 * Reference solutions for Task 5, Arrays
 * This would not have been possible without my computer, a M1 Macbook Air.
 */
public class Arrays {

    /**
     * Count the average value of array with integers
     * @param array of integers
     * @return the average of element integer sum
     */
    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Average: " + average(sampleArray));
    }
}

// SetTheory.java

import java.util.ArrayList;

/**
 * Demonstrates set operations using ArrayList in Java.
 */
public class SetTheory {

    // The maximum threshold
    private static final int MAX = 100;

    /**
     * Generate an ArrayList between min and max
     * @param min lower bound, inclusive
     * @param max upper bound, non-inclusive
     * @return an ArrayList with all integers in [min, max - 1]
     */
    public static ArrayList<Integer> generateSet(int min, int max) {
        ArrayList<Integer> set = new ArrayList<>();
        if (min >= max) {
            // return empty list
            return set;
        } else {
            // Ternary operator to see if max > 100
            for (int i = Math.max(min, 0); i < Math.min(max, MAX); i++) {
                set.add(i);
            }
            return set;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> set = generateSet(10, 110);
        System.out.println("Generated Set: " + set);
    }
}