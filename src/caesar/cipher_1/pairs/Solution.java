package caesar.cipher_1.pairs;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1
 */
class Solution {

    static String caesarCipher(String s, int k) {
        final StringBuilder builder = new StringBuilder(s.length());

        for (char c : s.toCharArray()) {
            char enc;
            if ('A' <= c && c <= 'Z') {
                enc = (char) ('A' + (c - 'A' + k) % 26);
            } else if ('a' <= c && c <= 'z') {
                enc = (char) ('a' + (c - 'a' + k) % 26);
            } else {
                enc = c;
            }
            builder.append(enc);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
