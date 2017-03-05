package icecream.parlor;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
            }
            int[] out = solution.findFlavor(m, c);
            System.out.println(out[0] + " " + out[1]);
        }
        in.close();
    }

    int[] findFlavor(int pool, int... costs) {
        int i = 0;
        final int n = costs.length;
        while (i < n) {
            int j = i + 1;
            while (j < n) {
                if (pool == costs[i] + costs[j]) {
                    return new int[]{i + 1, j + 1};
                }
                j++;
            }
            i++;
        }
        return null;
    }
}
