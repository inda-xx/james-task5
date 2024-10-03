import java.util.Set;

```java
public class PlayerMovement {

    /**
     * Moves the player in the given direction within a 2D grid.
     * @param grid The 2D grid represented as a 2D int array. 
     *             0 represents empty space, 
     *             1 represents the player, 
     *            -1 represents an enemy.
     * @param playerPosition The player's current position in the grid as a 2-element array [row, column].
     * @param direction The direction to move the player ("up", "down", "left", "right").
     */
    public static void movePlayer(int[][] grid, int[] playerPosition, String direction) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Player's current position
        int currentRow = playerPosition[0];
        int currentCol = playerPosition[1];

        // Determine new position based on direction
        int newRow = currentRow;
        int newCol = currentCol;
        
        switch (direction.toLowerCase()) {
            case "up":
                newRow = currentRow - 1;
                break;
            case "down":
                newRow = currentRow + 1;
                break;
            case "left":
                newCol = currentCol - 1;
                break;
            case "right":
                newCol = currentCol + 1;
                break;
            default:
                System.out.println("Invalid direction");
                return;
        }

        // Check if new position is within boundaries and not occupied by an enemy
        if (isValidMove(newRow, newCol, rows, cols, grid)) {
            // Move the player to the new position
            grid[currentRow][currentCol] = 0; // Set current position to empty
            grid[newRow][newCol] = 1;        // Set new position to player
            // Update player's position
            playerPosition[0] = newRow;
            playerPosition[1] = newCol;
        } else {
            System.out.println("Move blocked: Boundary reached or enemy encountered.");
        }
    }

    /**
     * Validates whether the move to a new position is within the grid and not blocked by an enemy.
     * @param row The row index of the new position.
     * @param col The column index of the new position.
     * @param rows The total number of rows in the grid.
     * @param cols The total number of columns in the grid.
     * @param grid The 2D grid.
     * @return True if the move is valid, false otherwise.
     */
    private static boolean isValidMove(int row, int col, int rows, int cols, int[][] grid) {
        return row >= 0 && row < rows && col >= 0 && col < cols && grid[row][col] != -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            { 0, 0, 0, 0 },
            { 0, 1, 0, -1 },
            { 0, 0, 0, 0 },
        };

        int[] playerPosition = { 1, 1 }; // Player starts at (1, 1)

        movePlayer(grid, playerPosition, "up");
        movePlayer(grid, playerPosition, "right");
        movePlayer(grid, playerPosition, "down");
        movePlayer(grid, playerPosition, "left");
        movePlayer(grid, playerPosition, "left");
    }
}