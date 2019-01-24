package Tree.leetcode_404;

/**
 * @author Ji YongGuang.
 * @date 19:34 2019/1/17.
 * @description 左叶子之和
 */
public class LeetCode_404 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null)
                return 0;

            int count = 0;
            if (root.left != null) {// 从父节点观测子节点
                if (root.left.left == null && root.left.right == null) count += root.left.val;// 左叶子节点的判断
                else count += sumOfLeftLeaves(root.left);// 左子树非叶子节点，统计左子树的左叶子节点总和
            }
            count += sumOfLeftLeaves(root.right);// 右子树的左叶子节点统计总和

            return count;
        }
    }
}
