package value.of.friendship;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexk on 1/14/17.
 */
public class SolutionTest {
    @Test
    public void superSum1() throws Exception {
        long out = Solution.superSum(1);
        assertEquals(0, out);
    }

    @Test
    public void superSum2() throws Exception {
        long out = Solution.superSum(2);
        assertEquals(2, out);
    }

    @Test
    public void superSum3() throws Exception {
        long out = Solution.superSum(3);
        assertEquals(8, out);
    }

    @Test
    public void superSum4() throws Exception {
        long out = Solution.superSum(4);
        assertEquals(20, out);
    }

    @Test
    public void superSum5() throws Exception {
        long out = Solution.superSum(5);
        assertEquals(40, out);
    }

}