import java.util.List;
import java.util.ArrayList;

public class Scoring {
    private static ArrayList<Integer> scores = new ArrayList<>();
    private static int totalScore = 0;

    public static void addScore(int points) {
        scores.add(points);
        totalScore += points;
    }
    
    public static void displayScores() {
        System.out.println("Scores: " + scores);
        System.out.println("Total Score: " + totalScore);
    }
    
    public static void main(String[] args) {
        addScore(10);
        addScore(20);
        displayScores();
    }
}