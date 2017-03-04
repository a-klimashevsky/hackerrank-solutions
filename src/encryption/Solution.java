package encryption;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/encryption
 */
class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String out = new Solution().encrypt(s);
        System.out.println(out);
    }

    String encrypt(String src) {
        int l = src.length();
        double sqrt = Math.sqrt(l);
        int lowBound = (int) Math.floor(sqrt);
        int upBound = (int) Math.ceil(sqrt);
        int rows = lowBound;
        int cols = upBound;
        int dim = rows * cols;
        while(dim < l){
            rows++;
            dim = rows * cols;
        }
        for (int i = rows; i <= cols; i++) {
            for (int j = cols; j >= rows; j--) {
                if (i <= j && i * j >= l && i * j < dim) {
                    rows = i;
                    cols = j;
                    dim = rows * cols;
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                int index = j * cols + i;
                if (index < src.length()) {
                    builder.append(src.charAt(index));
                }
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}