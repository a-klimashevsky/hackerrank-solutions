package big.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1
 */
class Solution {

    static String[] bigSorting(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String left, String right) {
                if (left.length() != right.length()) {
                    return left.length() - right.length();
                }
                for (int i = 0; i < left.length(); i++) {
                    if (left.charAt(i) != right.charAt(i)) {
                        return left.charAt(i) - right.charAt(i);
                    }
                }
                return 0;
            }
        });
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println();


        in.close();
    }
}
