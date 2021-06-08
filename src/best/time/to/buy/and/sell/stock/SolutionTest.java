package best.time.to.buy.and.sell.stock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 2/19/21.
 */
public class SolutionTest {

    @Test
    public void test1() throws Exception {
        Solution s = new Solution();
        int result = s.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, result);
    }

    @Test
    public void test2() throws Exception {
        Solution s = new Solution();
        int result = s.maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, result);
    }

}
