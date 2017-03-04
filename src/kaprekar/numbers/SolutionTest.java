package kaprekar.numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexk on 1/10/17.
 */
public class SolutionTest {


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void solve() throws Exception {
        Solution solution  = new Solution();
        assertTrue(solution.isKaprekar(1));
        assertTrue(solution.isKaprekar(9));
        assertTrue(solution.isKaprekar(45));
        assertTrue(solution.isKaprekar(55));
        assertTrue(solution.isKaprekar(99));
        assertFalse(solution.isKaprekar(2));
        assertFalse(solution.isKaprekar(8));
        assertFalse(solution.isKaprekar(15));
        assertFalse(solution.isKaprekar(66));
        assertFalse(solution.isKaprekar(93));
    }
//1 9 45 55 99
}