import java.util.Scanner;

public class PlayerGrid {

    // Define an array to store the player's position on a 10x10 grid.
    // The player starts at position (0, 0).
    public static int[] playerPosition = {0, 0};

    public static void main(String[] args) {
        // Scanner instance to read player commands from the console
        Scanner scanner = new Scanner(System.in);
        char command;

        // Simple game loop to move the player based on input commands
        System.out.println("Player Control: W = Up, A = Left, S = Down, D = Right");
        System.out.println("Type 'X' to exit.");

        while (true) {
            System.out.print("Enter command: ");
            command = scanner.next().charAt(0);
            
            // Exit the loop if the player types 'X'
            if (command == 'X') {
                System.out.println("Exiting game.");
                break;
            }

            // Move the player based on the input command
            movePlayer(command);

            // Print the current position of the player
            System.out.println("Player's Current Position: (" + playerPosition[0] + ", " + playerPosition[1] + ")");
        }

        scanner.close();
    }

    /**
     * Updates the player's position on the grid based on the given command.
     * 'W' - Move up
     * 'A' - Move left
     * 'S' - Move down
     * 'D' - Move right
     *
     * The player position is updated only if the new position is within
     * the bounds of the grid (0 to 9 for both axes).
     *
     * @param command the direction command ('W', 'A', 'S', 'D') to move the player
     */
    public static void movePlayer(char command) {
        switch (command) {
            case 'W': // Move up
                playerPosition[0] = Math.max(0, playerPosition[0] - 1);
                break;
            case 'A': // Move left
                playerPosition[1] = Math.max(0, playerPosition[1] - 1);
                break;
            case 'S': // Move down
                playerPosition[0] = Math.min(9, playerPosition[0] + 1);
                break;
            case 'D': // Move right
                playerPosition[1] = Math.min(9, playerPosition[1] + 1);
                break;
            default:
                System.out.println("Invalid command. Please use W, A, S, D.");
                break;
        }
    }
}