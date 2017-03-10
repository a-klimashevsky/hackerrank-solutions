package pairs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/10/17.
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void pairs() throws Exception {
        int out = solution.pairs(new int[]{1, 5, 3, 4, 2}, 2);
        assertEquals(3, out);
    }

}