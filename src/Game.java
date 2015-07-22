/**
 * Created by Mycal on 7/21/2015.
 */
public class Game {
    private final int NUM_PLAYERS;
    private int[] assignments;

    public Game(int numPlayers){
        NUM_PLAYERS = numPlayers;
        assignments = new int[NUM_PLAYERS];
        initializeAssigments();
    }

    private void initializeAssigments(){
        for(int i = 0; i < NUM_PLAYERS; i ++){
            this.assignments[i] = i;
        }
    }

    public int getNUM_PLAYERS(){
        return this.NUM_PLAYERS;
    }

    public int[] getAssignments(){
        return this.assignments;
    }

    /**
     * Allows self-loops
     */
    public void scramble() {

    }
}