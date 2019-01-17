package Tree.leetcode_94;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 20:37 2019/1/15.
 * @description 二叉树的中序遍历
 */
public class LeetCode_94 {
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

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null)
                return list;

            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
            return list;
        }
    }
}
