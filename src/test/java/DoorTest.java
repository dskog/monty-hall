import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DoorTest {

    @Test
    void aDoorIsTheRightDoorIfCreatedThatWay() {
        Door aDoor = new Door(true);
        assertTrue(aDoor.isTheRightDoor());
    }

    @Test
    void aDoorIsNotTheRightDoorIfCreatedThatWay() {
        Door aDoor = new Door(false);
        assertFalse(aDoor.isTheRightDoor());
    }

}