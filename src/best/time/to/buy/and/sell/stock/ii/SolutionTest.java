package best.time.to.buy.and.sell.stock.ii;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 2/19/21.
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        int result = s.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(7, result);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int result = s.maxProfit(new int[]{1, 2, 3, 4, 5});
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        int result = s.maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, result);
    }
}
