package Tree.leetcode_111;

/**
 * @author Ji YongGuang.
 * @date 17:15 2019/1/17.
 * @description 二叉树的最小深度
 */
public class LeetCode_111 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null)
                return 0;

            int left = minDepth(root.left);
            int right = minDepth(root.right);
            return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
        }
    }
}
