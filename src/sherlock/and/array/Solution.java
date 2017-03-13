package sherlock.and.array;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-array
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

    boolean hasPivot(int[] a) {
        int i = 0;
        int j = a.length - 1;
        int sumLeft = a[i];
        int sumRight = a[j];
        while (i < j - 2) {
            if (sumLeft < sumRight) {
                sumLeft += a[++i];
            } else {
                sumRight += a[--j];
            }
        }
        return sumLeft == sumRight;
    }
}
