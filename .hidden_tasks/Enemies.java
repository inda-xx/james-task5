import java.util.Random;

public class Enemies {
    private static final int SIZE = 10;
    private static char[][] grid = new char[SIZE][SIZE];
    private static Random random = new Random();

    public static void main(String[] args) {
        initializeGrid();
        generateEnemies(5);
        printGrid();
    }

    private static void initializeGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = '.';
            }
        }
        grid[0][0] = 'P'; // Place player initially
    }

    private static void generateEnemies(int count) {
        while (count > 0) {
            int x = random.nextInt(SIZE);
            int y = random.nextInt(SIZE);

            if (grid[x][y] == '.') {
                grid[x][y] = 'E';
                count--;
            }
        }
    }

    private static void printGrid() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}