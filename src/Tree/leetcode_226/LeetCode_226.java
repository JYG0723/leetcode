package Tree.leetcode_226;

/**
 * @author Ji YongGuang.
 * @date 17:33 2019/1/17.
 * @description 翻转二叉树
 */
public class LeetCode_226 {
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
         * 反转以root为根节点的一棵树
         */
        public TreeNode invertTree(TreeNode root) {
            if (root == null)
                return root;

            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;
        }
    }
}
