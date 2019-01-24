package Tree.leetcode_450;

/**
 * @author Ji YongGuang.
 * @date 22:20 2019/1/23.
 * @description 删除二叉搜索树中的节点
 */
public class LeetCode_450 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null)
                return null;

            if (root.val == key) {
                if (root.left == null)
                    return root.right;

                if (root.right == null)
                    return root.left;

                // 左右节点都不为null
                TreeNode tar = getMin(root.right);
                tar.left = root.left;
                tar.right = removeMin(root.right);
                return tar;
            } else if (root.val < key) root.right = deleteNode(root.right, key);
            else root.left = deleteNode(root.left, key);

            return root;
        }

        private TreeNode getMin(TreeNode node) {// 找以node为根节点的树的最小节点
            if (node == null)
                return null;
            while (node.left != null) node = node.left;

            return node;
        }

        private TreeNode removeMin(TreeNode node) {// 删除以node为根节点的树的最小节点
            if (node == null)
                return null;

            while (node.left != null) {
                node = node.left;
            }

            return node.right;
        }
    }
}
