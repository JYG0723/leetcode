package Array.leetcode_75;

/**
 * @author Ji YongGuang.
 * @date 15:29 2019/1/8.
 * @description 颜色分类
 */
public class LeetCode_75 {

    class Solution {
        public void sortColors(int[] nums) {
            int l = -1; // nums[0...l] 为0
            int r = nums.length; // nums[r...nums.length-1] 为2
            for (int i = 0; i < r; ) {
                if (nums[i] == 1) {
                    i++;
                } else if (nums[i] < 1) {
                    swap(nums, ++l, i++);
                } else { // nums[i] > 1
                    swap(nums, --r, i);
                }
            }
        }

        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
