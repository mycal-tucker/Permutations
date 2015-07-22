import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mycal on 7/21/2015.
 * Game object allows self-loops
 */
public class Game {
    private final int NUM_PLAYERS;
    private int[] assignments;

    public Game(int numPlayers){
        NUM_PLAYERS = numPlayers;
        assignments = new int[NUM_PLAYERS];
        initializeAssigments();
    }

    /**
     * Assigns only self-loops to start with
     */
    private void initializeAssigments(){
        for(int i = 0; i < NUM_PLAYERS; i ++){
            this.assignments[i] = i;
        }
    }

    public int getNUM_PLAYERS(){
        return this.NUM_PLAYERS;
    }

    public int[] getAssignments(){
        return this.assignments.clone();
    }

    /**
     * Allows self-loops
     */
    public void scramble() {
        ArrayList<Integer> assignmentList = ListConverters.convertToArrayList(this.assignments);
        java.util.Collections.shuffle(assignmentList);

    }


}