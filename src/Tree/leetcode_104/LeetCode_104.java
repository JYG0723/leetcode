package Tree.leetcode_104;

/**
 * @author Ji YongGuang.
 * @date 17:15 2019/1/17.
 * @description 二叉树的最大深度
 */
public class LeetCode_104 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        /**
         * 统计以root节点为根节点的树的最大深度是多少
         */
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
