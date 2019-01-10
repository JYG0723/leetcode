package Array.leetcode_88;

/**
 * @author Ji YongGuang.
 * @date 15:23 2018/11/27.
 * @description 归并
 */
public class LeetCode_88_2 {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int k = m-- + n-- - 1;

            while (m >= 0 && n >= 0) {
                nums1[k--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            }

            // m 和 nums1挂钩，nums1元素默认在
            while (n >= 0) {
                nums1[k--] = nums1[n--];
            }
        }
    }
}
