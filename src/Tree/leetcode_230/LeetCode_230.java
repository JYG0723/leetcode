package Tree.leetcode_230;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ji YongGuang.
 * @date 22:59 2019/1/23.
 * @description 二叉搜索树中第K小的元素
 */
public class LeetCode_230 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            TreeNode cur = root;
            while (cur != null || !stack.empty()) {
                if (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                } else {// 叶子节点
                    cur = stack.pop();
                    list.add(cur.val);
                    cur = cur.right;
                }
            }
            return list.get(k - 1);
        }
    }
}
