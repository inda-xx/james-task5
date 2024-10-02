public class Player {
    private int[] position = {0, 0};

    public void moveUp() {
        position[1]--;
    }

    public void moveDown() {
        position[1]++;
    }

    public void moveLeft() {
        position[0]--;
    }

    public void moveRight() {
        position[0]++;
    }

    public int[] getPosition() {
        return position;
    }

    public void printPosition() {
        System.out.println("Player Position: (" + position[0] + ", " + position[1] + ")");
    }
}