package marcs.cakewalk;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/marcs-cakewalk
 */
class Solution {
    long calculateMiles(int[] calories) {
        Arrays.sort(calories);
        int n = calories.length;
        long result = 0;
        long pow = 1L;
        for (int i = 0; i < calories.length; i++) {
            result += calories[n - i - 1] * pow;
            pow = pow << 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for (int calories_i = 0; calories_i < n; calories_i++) {
            calories[calories_i] = in.nextInt();
        }
        Solution solution = new Solution();
        long answer = solution.calculateMiles(calories);
        System.out.println(answer);
    }
}
