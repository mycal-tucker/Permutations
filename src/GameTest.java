import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mycal on 7/22/2015.
 */
public class GameTest {

    @Test
    public void createAGame() {
        int numPlayers = 5;
        Game g = new Game(5);

        int fetchedNumPlayers = g.getNUM_PLAYERS();
        assertEquals(numPlayers, fetchedNumPlayers);
        assertEquals(numPlayers, g.getAssignments().length);
    }


}