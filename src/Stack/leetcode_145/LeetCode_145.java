package Stack.leetcode_145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ji YongGuang.
 * @date 15:24 2019/1/16.
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

        public List<Integer> postorderTraversal(TreeNode root) {// 左 右 中

            if (root == null)
                return new ArrayList<>();

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            Stack<Integer> output = new Stack<>();
            List<Integer> list = new ArrayList<>();

            while (!stack.empty()) {
                TreeNode node = stack.pop();
                output.push(node.val);

                if (node.left != null)
                    stack.push(node.left);
                if (node.right != null)
                    stack.push(node.right);
            }

            while (!output.empty())
                list.add(output.pop());
            return list;
        }
    }
}
