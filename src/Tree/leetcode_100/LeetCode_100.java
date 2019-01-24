package Tree.leetcode_100;

/**
 * @author Ji YongGuang.
 * @date 17:59 2019/1/17.
 * @description 相同的树
 */
public class LeetCode_100 {
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
         * 判断p,q两棵二叉树是否是相同的两棵二叉树
         */
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (p == null || q == null) return false;
            if (p.val == q.val)
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            return false;
        }
    }
}
