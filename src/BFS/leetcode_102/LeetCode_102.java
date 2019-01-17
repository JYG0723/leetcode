package BFS.leetcode_102;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 16:42 2019/1/16.
 * @description 二叉树的层次遍历
 */
public class LeetCode_102 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            levelOrder(res, root, 0);
            return res;
        }

        /** node元素所在层入队 */
        private void levelOrder(List<List<Integer>> res, TreeNode node, int height) {
            if (node == null)
                return;

            if (height >= res.size())
                res.add(new ArrayList<>());

            res.get(height).add(node.val);
            levelOrder(res, node.left, height + 1);
            levelOrder(res, node.right, height + 1);
        }
    }
}
