package decode.string;

public class Solution {
    public String decodeString(String s) {
        return decodeString(s, 0, s.length());
    }

    private String decodeString(String s, int start, int end) {
        StringBuilder b = new StringBuilder();
        int i = start;
        while (i < end) {
            char c = s.charAt(i);
            if (c >= 'a') {
                b.append(c);
                i++;
            } else if (c < '[') {
                int j = s.indexOf('[', i);
                int repeat = Integer.parseInt(s.substring(i, j));
                int k = findClosing(s, j, end);
                String subString = decodeString(s, j + 1, k);
                for (int l = 0; l < repeat; l++) {
                    b.append(subString);
                }
                i = k + 1;
            }
        }
        return b.toString();
    }

    private int findClosing(String s, int start, int end) {
        int skip = 0;
        for (int i = start + 1; i < end; i++) {
            if (s.charAt(i) == '[') {
                skip++;
            } else if (s.charAt(i) == ']') {
                if (skip == 0) {
                    return i;
                } else {
                    skip--;
                }
            }
        }
        return 0;
    }
}
