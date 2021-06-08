package divide.two.integers;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test_10_3() throws Exception {
        Solution s = new Solution();
        int result = s.divide(10, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test_7_minus3() throws Exception {
        Solution s = new Solution();
        int result = s.divide(7, -3);
        Assert.assertEquals(-2, result);
    }

    @Test
    public void test_0_1() throws Exception {
        Solution s = new Solution();
        int result = s.divide(0, 1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void test_1_1() throws Exception {
        Solution s = new Solution();
        int result = s.divide(1, 1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test() throws Exception {
        Solution s = new Solution();
        int result = s.divide(-2147483648, -1);
        Assert.assertEquals(2147483647, result);
    }

    @Test
    public void test1() throws Exception {
        Solution s = new Solution();
        int result = s.divide(-2147483648, 1);
        Assert.assertEquals(-2147483648, result);
    }

    @Test
    public void test2() throws Exception {
        Solution s = new Solution();
        int result = s.divide(-9, 3);
        Assert.assertEquals(-3, result);
    }

    @Test
    public void test3() throws Exception {
        Solution s = new Solution();
        int result = s.divide(-2147483648, 2);
        Assert.assertEquals(
                -1073741824, result);
    }


}
