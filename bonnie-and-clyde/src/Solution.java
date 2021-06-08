import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();
        Graph g = new Graph(n);
        for (int a0 = 0; a0 < m; a0++) {
            int u = in.nextInt();
            int v = in.nextInt();
            g.addEdge(u, v);
        }
        for (int a0 = 0; a0 < q; a0++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int w = in.nextInt();
            boolean exist = g.exist(u, v, w);
            System.out.println(exist ? "YES" : "NO");
        }
    }

    static class Graph {

        private final int n;

        private final List<Integer>[] edges;

        Graph(int n) {
            this.n = n;
            this.edges = new List[n + 1];
            for (int i = 0; i < n + 1; i++) {
                edges[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v) {
            edges[u].add(v);
            edges[v].add(u);
        }

        boolean exist(int s, int t, int w) {
            boolean[] marked = new boolean[n + 1];
            Iterator[] adj = new Iterator[n + 1];
            for (int i = 0; i < n + 1; i++) {
                adj[i] = edges[i].iterator();
            }
            boolean visited = false;
            marked[s] = true;

            Stack<Integer> stack = new Stack<>();
            stack.push(s);
            while (!stack.isEmpty()) {
                int v = stack.peek();
                if (adj[v].hasNext()) {
                    if (v == w) {
                        visited = true;
                    }
                    if (v == t && visited) {
                        return true;
                    }
                    int u = (int) adj[v].next();
                    if (!marked[u]) {
                        stack.push(u);
                        marked[u] = true;
                    }
                } else {
                    stack.pop();
                    marked[v] = false;
                    if (v == w) {
                        visited = false;
                    }
                    adj[v] = edges[v].iterator();
                }

            }

            return false;
        }

    }

}
