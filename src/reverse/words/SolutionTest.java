package reverse.words;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/12/17.
 */
public class SolutionTest {
    @Test
    public void test_the_sky_is_blue() throws Exception {
        Solution s = new Solution();
        String result = s.reverseWords("the sky is blue");
        assertEquals("blue is sky the", result);
    }

    @Test
    public void test_hello_world() throws Exception {
        Solution s = new Solution();
        String result = s.reverseWords("  hello world  ");
        assertEquals("world hello", result);
    }

}
