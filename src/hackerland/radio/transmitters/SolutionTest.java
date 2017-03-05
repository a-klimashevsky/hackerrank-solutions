package hackerland.radio.transmitters;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by alexk on 3/4/17.
 */
public class SolutionTest {
    @Test
    public void testCalculateTransmittersCount1() throws Exception {
        Solution solution = new Solution();
        int out = solution.calculateTransmittersCount(2, 7, 2, 4, 6, 5, 9, 12, 11);
        assertEquals(3, out);
    }

    @Test
    public void testCalculateTransmittersCount2() throws Exception {
        Solution solution = new Solution();
        int out = solution.calculateTransmittersCount(1, 1, 2, 3, 4, 5);
        assertEquals(2, out);
    }
}