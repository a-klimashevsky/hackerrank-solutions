package jim.and.the.orders;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/jim-and-the-orders
 */
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        int n = in.nextInt();
        int[] start = new int[n];
        int[] duration = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = in.nextInt();
            duration[i] = in.nextInt();
        }
        in.close();
        int[] out = solution.getOrder(start, duration);
        for (int j : out) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    int[] getOrder(int[] start, int[] duration) {
        int n = start.length;
        Map<Integer, List<Integer>> jobs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int t = start[i] + duration[i];
            if (!jobs.containsKey(t)) {
                jobs.put(t, new ArrayList<Integer>());
            }
            jobs.get(t).add(i);
        }
        Integer[] keys = jobs.keySet().toArray(new Integer[]{});
        Arrays.sort(keys);
        int i = 0;
        int[] out = new int[start.length];
        for (int key : keys) {
            Integer[] j = jobs.get(key).toArray(new Integer[]{});
            Arrays.sort(j);
            for (int a : j) {
                out[i++] = a + 1;
            }
        }
        return out;
    }
}
