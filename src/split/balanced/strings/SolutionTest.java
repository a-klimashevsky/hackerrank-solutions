package split.balanced.strings;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testRLRRLLRLRL() throws Exception {
        Solution solution = new Solution();

        int count = solution.balancedStringSplit("RLRRLLRLRL");

        Assert.assertEquals(4, count);
    }

    @Test
    public void testRLLLLRRRLR() throws Exception {
        Solution solution = new Solution();

        int count = solution.balancedStringSplit("RLLLLRRRLR");

        Assert.assertEquals(3, count);
    }

}