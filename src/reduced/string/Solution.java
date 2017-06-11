package reduced.string;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/reduced-string
 */
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = new Solution().super_reduced_string(s);
        System.out.println(result);
    }

    String super_reduced_string(String origin) {
        String reduced = origin;
        do {
            origin = reduced;
            int n = origin.length();
            StringBuilder sb = new StringBuilder();

            char lastChar = origin.charAt(0);
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (lastChar != origin.charAt(i)) {
                    if (count % 2 == 1) {
                        sb.append(lastChar);
                    }
                    lastChar = origin.charAt(i);
                    count = 1;
                } else {
                    count++;
                }
            }
            if (count % 2 == 1) {
                sb.append(lastChar);
            }

            reduced = sb.toString();
        } while (!reduced.equals(origin) && reduced.length() > 0);

        return "".equals(reduced) ? "Empty String" : reduced;
    }
}
