package Tree.leetcode_235;

/**
 * @author Ji YongGuang.
 * @date 18:45 2019/1/23.
 * @description 二叉搜索树的最近公共祖先
 */
public class LeetCode_235 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null)
                return null;

            if (p.val < root.val && q.val < root.val)// 两节点都小于root节点
                return lowestCommonAncestor(root.left, p, q);
            if (p.val > root.val && q.val > root.val)// 两节点都大于root节点
                return lowestCommonAncestor(root.right, p, q);

            return root;// 两节点分布在root节点两侧
        }
    }
}
