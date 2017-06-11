package range.modular.queries;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w30/challenges/range-modular-queries
 */
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        int n = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int a0 = 0; a0 < q; a0++) {
            int left = in.nextInt();
            int right = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int count = solution.getCount(a, left, right, y, x);
            System.out.println(count);
        }
        in.close();
    }

    int getCount(int[] a, int left, int right, int y, int x) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (a[i] % x == y) {
                count++;
            }
        }
        return count;
    }
}
