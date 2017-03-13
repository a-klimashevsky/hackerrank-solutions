package two.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/two-arrays
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = in.nextInt();
            }
            boolean can = solution.canPermutate(a, b, k);
            System.out.println(can ? "YES" : "NO");
        }
        in.close();
    }


    boolean canPermutate(int[] a, int[] b, int k) {
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] + b[n - i - 1] < k) return false;
        }
        return true;
    }
}
