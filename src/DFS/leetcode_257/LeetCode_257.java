package DFS.leetcode_257;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 20:09 2019/1/17.
 * @description 二叉树的所有路径
 */
public class LeetCode_257 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        /**
         * 返回所有从根节点root到叶子节点的路径。
         */
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> res = new ArrayList<>();
            if (root == null)
                return res;
            return binaryTreePaths(root, "", res);
        }

        private List<String> binaryTreePaths(TreeNode node, String path, List<String> list) {
            if (node.left == null && node.right == null) list.add(path + node.val);
            if (node.left != null) binaryTreePaths(node.left, path + node.val + "->", list);
            if (node.right != null) binaryTreePaths(node.right, path + node.val + "->", list);
            return list;
        }
    }
}
