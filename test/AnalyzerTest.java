import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mycal on 7/22/2015.
 * Test Analyzer objects
 */
public class AnalyzerTest {

    @Test
    public void isAPermutation() {
        int[] edges = new int[]{0, 2, 1};
        assertTrue(Analyzer.isAPermutation(edges));
    }

    @Test
    public void isAPermutationRepeat() {
        int[] edges = new int[]{0, 2, 2};
        assertFalse(Analyzer.isAPermutation(edges));
    }

    @Test
    public void isAPermutationLength() {
        int[] edgesLong = new int[]{0, 2, 1, 0};
        assertFalse(Analyzer.isAPermutation(edgesLong));

        int[] edgesShort = new int[]{0, 2};
        assertFalse(Analyzer.isAPermutation(edgesShort));
    }

    @Test
    public void hasSelfLoop() {
        int[] edges = new int[]{0, 2, 1};
        boolean reportedSelfLoop = Analyzer.containsSelfLoop(edges);
        assertTrue(reportedSelfLoop);
    }

    @Test
    public void notHasSelfLoop() {
        int[] edges = new int[]{1, 2, 0};
        boolean reportedSelfLoop = Analyzer.containsSelfLoop(edges);
        assertFalse(reportedSelfLoop);
    }
}