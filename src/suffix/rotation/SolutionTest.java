package suffix.rotation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexk on 1/14/17.
 */
public class SolutionTest {

    Solution solution;

    @Before
    public void init ()  throws Exception{
        solution = new Solution();
    }

    @Test
    public void moveCount_abcdefghij() throws Exception {
        int count = solution.moveCount("abcdefghij");
        assertEquals(0, count);
    }

    @Test
    public void moveCount_acab() throws Exception {
        int count = solution.moveCount("acab");
        assertEquals(1, count);
    }

    @Test
    public void moveCount_baba() throws Exception {
        int count = solution.moveCount("baba");
        assertEquals(2, count);
    }

    @Test
    public void moveCount_a() throws Exception {
        int count = solution.moveCount("a");
        assertEquals(0, count);
    }

    @Test
    public void moveCount_aa() throws Exception {
        int count = solution.moveCount("aa");
        assertEquals(0, count);
    }

    @Test
    public void moveCount_cba() throws Exception {
        int count = solution.moveCount("cba");
        assertEquals(1, count);
    }

    @Test
    public void findPref_abc_0() throws Exception {
        String pref = solution.findPref("abc", 0);
        assertEquals("abc", pref);
    }

    @Test
    public void findPref_abc_2() throws Exception {
        String pref = solution.findPref("abc", 2);
        assertEquals("c", pref);
    }

    @Test
    public void findPref_cab_0() throws Exception {
        String pref = solution.findPref("cab", 0);
        assertEquals("ab", pref);
    }

    @Test
    public void findPref_cab_1() throws Exception {
        String pref = solution.findPref("cab", 1);
        assertEquals("ab", pref);
    }
}