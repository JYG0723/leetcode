package array.leetcode_35;

/**
 * @author Ji YongGuang.
 * @date 15:15 2018/11/27.
 * @description 搜索插入位置
 */
public class LeetCode_35 {

    public int searchInsert(int[] nums, int target) {// 1356 7

        int len = nums.length;

        int insertIndex = 0;
        for (int i = 0; i < len; i++) {

            if (nums[i] == target) {
                return i;
            }

            if (nums[i] > target) {
                insertIndex = i;
                break;
            }
        }

        if (nums[len - 1] < target) {
            return len;
        }

        return insertIndex;
    }
}
