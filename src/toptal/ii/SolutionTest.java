package toptal.ii;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * N in range 2..100
 * S consist of digits spaces or dashes
 * S contains 2 digits at least
 */
public class SolutionTest {
    @Test
    public void test1() throws Exception {
        String input = "00-44  48 5555 8361";
        Solution s = new Solution();
        assertEquals("004-448-555-583-61", s.solution(input));
    }

    @Test
    public void test2() throws Exception {
        String input = "0 - 22 1985--324";
        Solution s = new Solution();
        assertEquals("022-198-53-24", s.solution(input));
    }

    @Test
    public void test3() throws Exception {
        String input = "555372654";
        Solution s = new Solution();
        assertEquals("555-372-654", s.solution(input));
    }


    @Test
    public void test4() throws Exception {
        String input = "   ---   --- 1   ---  2 ---    ";
        Solution s = new Solution();
        assertEquals("12", s.solution(input));
    }

}
