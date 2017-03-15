package melodious.password;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w30/challenges/melodious-password
 */
class Solution {
    private static final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
    private static final char[] consonants = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q',
            'r', 's', 't', 'v', 'w', 'x', 'z'};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        new Solution().printPasswords(n);
    }

    private void printPasswords(final int n) {
        char[] password = new char[n];
        fillPasswords(password, 0, vowels);
        fillPasswords(password, 0, consonants);
    }

    private void fillPasswords(char[] p, int i, char[] chars) {
        for (char c : chars) {
            p[i] = c;
            if (i < p.length - 1) {
                char[] next = chars == vowels ? consonants : vowels;
                fillPasswords(p, i + 1, next);
            } else {
                String password = new String(p);
                System.out.println(password);
            }
        }
    }
}
