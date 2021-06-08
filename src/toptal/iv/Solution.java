package toptal.iv;

public class Solution {
    public boolean solution(int N, int[] A, int[] B) {
        boolean[] edges = new boolean[N];
        for (int i = 0; i < A.length; i++) {
            int a = Math.min(A[i], B[i]);
            int b = Math.max(A[i], B[i]);
            if (a + 1 == b) {
                edges[a] = true;
            }
        }

        for (int i = 1; i < N; i++) {
            if (!edges[i]) return false;
        }
        return true;
    }
}
