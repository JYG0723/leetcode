package TwoPointers.leetcode_209;

/**
 * @author Ji YongGuang.
 * @date 13:39 2019/1/9.
 * @description 长度最小的子数组
 * 滑动窗口
 */
public class LeetCode_209 {
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            if (nums == null || nums.length == 0)
                return 0;
            int l = 0, j = 0; // 滑动窗口
            int sum = 0, len = Integer.MAX_VALUE;

            while (l < nums.length) {
                sum += nums[l++];

                while (sum >= s) {
                    len = Math.min(len, l - j);
                    sum -= nums[j++];
                }
            }
            return len == Integer.MAX_VALUE ? 0 : len;
        }
    }
}
