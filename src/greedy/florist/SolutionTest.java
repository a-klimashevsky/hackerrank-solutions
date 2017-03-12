package greedy.florist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void getMinPrice() throws Exception {
        int price = solution.getMinPrice(new int[]{2, 5, 6}, 3);
        assertEquals(13, price);

        price = solution.getMinPrice(new int[]{2, 5, 6}, 2);
        assertEquals(15, price);
    }

}