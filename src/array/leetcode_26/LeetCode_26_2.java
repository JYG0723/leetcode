package array.leetcode_26;

/**
 * @author Ji YongGuang.
 * @date 17:36 2018/11/27.
 * @description
 */
public class LeetCode_26_2 {

    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        int count = 1;

        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                nums[count++] = nums[i];
            }
        }

        return count;
    }
}
