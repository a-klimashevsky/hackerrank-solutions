package candy.replenishing.robot;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w30/challenges/candy-replenishing-robot
 */
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for (int c_i = 0; c_i < t; c_i++) {
            c[c_i] = in.nextInt();
        }
        in.close();
        Solution solution = new Solution();
        int result = solution.getAddedCandies(n, c);
        System.out.println(result);
    }

    int getAddedCandies(int n, int[] c) {
        int count = n;
        int result = 0;
        for (int i = 0; i < c.length - 1; i++) {
            count -= c[i];
            if (count < 5) {
                result += (n - count);
                count = n;
            }
        }
        return result;
    }

}
