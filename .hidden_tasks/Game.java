public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Score score = new Score();
        Enemy enemies = new Enemy();

        // Main game loop
        for (int i = 0; i < 10; i++) {
            player.moveRight();
            score.addScore(10);
            enemies.moveEnemies();

            // Print status
            player.printPosition();
            score.printScores();
            enemies.printPositions();
        }

        // Final total score
        System.out.println("Final Total Score: " + score.totalScore());
    }
}