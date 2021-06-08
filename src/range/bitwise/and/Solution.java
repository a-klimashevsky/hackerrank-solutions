package range.bitwise.and;

public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int h = Integer.highestOneBit(n);
        int result = 0;
        while (h > 0) {
            int digit = n & h;
            if (digit != (m & h)) {
                break;
            } else if (digit > 0) {
                result += h;
            }
            h >>= 1;
        }
        return result;
    }
}
