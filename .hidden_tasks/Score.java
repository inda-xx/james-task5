import java.util.List;
import java.util.ArrayList;

public class Score {
    private ArrayList<Integer> scores = new ArrayList<>();

    public void addScore(int score) {
        scores.add(score);
    }

    public void removeScore(int score) {
        scores.remove((Integer) score);
    }

    public int totalScore() {
        return scores.stream().mapToInt(Integer::intValue).sum();
    }

    public void printScores() {
        System.out.println("Scores: " + scores);
    }
}