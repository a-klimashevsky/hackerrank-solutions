package toptal.i;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 2/24/21.
 */
public class SolutionTest {

    @Test
    public void test1() throws Exception {
        Solution s = new Solution();
        String[] A = new String[]{"pim", "pom"};
        String[] B = new String[]{"999999999", "777888999"};
        String P = "88999";
        String contact = s.solution(A, B, P);

        assertEquals("pom", contact);

    }

    @Test
    public void test2() throws Exception {
        Solution s = new Solution();
        String[] A = new String[]{"sander", "amy", "ann", "michael"};
        String[] B = new String[]{"100222333", "222333444", "010222999", "999123777"};
        String P = "1";
        String contact = s.solution(A, B, P);

        assertEquals("ann", contact);

    }

    @Test
    public void test3() throws Exception {
        Solution s = new Solution();
        String[] A = new String[]{"adam", "eva", "leo"};
        String[] B = new String[]{"100222333", "222333444", "010222999"};
        String P = "987";
        String contact = s.solution(A, B, P);

        assertEquals("NO CONTACT", contact);

    }

}
