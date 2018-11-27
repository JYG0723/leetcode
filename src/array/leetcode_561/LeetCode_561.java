package array.leetcode_561;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 14:05 2018/11/27.
 * @description
 */
public class LeetCode_561 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
