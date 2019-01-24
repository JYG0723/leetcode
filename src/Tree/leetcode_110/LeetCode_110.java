package Tree.leetcode_110;

/**
 * @author Ji YongGuang.
 * @date 18:32 2019/1/17.
 * @description 平衡二叉树
 */
public class LeetCode_110 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null)
                return true;

            if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1)
                return false;

            return isBalanced(root.left) && isBalanced(root.right);
        }

        /**
         * 统计以node为根节点的二叉树的高度是多少
         */
        private int maxDepth(TreeNode node) {
            if (node == null)
                return 0;

            return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
        }
    }
}
