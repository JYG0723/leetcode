package Tree.leetcode_102;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 16:37 2019/1/16.
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
            List<List<Integer>> list = new ArrayList<>();

            if (root == null)
                return list;

            Deque<TreeNode> queue = new ArrayDeque<>();// 各元素及其层级
            queue.push(root);

            while (!queue.isEmpty()) {
                List<Integer> l = new ArrayList<>();
                list.add(l);
                int count = queue.size();// count表示该层有几个元素

                for (int i = count; i > 0; i--) {// 该层的元素的左右孩子都要继续入队
                    if (queue.peek().left != null) queue.offer(queue.peek().left);
                    if (queue.peek().right != null) queue.offer(queue.peek().right);
                    l.add(queue.pop().val);// 该层的元素进入到该层的list集合中
                }
            }
            return list;
        }
    }
}
