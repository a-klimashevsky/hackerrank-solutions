package cherry.pickup.ii;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/31/21.
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        final int[][] grid = new int[][]{
                new int[]{3, 1, 1},
                new int[]{2, 5, 1},
                new int[]{1, 5, 5},
                new int[]{2, 1, 1}
        };
        final int count = s.cherryPickup(grid);

        assertEquals(24, count);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        final int[][] grid = new int[][]{
                new int[]{1, 0, 0, 0, 0, 0, 1},
                new int[]{2, 0, 0, 0, 0, 3, 0},
                new int[]{2, 0, 9, 0, 0, 0, 0},
                new int[]{0, 3, 0, 5, 4, 0, 0},
                new int[]{1, 0, 2, 3, 0, 0, 6}
        };
        final int count = s.cherryPickup(grid);

        assertEquals(28, count);
    }

}
