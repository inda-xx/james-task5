public class Enemy {
    private int[][] positions = {{1, 2}, {3, 4}, {5, 6}};

    public void moveEnemies() {
        for (int[] position : positions) {
            position[0] += 1; // Move right
            position[1] -= 1; // Move up
        }
    }

    public void printPositions() {
        System.out.println("Enemy Positions:");
        for (int[] position : positions) {
            System.out.println("(" + position[0] + ", " + position[1] + ")");
        }
    }
}