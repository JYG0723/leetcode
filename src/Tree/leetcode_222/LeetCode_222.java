package Tree.leetcode_222;

/**
 * @author Ji YongGuang.
 * @date 18:14 2019/1/17.
 * @description 完全二叉树的节点个数
 */
public class LeetCode_222 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int countNodes(TreeNode root) {
            if (root == null)
                return 0;

            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
}
