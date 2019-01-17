package Tree.leetcode_144;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 20:41 2019/1/15.
 * @description 二叉树的前序遍历
 */
public class LeetCode_144 {
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

        public List<Integer> preorderTraversal(TreeNode root) {
            if (root == null)
                return list;

            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            return list;
        }
    }
}
