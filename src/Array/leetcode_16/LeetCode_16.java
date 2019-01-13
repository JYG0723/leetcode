package Array.leetcode_16;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 16:22 2019/1/11.
 * @description
 */
public class LeetCode_16 {
    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int tar = Integer.MAX_VALUE;// 与target的差值
            int sum = 0;// 总和

            for (int i = 0; i < nums.length - 2; i++) {
                int l = i + 1, r = nums.length - 1;

                while (l < r) {
                    int item = nums[i] + nums[l] + nums[r];

                    if (Math.abs(item - target) < tar) {
                        sum = item;// 更新最接近的总和sum
                        tar = Math.abs(item - target);// 更新最接近绝对值
                    }

                    if (item > target) r--;
                    else l++;
                }
            }

            return sum;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 82));
    }
}
