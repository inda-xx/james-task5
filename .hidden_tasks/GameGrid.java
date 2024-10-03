public class GameGrid {

    /**
     * Move the player in the grid based on the given direction.
     * 
     * @param grid     a 2D char array representing the game grid
     * @param currentX the current X position of the player in the grid
     * @param currentY the current Y position of the player in the grid
     * @param direction a char representing the direction ('N', 'S', 'E', 'W')
     */
    public static void movePlayer(char[][] grid, int currentX, int currentY, char direction) {
        // Check if current position is within grid bounds
        if (isInBounds(grid, currentX, currentY)) {
            // Remove player from current position
            grid[currentX][currentY] = '.';

            // Calculate new position based on direction
            int newX = currentX;
            int newY = currentY;

            switch (direction) {
                case 'N':
                    newX = currentX - 1;
                    break;
                case 'S':
                    newX = currentX + 1;
                    break;
                case 'E':
                    newY = currentY + 1;
                    break;
                case 'W':
                    newY = currentY - 1;
                    break;
                default:
                    System.out.println("Invalid direction. Use 'N', 'S', 'E', or 'W'.");
                    break;
            }

            // Check if new position is within grid bounds
            if (isInBounds(grid, newX, newY)) {
                // Place player at new position
                grid[newX][newY] = 'P';
            } else {
                // Restore player to original position if the new position is out of bounds
                System.out.println("Move out of bounds. Player remains in the same position.");
                grid[currentX][currentY] = 'P';
            }
        } else {
            System.out.println("Current position is out of bounds.");
        }
    }

    /**
     * Check if a given position is within the bounds of the grid.
     * 
     * @param grid a 2D char array representing the game grid
     * @param x    the x-coordinate to check
     * @param y    the y-coordinate to check
     * @return true if the position is within bounds, false otherwise
     */
    private static boolean isInBounds(char[][] grid, int x, int y) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
    }

    public static void main(String[] args) {
        // Sample usage
        char[][] grid = {
            { '.', '.', '.', '.' },
            { '.', '.', '.', '.' },
            { '.', '.', '.', '.' },
            { '.', '.', '.', '.' }
        };

        // Initial player position
        int startX = 1;
        int startY = 1;
        grid[startX][startY] = 'P';
        
        // Display grid before and after the move
        printGrid(grid);
        movePlayer(grid, startX, startY, 'E');
        printGrid(grid);
    }

    /**
     * Print the grid to the console.
     * 
     * @param grid a 2D char array representing the game grid
     */
    private static void printGrid(char[][] grid) {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}