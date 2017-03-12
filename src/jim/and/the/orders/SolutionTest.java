package jim.and.the.orders;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by alexk on 3/12/17.
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void getOrder() throws Exception {
        int[] order = solution.getOrder(new int[]{1, 2, 3}, new int[]{3, 3, 3});
        assertArrayEquals(new int[]{1, 2, 3}, order);
        order = solution.getOrder(new int[]{8, 4, 5, 3, 4}, new int[]{1, 2, 6, 1, 3});
        assertArrayEquals(new int[]{4, 2, 5, 1, 3}, order);
    }

}