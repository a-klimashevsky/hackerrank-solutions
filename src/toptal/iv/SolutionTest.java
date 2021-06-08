package toptal.iv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 2/24/21.
 */
public class SolutionTest {
    @Test
    public void test1() throws Exception {
        int N = 4;
        int[] A = new int[]{1, 2, 4, 4, 3};
        int[] B = new int[]{2, 3, 1, 3, 1};
        boolean result = true;
        assetSolution(N, A, B, result);
    }

    @Test
    public void test2() throws Exception {
        int N = 4;
        int[] A = new int[]{1, 2, 1, 3};
        int[] B = new int[]{2, 4, 3, 4};
        boolean result = false;
        assetSolution(N, A, B, result);
    }

    @Test
    public void test3() throws Exception {
        int N = 6;
        int[] A = new int[]{2, 4, 5, 3};
        int[] B = new int[]{3, 5, 6, 4};
        boolean result = false;
        assetSolution(N, A, B, result);
    }

    @Test
    public void test4() throws Exception {
        int N = 3;
        int[] A = new int[]{1, 3};
        int[] B = new int[]{2, 2};
        boolean result = true;
        assetSolution(N, A, B, result);
    }

    private void assetSolution(int n, int[] a, int[] b, boolean exp) {
        Solution s = new Solution();
        boolean result = s.solution(n, a, b);
        assertEquals(exp, result);
    }


}
