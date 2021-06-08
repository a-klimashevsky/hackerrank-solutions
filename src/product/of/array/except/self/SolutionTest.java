package product.of.array.except.self;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by alexk on 2/22/21.
 */
public class SolutionTest {
    @Test
    public void test() throws Exception {
        Solution s = new Solution();

        int[] result = s.productExceptSelf(new int[]{1, 2, 3, 4});

        assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }
}
