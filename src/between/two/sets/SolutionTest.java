package between.two.sets;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGcd() throws Exception {
        Solution solution = new Solution();
        long gcd = solution.gcd(6, 2);
        assertEquals(2, gcd);
        gcd = solution.gcd(5, 2);
        assertEquals(1, gcd);
        gcd = solution.gcd(100, 15);
        assertEquals(5, gcd);
    }

    @Test
    public void testGcdArray() throws Exception {
        Solution solution = new Solution();
        long gcd = solution.gcd(new int[]{16, 32, 96});
        assertEquals(16, gcd);
    }

    @Test
    public void testLcm() throws Exception {
        Solution solution = new Solution();
        long lcm = solution.lcm(6, 4);
        assertEquals(12, lcm);
        lcm = solution.lcm(4, 2);
        assertEquals(4, lcm);
    }

    @Test
    public void testLcmArray() throws Exception {
        Solution solution = new Solution();
        long lcm = solution.lcm(new int[]{2, 7, 5});
        assertEquals(70, lcm);
    }

    @Test
    public void testSolve() throws Exception {
        Solution solution = new Solution();
        int out = solution.solve(new int[]{2, 4}, new int[]{16, 32, 96});
        assertEquals(3, out);
        out = solution.solve(new int[]{100, 99, 98, 97, 96, 95, 94, 93, 92, 91},
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(0, out);
    }
}