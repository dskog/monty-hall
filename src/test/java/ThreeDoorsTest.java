import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsEqual.equalTo;


class ThreeDoorsTest {
    ThreeDoors threeDoors;

    @BeforeEach
    void setUp() {
        threeDoors = new ThreeDoors();
    }

    @Test
    void getCorrectDoorIndexReturnsTheCorrectDoor() {
        int expectedCorrectDoorIndex = threeDoors.getCorrectDoorIndex();
        Door expectedCorrectDoor = threeDoors.getDoor(expectedCorrectDoorIndex);
        assertThat(expectedCorrectDoor.isTheRightDoor(), equalTo(true));
    }

    @Test
    void getDoor() {
        assertThat(threeDoors.getDoor(0), instanceOf(Door.class));
    }


}