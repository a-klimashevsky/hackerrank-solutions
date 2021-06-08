package cherry.pickup.ii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DP[i][j][k] = sum(g[i][j]+g[i][k]) + max(for all possible moves DP)
 */
class Solution {

    int[][] moves = new int[][]{
            new int[]{-1, -1},
            new int[]{-1, 0},
            new int[]{-1, 1},
            new int[]{0, -1},
            new int[]{0, 0},
            new int[]{0, 1},
            new int[]{1, -1},
            new int[]{1, 0},
            new int[]{1, 1}
    };

    public int cherryPickup(int[][] grid) {
        final int n = grid.length;
        final int m = grid[0].length;
        final int[][][] DP = new int[n][m][m];
        Arrays.stream(DP).forEach(it -> Arrays.stream(it).forEach(it2 -> Arrays.fill(it2, -1)));

        return countMaxCherry(0, 0, m - 1, DP, grid);
    }

    private int countMaxCherry(int i, int j, int k, int[][][] dp, int[][] grid) {
        if (dp[i][j][k] != -1) return dp[i][j][k];
        if (i < grid.length - 1) {
            final int count = current(i, j, k, grid) + maxForMoves(i + 1, j, k, dp, grid);
            dp[i][j][k] = count;
            return count;
        } else return current(i, j, k, grid);
    }

    private int maxForMoves(int i, int j, int k, int[][][] dp, int[][] grid) {
        final int m = grid[0].length;
        final List<Integer> possibleResults = new ArrayList<>();
        for (int[] move : moves) {
            final int newJ = j + move[0];
            final int newK = k + move[1];
            if (newJ >= 0 && newJ < m &&
                    newK >= 0 && newK < m) {
                final int count = countMaxCherry(i, newJ, newK, dp, grid);
                possibleResults.add(count);
            }
        }
        return possibleResults.stream().max(Integer::compareTo).get();
    }

    private int current(int i, int j, int k, int[][] grid) {
        if (j == k) return grid[i][j];

        return grid[i][j] + grid[i][k];
    }
}
