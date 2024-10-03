import java.util.List;

import java.util.ArrayList;
import java.util.Collections;

public class GameScoreManager {

    /**
     * Updates the scores list by adding a new score.
     * If the scoreToAdd is greater than zero, the score is added to the list.
     * Negative scores are not added.
     * 
     * @param scores ArrayList of existing scores
     * @param scoreToAdd the score to add
     */
    public static void updateScores(ArrayList<Integer> scores, int scoreToAdd) {
        if (scoreToAdd > 0) {
            scores.add(scoreToAdd);
        }
    }
    
    /**
     * Retrieves the highest score from the scores list.
     * 
     * @param scores ArrayList of scores
     * @return the highest score, or zero if the list is empty
     */
    public static int getHighestScore(ArrayList<Integer> scores) {
        if (scores.isEmpty()) {
            return 0;
        }
        return Collections.max(scores);
    }

    /**
     * Sorts the scores list in descending order.
     * 
     * @param scores ArrayList of scores
     */
    public static void sortScoresDescending(ArrayList<Integer> scores) {
        Collections.sort(scores, Collections.reverseOrder());
    }

    /**
     * Displays the scores in a formatted manner.
     * 
     * @param scores ArrayList of scores
     */
    public static void displayScores(ArrayList<Integer> scores) {
        System.out.println("Scores:");
        for (Integer score : scores) {
            System.out.println(score);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        
        updateScores(scores, 50);
        updateScores(scores, 75);
        updateScores(scores, -10); // Negative score, should not be added
        updateScores(scores, 100);

        System.out.println("Initial Scores:");
        displayScores(scores);
        
        System.out.println("Highest Score: " + getHighestScore(scores));
        
        sortScoresDescending(scores);
        System.out.println("Sorted Scores (Descending):");
        displayScores(scores);
    }
}