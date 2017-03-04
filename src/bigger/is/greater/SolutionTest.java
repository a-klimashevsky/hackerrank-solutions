package bigger.is.greater;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void solve() throws Exception {
        Solution solution = new Solution();
        String answer = solution.solve("ab");
        assertEquals("ba", answer);
        answer = solution.solve("bb");
        assertEquals("no answer", answer);
        answer = solution.solve("hefg");
        assertEquals("hegf", answer);
        answer = solution.solve("dhck");
        assertEquals("dhkc", answer);
        answer = solution.solve("dkhc");
        assertEquals("hcdk", answer);
    }

}