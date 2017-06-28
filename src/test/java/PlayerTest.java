import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    void selectNewDoorReturnsExpectedIndex() {
        int newSelection = player.selectNewDoor(0,1);
        assertThat(newSelection, is(equalTo(2)));
    }

    @Test
    void selectedDoorHasIndexOfZeroUpToTwo() {
        assertThat(player.selectDoor(), allOf(greaterThanOrEqualTo(0), lessThan(3)));
    }

    @Test
    void aPlayerWithNoWinsHasZeroWins() {
        assertThat(player.getWins(), comparesEqualTo(0));
    }

    @Test
    void aWinIncrementsThePlayerWinsByOne() {
        player.win();
        assertThat(player.getWins(), comparesEqualTo(1));
    }


}