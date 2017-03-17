package poles;

import org.junit.Test;
import poles.Solution.Pole;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/16/17.
 */
public class SolutionTest {
    @Test
    public void cost1() throws Exception {
        Solution solution = new Solution();
        List<Solution.Pole> list = Arrays.asList(new Pole(20, 1), new Pole(30, 1), new Pole(40, 1));
        long cost = solution.cost(1, list);
        assertEquals(30, cost);
    }

    @Test
    public void cost2() throws Exception {
        Solution solution = new Solution();

        List<Pole> list = Arrays.asList(new Pole(10, 15), new Pole(12, 17), new Pole(16, 18), new Pole(18, 13), new Pole(30, 10), new Pole(32, 1));

        long cost = solution.cost(2, list);

        assertEquals(216, cost);
    }

}