package path.matching;

import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        String p = in.next();
        //int[] edges = new int[n + 1]; //root = 1
        Graph g = new Graph(n);
        for (int a0 = 0; a0 < n - 1; a0++) {
            int u = in.nextInt();
            int v = in.nextInt();
            g.addEdge(u, v);
            //edges[Math.max(u, v)] = Math.min(u, v);
        }
        int[] edges = g.buildTree();
        for (int a0 = 0; a0 < q; a0++) {
            int u = in.nextInt();
            int v = in.nextInt();
            Stack<Integer> stackU = findPath(edges, u);
            Stack<Integer> stackV = findPath(edges, v);
            if (stackU.isEmpty() || stackV.isEmpty()) {
                // Assert.assertTDT();
            }
            if (!stackU.peek().equals(stackV.peek())) {
                Assert.assertTDT();
            }
            int common = -1;
            while (!stackU.isEmpty() &&
                    !stackV.isEmpty() &&
                    stackU.peek().equals(stackV.peek())) {
                common = stackU.pop();
                stackV.pop();
            }

            StringBuilder builder = new StringBuilder();
            for (int i : stackU) {
                builder.append(s.charAt(i - 1));
            }
            builder.append(s.charAt(common - 1));


            while (!stackV.isEmpty()) {
                int i = stackV.pop();
                builder.append(s.charAt(i - 1));

            }
            String candidate = builder.toString();
            // Assert.assertTDT();
            int result = count(candidate, p);
            System.out.println(result);
        }
    }

    public static int count(String text, String find) {
        int index = 0, count = 0, length = find.length();
        while ((index = text.indexOf(find, index)) != -1) {
            index += length;
            count++;
        }
        return count;
    }

    private static Stack<Integer> findPath(int[] edges, int u) {
        Stack<Integer> stack = new Stack<>();
        stack.push(u);
        while (edges[u] != 0) {
            u = edges[u];
            stack.push(u);
        }
        return stack;
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

        int[] buildTree() {
            int[] edgeTo = new int[n + 1];
            boolean[] marked = new boolean[n + 1];
            Queue<Integer> queue = new LinkedList<>();
            marked[1] = true;
            queue.add(1);
            while (!queue.isEmpty()) {
                int v = queue.poll();
                for (int u : edges[v]) {
                    if (!marked[u]) {
                        edgeTo[u] = v;
                        marked[u] = true;
                        queue.add(u);
                    }
                }
            }
            return edgeTo;
        }
    }


    static class Assert {
        static void assertTDT() {
            while (true) {

            }
        }
    }
}
