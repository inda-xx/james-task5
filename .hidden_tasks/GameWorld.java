import java.util.Scanner;

public class GameWorld {
    private static final int SIZE = 10;
    private static char[][] grid = new char[SIZE][SIZE];
    private static int playerX = 0;
    private static int playerY = 0;

    public static void main(String[] args) {
        initializeGrid();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            printGrid();
            System.out.println("Enter move (WASD): ");
            char move = scanner.next().toUpperCase().charAt(0);
            makeMove(move);
        }
    }
    
    private static void initializeGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = '.';
            }
        }
        grid[playerX][playerY] = 'P';
    }

    private static void printGrid() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static void makeMove(char direction) {
        int newX = playerX;
        int newY = playerY;

        switch (direction) {
            case 'W': newX = Math.max(0, playerX - 1); break;
            case 'S': newX = Math.min(SIZE - 1, playerX + 1); break;
            case 'A': newY = Math.max(0, playerY - 1); break;
            case 'D': newY = Math.min(SIZE - 1, playerY + 1); break;
            default: System.out.println("Invalid move!"); return;
        }
        
        grid[playerX][playerY] = '.';
        grid[newX][newY] = 'P';
        playerX = newX;
        playerY = newY;
    }
}