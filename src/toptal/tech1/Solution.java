package toptal.tech1;

/**
 * Created by alexk on 2/26/21.
 */
public class Solution {
    public int numberOfCarryOperations(int n, int m) {
        int carry = 0;
        boolean lastCarried = false;
        while (n > 0 || m > 0) {
            int lastNDigit = n % 10;
            int lastMDigit = m % 10;
            if (lastCarried) {
                lastNDigit++;
            }
            lastCarried = false;
            if (lastNDigit + lastMDigit >= 10) {
                carry++;
                lastCarried = true;
            }
            n = n / 10;
            m = m / 10;
        }
        return carry;
    }
}
