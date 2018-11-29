package Array.leetcode_26;

/**
 * @author Ji YongGuang.
 * @date 14:10 2018/11/27.
 * @description 删除排序数组中的重复项
 */
public class LeetCode_26 {

    public int removeDuplicates(int[] nums) {// 排序数组

        int len = nums.length;

        int dumy = 0;
        for (int i = 1; i < len && i > 0; i++) {

            if (dumy + i == len) {
                break;
            }

            if (nums[i] == nums[i - 1]) {
                dumy++;
                for (int j = i + 1; j < len; j++) {
                    nums[j - 1] = nums[j];
                }
                i--;
            }
        }

        return len - dumy;
    }

    public static void main(String[] args) {
        LeetCode_26 leetCode_26 = new LeetCode_26();
        int[] testArr = new int[]{1, 1, 2};

        System.out.printf("数组长度: %d", leetCode_26.removeDuplicates(testArr));

        System.out.printf("\n");
        System.out.printf("[");
        for (int i = 0; i < testArr.length; i++) {
            System.out.printf("%d", testArr[i]);
            if (i != testArr.length - 1)
                System.out.printf(",");
        }
        System.out.printf("]");
    }
}
