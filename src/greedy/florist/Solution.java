package greedy.florist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by alexk on 3/12/17.
 */
class Solution {
    public static void main(String args[]) {

// helpers for input/output

        Scanner in = new Scanner(System.in);

        int N, K;
        N = in.nextInt();
        K = in.nextInt();

        int C[] = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }

        int result = new Solution().getMinPrice(C, K);
        System.out.println(result);

    }

    int getMinPrice(int[] c, int k) {
        int n = c.length;
        int[] p = new int[k];
        Arrays.sort(c);
        int price = 0;
        for (int i = 0; i < n; i++) {
            price += c[n - i - 1] * (1 + p[i % k]);
            p[i % k]++;
        }
        return price;
    }
}
