package Tree.leetcode_101;

/**
 * @author Ji YongGuang.
 * @date 18:10 2019/1/17.
 * @description 对称二叉树
 */
public class LeetCode_101 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return isMirror(root.left, root.right);
        }

        private boolean isMirror(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (p == null || q == null) return false;
            return (p.val == q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
        }
    }
}
