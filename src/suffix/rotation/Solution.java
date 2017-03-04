package suffix.rotation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w28/challenges/suffix-rotation
 */
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Solution solution = new Solution();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            int out = solution.moveCount(s);
            System.out.println(out);
        }
    }

     int moveCount(String s) {
        int move = 0;
        int start = 0;
        String pref = findPref(s, start);
        while (start + pref.length() < s.length()) {
            move++;
            start += pref.length();
            pref = findPref(s, start);
        }
        return move;
    }

    String findPref(String s, int start) {
        if(s.length() - start < 2) return s.substring(start);
        int end = start +1;
        while (end < s.length() && s.charAt(end-1) <= s.charAt(end)){
            end++;
        }
        return s.substring(start, end);
    }
}
