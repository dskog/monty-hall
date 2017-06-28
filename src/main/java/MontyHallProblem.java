public class MontyHallProblem {

    public static void main(String[] args) {
        Player nonSwitchPlayer = new Player();
        Player switchingPlayer = new Player();
        int numberOfRounds = 10000;

        for (int rounds = 0; rounds < numberOfRounds; rounds += 1) {
            ThreeDoors threeDoors = new ThreeDoors();
            int selection = nonSwitchPlayer.selectDoor();

            if (threeDoors.getDoor(selection).isTheRightDoor()) {
                nonSwitchPlayer.win();
            }
        }

        for (int rounds = 0; rounds < numberOfRounds; rounds += 1) {
            ThreeDoors threeDoors = new ThreeDoors();
            int selection = switchingPlayer.selectDoor();

            int incorrectDoor = threeDoors.revealIncorrectDoor(selection);
            int newSelection = switchingPlayer.selectNewDoor(incorrectDoor, selection);

            if (threeDoors.getDoor(newSelection).isTheRightDoor()) {
                switchingPlayer.win();
            }

        }

        System.out.println(String.format("Without switch wins: %s times of %s attempts", nonSwitchPlayer.getWins(), numberOfRounds));
        System.out.println(String.format("With switch wins: %s times of %s attempts", switchingPlayer.getWins(), numberOfRounds));

    }
}
