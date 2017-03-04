package kaprekar.numbers;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kaprekar-numbers
 */
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.close();
        final StringBuilder builder = new StringBuilder();
        Solution solution = new Solution();
        for (int i = p; i < q; i++) {
            if(solution.isKaprekar(i)) {
                builder.append(i + " ");
            }
        }
        if (builder.length() == 0) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(builder);
        }
    }

    boolean isKaprekar(int n) {
        long k = n * n;
        String vn = Integer.toString(n);
        int d = vn.length();
        String vk = Long.toString(k);
        int rL = vk.length() - d;
        int lL = d;
        if (vk.length() < 2 * d) {
            lL = d - 1;
            rL = vk.length() - lL;
        }
        long r = vk.substring(rL).length() > 0 ? Long.parseLong(vk.substring(rL)): 0;
        long l = vk.substring(rL + 1).length() > 0 ? Long.parseLong(vk.substring(rL + 1)) : 0;
        return (r + l == n);
    }
}
