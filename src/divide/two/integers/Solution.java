package divide.two.integers;

/**
 * Created by alexk on 2/18/21.
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;

        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return dividend;
            } else if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }

        boolean minus = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0);

        dividend = -abs(dividend);
        divisor = -abs(divisor);


        int result = 0;
        while (dividend <= divisor) {
            result++;
            dividend -= divisor;
        }
        if (minus) {
            return -result;
        } else {
            return result;
        }
    }

    static int abs(int n) {
        return (n ^ (n >> 31)) + (n >>> 31);
    }
}
