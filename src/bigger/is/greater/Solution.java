package bigger.is.greater;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bigger-is-greater
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            String answer = solution.solve(s);
            System.out.println(answer);
        }
        scanner.close();
    }

    String solve(String s) {
        char[] chars = s.toCharArray();
        boolean possible = false;
        for (int i = chars.length - 2; i >= 0; i--) {
            if (chars[i] < chars[i + 1]) {
                char pivot = chars[i];
                for (int j = chars.length - 1; j > i; j--) {
                    if (chars[j] > pivot) {
                        char t = chars[j];
                        chars[j] = pivot;
                        chars[i] = t;
                        Arrays.sort(chars, i + 1, chars.length);
                        break;
                    }
                }
                possible = true;
                break;
            }
        }
        if (possible) {
            return new String(chars);
        } else {
            return "no answer";
        }
    }
}