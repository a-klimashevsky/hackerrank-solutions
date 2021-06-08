package range.bitwise.and;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test5_and_7() throws Exception {
        Solution solution = new Solution();

        int result = solution.rangeBitwiseAnd(5, 7);

        Assert.assertEquals(4, result);
    }

    @Test
    public void test0and1() throws Exception {
        Solution solution = new Solution();

        int result = solution.rangeBitwiseAnd(0, 1);

        Assert.assertEquals(0, result);
    }

    @Test
    public void test1and3() throws Exception {
        Solution solution = new Solution();

        int result = solution.rangeBitwiseAnd(1, 3);

        Assert.assertEquals(0, result);
    }

    @Test
    public void test10and11() throws Exception {
        Solution solution = new Solution();

        int result = solution.rangeBitwiseAnd(10, 11);

        Assert.assertEquals(10, result);
    }

}
