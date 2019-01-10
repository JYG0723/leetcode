package TwoPointers.leetcode_209;

/**
 * @author Ji YongGuang.
 * @date 13:39 2019/1/9.
 * @description 长度最小的子数组
 * 滑动窗口
 */
public class LeetCode_209_2 {
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            int l = 0, r = -1; // 滑动窗口 nums[l...r]为滑动窗口区域，初始没有元素
            int sum = 0, len = nums.length + 1;

            while (l < nums.length) {

                if (r + 1 < nums.length && sum < s) {
                    sum += nums[++r];
                } else {// sum >= s || r = nums.length - 1
                    sum -= nums[l++];
                }

                if (sum >= s) {
                    len = Math.min(len, r - l + 1);
                }
            }
            return len == nums.length + 1 ? 0 : len;
        }
    }
}
