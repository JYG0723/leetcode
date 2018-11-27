package array.leetcode_88;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 15:23 2018/11/27.
 * @description 合并两个有序数组
 */
public class LeetCode_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {// 有序整数数组

        int len_1 = nums1.length;
        int len_2 = nums2.length;

        for (int i = 0; i < len_2; i++) {
            nums1[len_1 - 1 - i] = nums2[i];
        }

        // 0 0 1,2,2,3,5,6
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        LeetCode_88 leetCode_88 = new LeetCode_88();
        int[] testArra = new int[]{1, 2, 3, 0, 0, 0};
        int[] testArrb = new int[]{2, 5, 6};
        leetCode_88.merge(testArra, 3, testArrb, 3);

        System.out.printf("[");
        for (int i = 0; i < testArra.length; i++) {
            System.out.printf("%d", testArra[i]);
            if (i != testArra.length - 1)
                System.out.printf(",");
        }
        System.out.printf("]");
    }
}
