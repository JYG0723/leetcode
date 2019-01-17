package Queue.leetcode_107;

import java.util.*;

/**
 * @author Ji YongGuang.
 * @date 18:43 2019/1/16.
 * @description 二叉树的层次遍历 II
 */
public class eetCode_107 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            Stack<List<Integer>> stack = new Stack<>();

            while (!queue.isEmpty()) {
                List<Integer> list = new ArrayList<>();
                stack.push(list);

                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    if (queue.peek().left != null) queue.offer(queue.peek().left);
                    if (queue.peek().right != null) queue.offer(queue.peek().right);
                    list.add(queue.poll().val);
                }
            }

            List<List<Integer>> res = new ArrayList<>();
            while (!stack.empty()) {
                res.add(stack.pop());
            }
            return res;
        }
    }
}
