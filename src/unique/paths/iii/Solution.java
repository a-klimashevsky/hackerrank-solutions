package unique.paths.iii;

import java.util.*;

class Solution {
    public int uniquePathsIII(int[][] grid) {


        int n = grid.length;
        int m = grid[0].length;

        Point start = null;
        Point end = null;
        int forbiddenCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int type = grid[i][j];
                switch (type) {
                    case 1:
                        start = new Point(i, j);
                        break;
                    case 2:
                        end = new Point(i, j);
                        break;
                    case -1:
                        forbiddenCount++;
                        break;
                }
            }
        }

        int cellsToVisit = n * m - forbiddenCount;

        final Set<Point> visited = new HashSet<>();


        int result = findAllPath(start, end, visited, cellsToVisit, grid);

        return result;
    }

    private int findAllPath(Point start, Point end, Set<Point> visited, int cellsToVisit, int[][] grid) {
        if (start.equals(end) && visited.size() == cellsToVisit - 1) {
            return 1;
        }
        List<Point> adj = adjNotVisited(start, grid);
        visited.add(start);
        int count = 0;
        for (Point p : adj) {
            if (!visited.contains(p)) {
                count += findAllPath(p, end, visited, cellsToVisit, grid);
            }
        }
        visited.remove(start);
        return count;
    }

    private List<Point> adjNotVisited(Point s, int[][] grid) {
        int i = s.x;
        int j = s.y;
        Point left = new Point(i - 1, j);
        Point up = new Point(i, j - 1);
        Point right = new Point(i + 1, j);
        Point bottom = new Point(i, j + 1);
        Point[] points = new Point[]{left, up, right, bottom};
        List<Point> result = new ArrayList<>();
        for (Point p : points) {
            if (inBounds(p, grid) && grid[p.x][p.y] != -1) {
                result.add(p);
            }
        }

        return result;
    }

    private boolean inBounds(Point p, int[][] grid) {
        return p.x >= 0 && p.y >= 0 && p.x < grid.length && p.y < grid[0].length;
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "(" +
                    "x=" + x +
                    ", y=" + y +
                    ')';
        }
    }
}
