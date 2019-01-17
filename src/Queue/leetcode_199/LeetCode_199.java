package Queue.leetcode_199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Ji YongGuang.
 * @date 19:28 2019/1/16.
 * @description 二叉树的右视图
 */
public class LeetCode_199 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();

            if (root == null)
                return res;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int count = queue.size();
                TreeNode node = null;

                for (int i = 0; i < count; i++) {
                    node = queue.poll();
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }

                res.add(node.val);
            }
            return res;
        }
    }
}
