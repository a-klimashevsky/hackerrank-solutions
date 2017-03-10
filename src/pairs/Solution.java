package pairs;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/pairs
 */
class Solution {
    int pairs(int[] a, int k) {
        boolean[] present = new boolean[a.length];
        boolean[] haspair = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            present[i] = true;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String n = in.nextLine();
        String[] n_split = n.split(" ");

        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);

        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        Solution solution = new Solution();
        res = solution.pairs(_a, _k);
        System.out.println(res);
    }
}
