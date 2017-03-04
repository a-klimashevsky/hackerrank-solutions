package choosing.white.balls;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexk on 1/14/17.
 */
public class SolutionTest {

    @Test
    public void giveProbality_WBBWWWB_3() throws Exception {
        String balls = "WBBWWWB";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 3);
        assertEquals(2.6380952380952385, prob, 0.0000001);
    }

    @Test
    public void giveProbality_BBWWWBB_3() throws Exception {
        String balls = "BBWWWBB";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 3);
        assertEquals(1.5714285714285714, prob, 0.0000001);
    }

    @Test
    public void giveProbality_WBBWWWBB_4() throws Exception {
        String balls = "WBBWWWBB";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 4);
        assertEquals(2.7809523809523813, prob, 0.0000001);
    }

    @Test
    public void giveProbality_BWW_1() throws Exception {
        String balls = "BWW";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 1);
        assertEquals(1, prob, 0.0000001);
    }

    @Test
    public void giveProbality_WBWB_2() throws Exception {
        String balls = "WBWB";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 2);
        assertEquals(1.5, prob, 0.0000001);
    }

    @Test
    public void giveProbality_WWW_3() throws Exception {
        String balls = "WWW";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 3);
        assertEquals(3, prob, 0.0000001);
    }

    @Test
    public void giveProbality_WWWWWWW_3() throws Exception {
        String balls = "WWWWWWW";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 3);
        assertEquals(3, prob, 0.0000001);
    }

    @Test
    public void giveProbality_WWWWWW_2() throws Exception {
        String balls = "WWWWWW";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 2);
        assertEquals(2, prob, 0.0000001);
    }

    @Test
    public void giveProbality_WW_2() throws Exception {
        String balls = "WW";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 2);
        assertEquals(2, prob, 0.0000001);
    }

    @Test
    public void giveProbality_WWWWW_1() throws Exception {
        String balls = "WWWWW";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 1);
        assertEquals(1, prob, 0.0000001);
    }

    @Test
    public void giveProbality_BBBBBB_3() throws Exception {
        String balls = "BBBBBB";
        Solution solution = new Solution(balls.length());
        double prob = solution.giveProbability(balls, 3);
        assertEquals(0, prob, 0.0000001);
    }
}