package candy.replenishing.robot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/13/17.
 */
public class SolutionTest {
    @Test
    public void getAddedCandies() throws Exception {
        Solution solution = new Solution();
        int candies = solution.getAddedCandies(8, new int[]{3, 1, 7, 5});

        assertEquals(11, candies);

        candies = solution.getAddedCandies(8, new int[]{5, 2, 4});
        assertEquals(5, candies);
    }

}