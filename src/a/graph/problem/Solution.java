package a.graph.problem;

import java.util.*;

/**
 * Created by alexk on 3/18/17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] g = new int[n][n];
        for (int g_i = 0; g_i < n; g_i++) {
            for (int g_j = 0; g_j < n; g_j++) {
                g[g_i][g_j] = in.nextInt();
            }
        }

        in.close();

        Set<Integer> v = new Solution().getVertixes(g);

        System.out.println(v.size());
        for (int i : v) {
            System.out.print((i + 1) + " ");
        }
    }

    Set<Integer> getVertixes(int[][] G) {
        Graph g = new Graph(G);
        TriangelGraph triangelGraph = new TriangelGraph(g.n());
        for (int i = 0; i < g.n(); i++) {
            for (int j = i + 1; j < g.n(); j++) {
                if (g.hasEdge(i, j)) {
                    for (int k = j + 1; k < g.n(); k++) {
                        if (g.hasEdge(j, k) && g.hasEdge(k, i)) {
                            triangelGraph.addTriangel(i, j, k);
                        }
                    }
                }
            }
        }
        triangelGraph.removeBadTriangels();
        return triangelGraph.vertexes;
    }

    private static class Graph {
        private final int[][] table;

        private Graph(int[][] table) {
            this.table = table;
        }

        int n() {
            return table.length;
        }


        public boolean hasEdge(int i, int j) {
            return table[i][j] == 1;
        }
    }

    private static class TriangelGraph {
        private Set<Integer> vertexes = new HashSet<>();
        private Set<Integer>[] edges;
        private List<Triangel> triangels = new ArrayList<>();

        TriangelGraph(int max) {
            edges = new Set[max];
            for (int i = 0; i < max; i++) {
                edges[i] = new HashSet<>();
            }
        }

        void addTriangel(int i, int j, int k) {
            triangels.add(new Triangel(i, j, k));
            addEdge(i, j);
            addEdge(j, k);
            addEdge(k, i);
        }

        private void addEdge(int v, int w) {
            vertexes.add(v);
            vertexes.add(w);
            edges[v].add(w);
            edges[w].add(v);
        }

        public void removeBadTriangels() {
            while (2 * triangels.size() >= vertexes.size()) {
                Triangel triangel = findTriangel();
                if (triangel == null) {
                    break;
                }
                triangels.remove(triangel);
                int a = edges[triangel.i].size() == 2 ? 0 : 1;
                int b = edges[triangel.j].size() == 2 ? 0 : 1;
                int c = edges[triangel.k].size() == 2 ? 0 : 1;
                if (a == 0) {
                    removeEdges(triangel.i);
                    vertexes.remove(triangel.i);
                }
                if (b == 0) {
                    removeEdges(triangel.j);
                    vertexes.remove(triangel.j);
                }
                if (c == 0) {
                    removeEdges(triangel.k);
                    vertexes.remove(triangel.k);
                }
            }
        }

        private void removeEdges(int v) {
            for (int w : edges[v]) {
                edges[w].remove(v);
            }
        }

        private Triangel findTriangel() {
            for (Triangel triangel : triangels) {
                int a = edges[triangel.i].size() == 2 ? 0 : 1;
                int b = edges[triangel.j].size() == 2 ? 0 : 1;
                int c = edges[triangel.k].size() == 2 ? 0 : 1;
                if (a + b + c < 2) {
                    return triangel;
                }
            }
            return null;
        }

        private static class Triangel {
            final int i;
            final int j;
            final int k;

            private Triangel(int i, int j, int k) {
                this.i = i;
                this.j = j;
                this.k = k;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Triangel triangel = (Triangel) o;

                if (i != triangel.i) return false;
                if (j != triangel.j) return false;
                return k == triangel.k;

            }

            @Override
            public int hashCode() {
                int result = i;
                result = 31 * result + j;
                result = 31 * result + k;
                return result;
            }

            @Override
            public String toString() {
                return "Triangel{" +
                        "i=" + i +
                        ", j=" + j +
                        ", k=" + k +
                        '}';
            }
        }
    }
}
