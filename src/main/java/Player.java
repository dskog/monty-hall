import java.util.Random;

public class Player {
    private Random random;
    private int selection;

    public Player() {
        this.random = new Random();
    }

    public int selectDoor() {
        return random.nextInt(3);
    }

    public int selectNewDoor(int incorrectDoorIndex, int oldSelection) {
        return 3 - incorrectDoorIndex - oldSelection;
    }
}
