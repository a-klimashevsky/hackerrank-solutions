package angry.children;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/10/17.
 */
public class SolutionTest {
    @Test
    public void calculateUnfair1() throws Exception {
        Solution solution = new Solution();
        int unf = solution.calculateUnfair(new int[]{10,
                100,
                300,
                200,
                1000,
                20,
                30}, 3);
        assertEquals(20, unf);
    }

    @Test
    public void calculateUnfair2() throws Exception {
        Solution solution = new Solution();
        int unf = solution.calculateUnfair(new int[]{1,
                2,
                3,
                4,
                10,
                20,
                30,
                40,
                100,
                200}, 4);
        assertEquals(3, unf);
    }

    @Test
    public void calculateUnfair3() throws Exception {
        Solution solution = new Solution();
        int unf = solution.calculateUnfair(new int[]{100, 200, 300, 350, 400, 401, 402}, 3);
        assertEquals(2, unf);
    }
}