package range.modular.queries;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/17/17.
 */
public class SolutionTest {

    //    5 3
//            250 501 5000 5 4
//            0 4 5 0
//            0 4 10 0
//            0 4 3 2
    @Test
    public void getCount() throws Exception {
        int[] a = new int[]{250, 501, 5000, 5, 4};

        Solution solution = new Solution();

        int c = solution.getCount(a, 0, 4, 0, 5);

        assertEquals(3, c);

        c = solution.getCount(a, 0, 4, 0, 10);

        assertEquals(2, c);

        c = solution.getCount(a, 0, 4, 2, 3);

        assertEquals(2, c);
    }

}