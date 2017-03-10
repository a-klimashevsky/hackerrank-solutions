package angry.children;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/angry-children
 */
class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int K = Integer.parseInt(in.readLine());
        int[] list = new int[N];

        for (int i = 0; i < N; i++)
            list[i] = Integer.parseInt(in.readLine());



      /*
       * Write your code here, to process numPackets N, numKids K, and the packets of candies
       * Compute the ideal value for unfairness over here
      */
        Solution solution = new Solution();
        int out = solution.calculateUnfair(list, K);
        System.out.println(out);
    }

    int calculateUnfair(int[] list, int k) {
        int unfairness = Integer.MAX_VALUE;
        Arrays.sort(list);
        for (int i = 0; i < list.length - k + 1; i++) {
            int min = list[i];
            int max = list[i + k - 1];
            unfairness = Math.min(unfairness, max - min);
        }
        return unfairness;
    }
}
