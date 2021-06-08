package subarray.sum.equals.k;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() throws Exception {
        final int[] nums = new int[]{1, 1, 1};
        final int k = 2;
        Solution s = new Solution();
        final int res = s.subarraySum(nums, k);

        Assert.assertEquals(2, res);
    }

    @Test
    public void test2() throws Exception {
        final int[] nums = new int[]{1, 2, 3};
        final int k = 3;
        Solution s = new Solution();
        final int res = s.subarraySum(nums, k);

        Assert.assertEquals(2, res);
    }
}
