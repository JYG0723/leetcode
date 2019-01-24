package Tree.leetcode_112;

/**
 * @author Ji YongGuang.
 * @date 19:00 2019/1/17.
 * @description 路径总和
 */
public class LeetCode_112 {
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
         * 查找以root为根节点的树中是否存在到叶子节点和的节点和为sum
         */
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null)
                return false;

            // 该节点已经是叶子节点
            if (root.left == null && root.right == null)
                return root.val == sum;

            // 该节点还不是叶子节点
            if (hasPathSum(root.left, sum - root.val))
                return true;
            if (hasPathSum(root.right, sum - root.val))
                return true;

            return false;
        }
    }
}
