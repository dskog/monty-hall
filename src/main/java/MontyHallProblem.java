public class MontyHallProblem {

    public static void main(String[] args) {
        int winsNoSwitch = 0;
        int winsWithSwitch = 0;
        for (int rounds = 0; rounds < 10000; rounds += 1) {
            ThreeDoors threeDoors = new ThreeDoors();
            Player player = new Player();
            int selection = player.selectDoor();

            if (threeDoors.getDoor(selection).isTheRightDoor()) {
                winsNoSwitch += 1;
            }

            int incorrectDoor = threeDoors.getIncorrectDoorIndex(selection);
            int newSelection = player.selectNewDoor(incorrectDoor, selection);

            if (threeDoors.getDoor(newSelection).isTheRightDoor()) {
                winsWithSwitch += 1;
            }

        }

        System.out.println(String.format("Without switch wins: %s times of 10000 attempts", winsNoSwitch));
        System.out.println(String.format("With switch wins: %s times of 10000 attempts", winsWithSwitch));

    }
}
