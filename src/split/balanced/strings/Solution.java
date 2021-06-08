package split.balanced.strings;

public class Solution {
    public int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int wordCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                lCount++;
            } else if (c == 'R') {
                rCount++;
            }
            if (lCount == rCount) {
                wordCount++;
                lCount = rCount = 0;
            }
        }
        return wordCount;
    }
}
