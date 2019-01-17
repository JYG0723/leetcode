package Tree.leetcode_145;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 20:49 2019/1/15.
 * @description 二叉树的后序遍历
 */
public class LeetCode_145 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {

        private List<Integer> list = new ArrayList<>();

        public List<Integer> postorderTraversal(TreeNode root) {
            if (root == null)
                return list;

            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
            return list;
        }
    }
}
