import java.util.Random;

public class Player {
    private Random random;

    public Player() {
        this.random = new Random();
    }

    public int selectDoor() {
        return random.nextInt(3);
    }

    public int selectNewDoor(int incorrectDoorIndex, int previousSelectedDoor) {
        return 3 - incorrectDoorIndex - previousSelectedDoor;
    }
}
