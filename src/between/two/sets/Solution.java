package between.two.sets;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/between-two-sets
 */
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        Solution solution = new Solution();
        int out = solution.solve(a, b);
        System.out.println(out);
    }

    int solve(int[] a, int[] b){
        long lcm = lcm(a);
        long gcd = gcd(b);
        int out = 0 ;
        for(long i = lcm; i <= gcd; i ++){
            if(i % lcm == 0 && gcd %i == 0){
                out ++;
            }
        }
        return out;
    }

    long gcd(long x, long y) {
        long a = Math.max(x, y);
        long b = Math.min(x, y);
        long r;
        do {
            r = a % b;
            if (r > 0) {
                a = b;
                b = r;
            }
        } while (r > 0);
        return b;
    }

    long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

    long lcm(int[] values){
        if (values.length == 1) {
            return values[0];
        }
        long lcm = lcm(values[0], values[1]);
        for (int i = 2; i < values.length; i++) {
            lcm = lcm(lcm, values[i]);
        }
        return lcm;
    }

    long gcd(int[] values) {
        if (values.length == 1) {
            return values[0];
        }
        long gcd = gcd(values[0], values[1]);
        for (int i = 2; i < values.length; i++) {
            gcd = gcd(gcd, values[i]);
        }
        return gcd;
    }
}