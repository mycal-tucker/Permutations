import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Mycal on 7/22/2015.
 * Test the list converting tools
 */
public class ListConvertersTest {
    @Test
    public void convertToArrayList() {
        int[] assignments = new int[]{0, 3, 1, 2};
        ArrayList<Integer> assignmentsList = ListConverters.convertToArrayList(assignments);

        for (int i = 0; i < assignments.length; i ++) {
            assertEquals(assignments[i], assignmentsList.get(i).intValue());
        }
    }
}