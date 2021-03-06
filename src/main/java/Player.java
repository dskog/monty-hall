import java.util.Random;

public class Player {
    private Random random;
    private int wins;

    public Player() {
        this.random = new Random();
    }

    public int selectDoor() {
        return random.nextInt(3);
    }

    public int selectNewDoor(int incorrectDoorIndex, int oldSelection) {
        return 3 - incorrectDoorIndex - oldSelection;
    }

    public void win() {
        wins += 1;
    }

    public int getWins() {
        return wins;
    }
}
