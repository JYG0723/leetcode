package Queue.leetcode_103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Ji YongGuang.
 * @date 19:14 2019/1/16.
 * @description 二叉树的锯齿形层次遍历
 */
public class LeetCode_103 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();

            if (root == null)
                return res;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            int high = 0;
            while (!queue.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                res.add(list);

                int count = queue.size();
                for (int i = 0; i < count; i++) {
                    if (queue.peek().left != null) queue.add(queue.peek().left);
                    if (queue.peek().right != null) queue.add(queue.peek().right);

                    if (high % 2 == 0) {
                        list.add(queue.poll().val);
                    } else {
                        list.add(0, queue.poll().val);
                    }
                }
                high++;
            }
            return res;
        }
    }
}
