package Tree.leetcode_108;

/**
 * @author Ji YongGuang.
 * @date 22:40 2019/1/23.
 * @description 将有序数组转换为二叉搜索树
 */
public class LeetCode_108 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums.length == 0)
                return null;
            return makeTree(nums, 0, nums.length - 1);
        }

        private TreeNode makeTree(int[] nums, int low, int high) {// 对nums数组low-high的元素搭成树
            if (low > high)
                return null;

            int mid = (low + high) / 2;
            TreeNode midNode = new TreeNode(nums[mid]);

            midNode.left = makeTree(nums, low, mid - 1);
            midNode.right = makeTree(nums, mid + 1, high);
            return midNode;
        }
    }
}
