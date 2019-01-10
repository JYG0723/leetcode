package Array.leetcode_283;

/**
 * @author Ji YongGuang.
 * @date 16:00 2018/11/25.
 * @description 标答
 */
public class LeetCode_283_2 {

    /**
     * 把数组首元素默认为0，然后数组的后续元素去替换该0，该0会随着数组下标的递增而被移到最后
     */
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int rightIntex = 0;
        for (int i = 0; i < len; i++) {// 思路：从前往后找，找到非0元素就往前放
            if (nums[i] != 0)
                if (i != rightIntex)
                    swap(nums, i, rightIntex++);
                else
                    rightIntex++;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
