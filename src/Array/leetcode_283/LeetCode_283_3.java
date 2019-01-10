package Array.leetcode_283;

/**
 * @author Ji YongGuang.
 * @date 19:32 2019/1/7.
 * @description
 */
public class LeetCode_283_3 {

    public void moveZeroes(int[] nums) {

        int len = nums.length;
        if (len <= 1)
            return;

        int index = 0;// 从nums[0,index)的位置均为非0元素
        for (int i = 0; i < len; i++) {// 0,1,0,3,12
            if (nums[i] != 0)
                nums[index++] = nums[i];
        }

        for (int j = index; j < len; j++) {
            nums[j] = 0;
        }
    }
}
