import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mycal on 7/22/2015.
 * Test Game objects
 */
public class GameTest {

    @Test
    public void createAGame() {
        int numPlayers = 5;
        Game g = new Game(numPlayers);

        int fetchedNumPlayers = g.getNUM_PLAYERS();
        assertEquals(numPlayers, fetchedNumPlayers);
        assertEquals(numPlayers, g.getAssignments().length);
    }

    @Test
    public void modifyAssignments() {
        int numPlayers = 5;
        Game g = new Game(numPlayers);

        int[] assignments = g.getAssignments();
        assignments[0] += 1; //change it
        int[] freshAssignments = g.getAssignments();
        assertNotEquals(assignments[0], freshAssignments[0]);
    }
}