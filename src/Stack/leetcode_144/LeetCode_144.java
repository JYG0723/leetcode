package Stack.leetcode_144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ji YongGuang.
 * @date 14:07 2019/1/16.
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

        public List<Integer> preorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            List<Integer> list = new ArrayList<>();

            while (!stack.empty()) {
                TreeNode node = stack.pop();
                list.add(node.val);

                if(node.right != null)
                    stack.push(node.right);
                if(node.left != null)
                    stack.push(node.left);
            }
            return list;
        }
    }
}
