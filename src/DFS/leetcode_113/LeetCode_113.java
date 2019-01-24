package DFS.leetcode_113;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 18:07 2019/1/23.
 * @description 路径总和 II
 */
public class LeetCode_113 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> res = new ArrayList<>();
            path(root, sum, new ArrayList<>(), res);
            return res;
        }

        private void path(TreeNode node, int target, List<Integer> l, List<List<Integer>> list) {
            if (node == null)
                return;

            l.add(node.val);

            if (node.left == null && node.right == null && node.val == target)// 叶子节点
                list.add(new ArrayList<>(l));
            else {
                path(node.left, target - node.val, l, list);
                path(node.right, target - node.val, l, list);
            }

            l.remove(l.size() - 1);
        }
    }
}
