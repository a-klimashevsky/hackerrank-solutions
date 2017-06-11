package reduced.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void super_reduced_string1() throws Exception {
        String out = solution.super_reduced_string("aaabccddd");
        assertEquals("abd", out);
    }


    @Test
    public void super_reduced_string2() throws Exception {
        String out = solution.super_reduced_string("baab");
        assertEquals("Empty String", out);
    }

    @Test
    public void super_reduced_string3() throws Exception {
        String out = solution.super_reduced_string("aa");
        assertEquals("Empty String", out);
    }

}