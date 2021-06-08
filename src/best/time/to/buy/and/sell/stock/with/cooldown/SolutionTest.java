package best.time.to.buy.and.sell.stock.with.cooldown;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 2/22/21.
 */
public class SolutionTest {
    @Test
    public void test() throws Exception {
        int[] input = new int[]{1, 2, 3, 0, 2};
        Solution s = new Solution();
        int result = s.maxProfit(input);
        assertEquals(3, result);
    }

    @Test
    public void test1() throws Exception {
        int[] input = new int[]{2, 1, 4};
        Solution s = new Solution();
        int result = s.maxProfit(input);
        assertEquals(3, result);
    }

}
