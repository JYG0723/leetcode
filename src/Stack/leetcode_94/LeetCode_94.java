package Stack.leetcode_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ji YongGuang.
 * @date 15:24 2019/1/16.
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

        public List<Integer> inorderTraversal(TreeNode root) {// 左 中 右
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = root;
            List<Integer> list = new ArrayList<>();

            while (cur != null || !stack.empty()) {
                if (cur != null) {// 取左子树
                    stack.push(cur);
                    cur = cur.left;
                } else {// 左边取完
                    TreeNode node = stack.pop();
                    list.add(node.val);
                    cur = node.right;
                }
            }
            return list;
        }
    }
}
