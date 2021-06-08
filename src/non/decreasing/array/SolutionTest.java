package non.decreasing.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 2/25/21.
 */
public class SolutionTest {
    @Test
    public void test1() throws Exception {
        Solution s = new Solution();

        boolean result = s.checkPossibility(new int[]{4, 2, 3});

        assertEquals(true, result);
    }

    @Test
    public void test2() throws Exception {
        Solution s = new Solution();

        boolean result = s.checkPossibility(new int[]{4, 2, 1});

        assertEquals(false, result);
    }

    @Test
    public void test3() throws Exception {
        Solution s = new Solution();

        boolean result = s.checkPossibility(new int[]{3, 4, 2, 3});

        assertEquals(false, result);
    }

    @Test
    public void test4() throws Exception {
        Solution s = new Solution();

        boolean result = s.checkPossibility(new int[]{-1, 4, 2, 3});

        assertEquals(true, result);
    }

    @Test
    public void test5() throws Exception {
        Solution s = new Solution();
        boolean result = s.checkPossibility(new int[]{2, 3, 3, 2, 2});

        assertEquals(false, result);
    }
}
