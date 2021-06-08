package toptal.iii;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexk on 2/24/21.
 */
public class SolutionTest {
    @Test
    public void test1() throws Exception {
        int Y = 2014;
        String A = "April";
        String B = "May";
        String W = "Wednesday";

        Solution s = new Solution();

        int result = s.solution(Y, A, B, W);

        Assert.assertEquals(7, result);
    }
}
