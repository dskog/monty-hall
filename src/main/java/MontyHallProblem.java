public class MontyHallProblem {

    public static void main(String[] args) {
        int winsNoSwitch = 0;
        int winsWithSwitch = 0;
        for (int rounds = 0; rounds < 10000; rounds += 1) {
            GameHost gameHost = new GameHost();
            Player player = new Player();

            int selection = player.selectDoor();
            gameHost.setPlayerSelectedDoor(selection);

            if (gameHost.isSelectedDoorCorrect()) {
                winsNoSwitch += 1;
            }

            int incorrectDoor = gameHost.revealIncorrectDoor();
            int newSelection = player.selectNewDoor(incorrectDoor, selection);
            gameHost.setPlayerSelectedDoor(newSelection);

            if (gameHost.isSelectedDoorCorrect()) {
                winsWithSwitch += 1;
            }

        }

        System.out.println(String.format("Without switch wins: %s times of 10000 attempts", winsNoSwitch));
        System.out.println(String.format("With switch wins: %s times of 10000 attempts", winsWithSwitch));

    }
}
