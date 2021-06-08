package find.largest.value.in.each.tree.row;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */


class Solution {
    public List<Integer> largestValues(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> layer = new ArrayDeque<>();
        Queue<TreeNode> nextLayer = new ArrayDeque<>();

        layer.add(root);

        List<Integer> maxes = new ArrayList<>();

        int currentMax = Integer.MIN_VALUE;

        while (!layer.isEmpty()) {
            TreeNode node = layer.poll();
            currentMax = Math.max(currentMax, node.val);
            if (node.left != null) {
                nextLayer.add(node.left);
            }
            if (node.right != null) {
                nextLayer.add(node.right);
            }

            if (layer.isEmpty()) {
                maxes.add(currentMax);
                currentMax = Integer.MIN_VALUE;
                layer.addAll(nextLayer);
                nextLayer.clear();
            }
        }

        return maxes;
    }
}

class TreeNode {
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
}
