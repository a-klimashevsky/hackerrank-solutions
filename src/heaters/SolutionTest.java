package heaters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 4/18/21.
 */
public class SolutionTest {

    @Test
    public void test1() {
        int[] houses = new int[]{1, 2, 3, 4};
        int[] heaters = new int[]{1, 4};
        Solution s = new Solution();
        int result = s.findRadius(houses, heaters);
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int[] houses = new int[]{282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923};
        int[] heaters = new int[]{823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729, 823378840, 143542612};
        Solution s = new Solution();
        int result = s.findRadius(houses, heaters);
        assertEquals(161834419, result);
    }

}
