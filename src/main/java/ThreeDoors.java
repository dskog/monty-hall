import java.util.Random;

public class ThreeDoors {
    private Door[] threeDoors;
    private int correctDoorIndex;
    private Random random = new Random();

    public ThreeDoors() {
        threeDoors = new Door[3];
        correctDoorIndex = random.nextInt(3);
        for(int i = 0; i < 3; i += 1) {
            if(i == correctDoorIndex) {
                threeDoors[i] = new Door(true);
            } else {
                threeDoors[i] = new Door(false);
            }
        }
    }

    public int getIncorrectDoorIndex(int selectedDoorIndex) {
        int incorrectDoorIndex;
        do {
            incorrectDoorIndex = random.nextInt(3);
        } while (selectedDoorIndex == incorrectDoorIndex || correctDoorIndex == incorrectDoorIndex);

        return incorrectDoorIndex;
    }

    public Door getDoor(int doorIndex) {
        return threeDoors[doorIndex];
    }

}
