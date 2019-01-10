package Array.leetcode_215;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 16:29 2018/12/13.
 * @description 数组中的第K个最大元素
 */
public class LeetCode_215 {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        LeetCode_215 leetCode_215 = new LeetCode_215();
        int[] testArr = new int[]{3, 2, 1, 5, 6, 4};
        int kthLargest = leetCode_215.findKthLargest(testArr, 2);
        System.out.println(kthLargest);
    }
}
