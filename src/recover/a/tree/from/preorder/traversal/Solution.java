package recover.a.tree.from.preorder.traversal;


import java.util.Stack;

public class Solution {

    public TreeNode recoverFromPreorder(String S) {
        TreeNode root = new TreeNode();

        int j = S.indexOf('-');
        if (j == -1) {
            j = S.length();
        }
        String valueS = S.substring(0, j);
        int value = Integer.parseInt(valueS);
        root.val = value;
        Stack<Pair> roots = new Stack<>();

        roots.push(new Pair(root, 0));

        while (j < S.length()) {
            int d = findDeep(j, S);
            Pair last = roots.peek();
            if (d < last.d) {
                reduceTree(roots, d);
            }
            int s = j + d;
            j = S.indexOf('-', s);
            if (j == -1) {
                j = S.length();
            }
            valueS = S.substring(s, j);
            value = Integer.parseInt(valueS);
            TreeNode node = new TreeNode(value);
            roots.push(new Pair(node, d));
        }
        reduceTree(roots, 0);

        return root;
    }

    private void reduceTree(Stack<Pair> roots, int d) {
        while (roots.peek().d > d) {
            Pair first = roots.pop();
            Pair second = roots.peek();
            if (first.d > second.d) {
                second.node.left = first.node;
            } else {
                roots.pop();
                Pair parent = roots.peek();
                parent.node.left = second.node;
                parent.node.right = first.node;
            }
        }
    }

    private int findDeep(int j, String s) {
        for (int i = j; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                return i - j;
            }
        }
        return 0;
    }

    private class Pair {
        TreeNode node;
        int d;

        Pair(TreeNode node, int d) {
            this.node = node;
            this.d = d;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "node=" + node +
                    ", d=" + d +
                    '}';
        }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
