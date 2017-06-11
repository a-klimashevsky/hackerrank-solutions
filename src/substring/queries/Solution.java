package substring.queries;

import java.util.Scanner;

/**
 * Created by alexk on 3/19/17.
 */
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String[] s = new String[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.next();
        }
        Solution solution = new Solution();
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int c = solution.maxSubString(s[x], s[y]);
            System.out.println(c);
        }
        in.close();
    }

    private int maxSubString(String a, String b) {
        if (a.equals(b)) {
            return a.length();
        }

        int[][] matrix = new int[a.length()][];

        int maxLength = 0;

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[b.length()];
            for (int j = 0; j < matrix[i].length; j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    if (i != 0 && j != 0) {
                        matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    } else {
                        matrix[i][j] = 1;
                    }
                    if (matrix[i][j] > maxLength) {
                        maxLength = matrix[i][j];
                    }
                }
            }
        }
        return maxLength;
    }
}
