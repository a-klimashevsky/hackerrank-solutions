package decode.string;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test_aaabcbc() throws Exception {
        Solution s = new Solution();

        String result = s.decodeString("3[a]2[bc]");

        Assert.assertEquals("aaabcbc", result);
    }

    @Test
    public void test_accaccacc() throws Exception {
        Solution s = new Solution();

        String result = s.decodeString("3[a2[c]]");

        Assert.assertEquals("accaccacc", result);
    }

    @Test
    public void test_abcabccdcdcdef() throws Exception {
        Solution s = new Solution();

        String result = s.decodeString("2[abc]3[cd]ef");

        Assert.assertEquals("abcabccdcdcdef", result);
    }

    @Test
    public void test_abccdcdcdxyz() throws Exception {
        Solution s = new Solution();

        String result = s.decodeString("abc3[cd]xyz");

        Assert.assertEquals("abccdcdcdxyz", result);
    }
}