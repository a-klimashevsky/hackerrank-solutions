package marcs.cakewalk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void calculateMiles1() throws Exception {
        Solution solution = new Solution();
        long answer = solution.calculateMiles(new int[]{1, 3, 2});


        assertEquals(11, answer);
    }

}