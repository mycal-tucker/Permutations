/**
 * Created by Mycal on 7/21/2015.
 * Maybe adding will get rid of warning
 */
public class Analyzer {
    public static void main(String[] args) {
        final int numPlayersPerGame = 5;

        Game g = new Game(numPlayersPerGame);
        Game g2 = new GameWithoutSelf(numPlayersPerGame);
    }

    /**
     * Return true if all the numbers from 0 to edges.length show up exactly once in edges
     * @param edges array of assignments from one player to another
     * @return whether the assignment is an exact permutation
     */
    public static boolean isAPermutation(int[] edges) {
        boolean[] seenEdges = new boolean[edges.length];
        for (int currentEdge : edges) {
            if (currentEdge < 0 || currentEdge > edges.length) { //out of bounds
                return false;
            } else if (currentEdge > seenEdges.length - 1) { //too few edges given numbers
                return false;
            } else if (seenEdges[currentEdge]) { //already seen
                return false;
            } else {
                seenEdges[currentEdge] = true;
            }
        }
        return true;
    }


    /**
     * returns whether or not edges[i] ever equals i
     * @param edges array of assignments from one player to another
     * @return whether or not an edge ends where it starts
     */
    public static boolean containsSelfLoop(int[] edges) {
        for (int i = 0; i < edges.length; i ++) {
            if (edges[i] == i) {
                return true;
            }
        }
        return false;
    }
}
