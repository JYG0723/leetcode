package DFS.leetcode_129;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 18:20 2019/1/23.
 * @description 求根到叶子节点数字之和
 */
public class LeetCode_129 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public int sumNumbers(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();// 保存所有根到叶子节点的路径
            path(root, new ArrayList<Integer>(), res);

            int count = 0;
            for (List<Integer> l : res) {
                String s = "";
                for (Integer tar : l) {
                    s = s + tar;
                }
                int var = Integer.parseInt(s);
                count += var;
            }
            return count;
        }

        private void path(TreeNode node, List<Integer> l, List<List<Integer>> list) {// 计算node节点到其根节点的路径
            if (node == null)
                return;

            l.add(node.val);

            if (node.left == null && node.right == null)
                list.add(new ArrayList<>(l));
            else {
                path(node.left, l, list);
                path(node.right, l, list);
            }

            l.remove(l.size() - 1);
        }
    }
}
