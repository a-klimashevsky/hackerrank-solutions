package unique.paths.iii;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/28/21.
 */
public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] grid = new int[][]{new int[]{1, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{
                0, 0, 2, -1
        }};

        int result = s.uniquePathsIII(grid);

        assertEquals(2, result);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[][] grid = new int[][]{new int[]{1, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{
                0, 0, 0, 2
        }};

        int result = s.uniquePathsIII(grid);

        assertEquals(4, result);
    }
}
