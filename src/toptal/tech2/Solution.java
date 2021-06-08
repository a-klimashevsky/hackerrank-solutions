package toptal.tech2;

import java.io.PrintStream;

/**
 * Created by alexk on 2/26/21.
 */
public class Solution {

    private static final char MINE = 'X';

    public static void main(String[] args) {
        Solution s = new Solution();
        s.minesweeper(new String[]{"XOO", "OOO", "XXO"});
        System.out.println();
        s.minesweeper(new String[]{"XOOXXXOO", "OOOOXOXX", "XXOXXOOO", "OXOOOXXX", "OOXXXXOX", "XOXXXOXO", "OOOXOXOX", "XOXXOXOX"});
        System.out.println();
        s.minesweeper(new String[]{"OOOXXXOXX", "XXXXXXOXX", "XOOXXXXXX", "OOXXOXOXX", "XXXXXXXXX"});
    }

    void minesweeper(String[] board) {
        PrintStream writer = System.out;
        for (int i = 0; i < board.length; i++) {
            String line = board[i];
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == MINE) {
                    result.append(MINE);
                } else {
                    int c = countMines(i, j, board);
                    result.append(c);
                }
            }
            writer.println(result);
        }
    }

    int countMines(int i, int j, String[] board) {
        int count = 0;
        for (int l = i - 1; l < i + 2; l++) {
            for (int k = j - 1; k < j + 2; k++) {
                if (l >= 0 && l < board.length) {
                    if (k >= 0 && k < board[l].length()) {
                        if ((l != i) || (k != j)) {
                            if (board[l].charAt(k) == MINE) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
