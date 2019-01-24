package Tree.leetcode_98;

/**
 * @author Ji YongGuang.
 * @date 20:12 2019/1/23.
 * @description 验证二叉搜索树
 */
public class LeetCode_98 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
        }


        private boolean isValidBST(TreeNode node, long max, long min) {
            if (node == null) return true;
            if (node.val >= max || node.val <= min) return false;
            return isValidBST(node.left, node.val, min) && isValidBST(node.right, max, node.val);
        }
    }
}
