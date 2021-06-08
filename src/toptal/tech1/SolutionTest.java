package toptal.tech1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 2/26/21.
 */
public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void test1() throws Exception {
        int result = s.numberOfCarryOperations(123, 456);
        assertEquals(0, result);
    }

    @Test
    public void test2() throws Exception {
        int result = s.numberOfCarryOperations(555, 555);
        assertEquals(3, result);
    }

    @Test
    public void test3() throws Exception {
        int result = s.numberOfCarryOperations(900, 11);
        assertEquals(0, result);
    }

    @Test
    public void test4() throws Exception {
        int result = s.numberOfCarryOperations(145, 55);
        assertEquals(2, result);
    }

    @Test
    public void test5() throws Exception {
        int result = s.numberOfCarryOperations(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void test6() throws Exception {
        int result = s.numberOfCarryOperations(1, 99999);
        assertEquals(5, result);
    }

    @Test
    public void test7() throws Exception {
        int result = s.numberOfCarryOperations(999045, 1055);
        assertEquals(5, result);
    }

    @Test
    public void test8() throws Exception {
        int result = s.numberOfCarryOperations(101, 809);
        assertEquals(1, result);
    }

    @Test
    public void test9() throws Exception {
        int result = s.numberOfCarryOperations(189, 209);
        assertEquals(1, result);
    }

}
