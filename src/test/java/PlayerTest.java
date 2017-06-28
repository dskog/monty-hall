import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PlayerTest {

    @Test
    void selectNewDoorReturnsExpectedIndex() {
        Player player = new Player();
        int newSelection = player.selectNewDoor(0,1);
        assertThat(newSelection, is(equalTo(2)));
    }

    @Test
    void selectedDoorHasIndexOfZeroUpToTwo() {
        Player player = new Player();
        assertThat(player.selectDoor(), allOf(greaterThanOrEqualTo(0), lessThan(3)));
    }


}