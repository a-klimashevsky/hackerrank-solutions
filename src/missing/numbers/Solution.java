package missing.numbers;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/missing-numbers
 */
class Solution {

    private static final int MODE = 102;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        scanner.close();

        Solution solution = new Solution();
        Integer[] result = solution.getMissing(a, b);
        for (Integer i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    Integer[] getMissing(int[] a, int[] b) {
        int[] buffer = new int[MODE];
        int[] bases = new int[MODE];
        for (int i : a) {
            buffer[i % MODE]--;
            bases[i % MODE] = i / MODE;
        }
        for (int i : b) {
            buffer[i % MODE]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < MODE; i++) {
            int diff = buffer[i];
            if (diff > 0) {
                result.add(bases[i] * MODE + i);
            }
        }
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return result.toArray(new Integer[]{});
    }
}
