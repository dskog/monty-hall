import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsEqual.equalTo;


class ThreeDoorsTest {
    ThreeDoors threeDoors;

    @BeforeEach
    void setUp() {
        threeDoors = new ThreeDoors();
    }

    @Test
    void getIncorrectDoorIndexDoesNotReurnThePlayerSelectedDoorIndex() {
        int playerSelectedDoorIndex = 1;
        int incorrectDoorIndex = threeDoors.getIncorrectDoorIndex(playerSelectedDoorIndex);
        assertThat(incorrectDoorIndex, not(equalTo(playerSelectedDoorIndex)));

    }

    @Test
    void getIncorrectDoorIndexDoesNotReurnTheIndexOfTheCorrectDoor() {
        int playerSelectedDoorIndex = 2;
        int incorrectDoorIndex = threeDoors.getIncorrectDoorIndex(playerSelectedDoorIndex);
        Door expectedIncorrectDoor = threeDoors.getDoor(incorrectDoorIndex);
        assertThat(expectedIncorrectDoor.isTheRightDoor(), not(equalTo(true)));
    }

}