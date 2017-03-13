package sherlock.and.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by alexk on 3/12/17.
 */
public class SolutionTest {
    @Test
    public void hasPivot() throws Exception {
        Solution solution = new Solution();
        boolean has = solution.hasPivot(new int[]{1, 2, 3});
        assertFalse(has);

        has = solution.hasPivot(new int[]{1, 2, 3, 3});
        assertTrue(has);
    }

}