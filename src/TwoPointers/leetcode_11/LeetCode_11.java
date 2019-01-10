package TwoPointers.leetcode_11;

/**
 * @author Ji YongGuang.
 * @date 20:52 2019/1/8.
 * @description 盛最多水的容器
 * 滑动窗口
 */
public class LeetCode_11 {

    class Solution {
        public int maxArea(int[] height) {
            int maxarea = 0;
            int l = 0, r = height.length - 1;

            while (l < r) {
                maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
                if (height[l] <= height[r])// 强行中推
                    l++;
                else r--;
            }
            return maxarea;
        }
    }
}
