package two.arrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by alexk on 3/12/17.
 */
public class SolutionTest {
    @Test
    public void canPermutate() throws Exception {
        Solution solution = new Solution();

        boolean can = solution.canPermutate(new int[]{2, 1, 3},
                new int[]{7, 8, 9}, 10);
        assertTrue(can);

        can = solution.canPermutate(new int[]{1, 2, 2, 1},
                new int[]{3, 3, 3, 4}, 5);
        assertFalse(can);
    }

}