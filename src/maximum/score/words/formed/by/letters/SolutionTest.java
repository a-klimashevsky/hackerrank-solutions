package maximum.score.words.formed.by.letters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexk on 3/28/21.
 */
public class SolutionTest {
    @Test
    public void test1() {
        String[] words = new String[]{"dog", "cat", "dad", "good"};
        char[] letters = new char[]{'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score = new int[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Solution s = new Solution();
        int result = s.maxScoreWords(words, letters, score);

        assertEquals(23, result);
    }

    @Test
    public void test2() {
        String[] words = new String[]{"xxxz", "ax", "bx", "cx"};
        char[] letters = new char[]{'z', 'a', 'b', 'c', 'x', 'x', 'x'};
        int[] score = new int[]{4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10};
        Solution s = new Solution();
        int result = s.maxScoreWords(words, letters, score);

        assertEquals(27, result);
    }

}
