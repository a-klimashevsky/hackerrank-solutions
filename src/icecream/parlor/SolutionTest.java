package icecream.parlor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexk on 3/5/17.
 */
public class SolutionTest {

    @Test
    public void testFindFlawor1() throws Exception {
        Solution solution = new Solution();
        int[] out = solution.findFlavor(4, 1, 4, 5, 3, 2);
        assertArrayEquals(new int[]{1, 4}, out);
    }

    @Test
    public void testFindFlawor2() throws Exception {
        Solution solution = new Solution();
        int[] out = solution.findFlavor(4, 2, 2, 4, 3);
        assertArrayEquals(new int[]{1, 2}, out);
    }
}