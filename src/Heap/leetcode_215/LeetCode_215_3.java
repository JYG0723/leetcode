package Heap.leetcode_215;

/**
 * @author Ji YongGuang.
 * @date 17:32 2019/1/8.
 * @description 快排
 * 时间复杂度O(n) 空间复杂度O(1)
 */
public class LeetCode_215_3 {

    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int i = partition(nums, l, r);
            if (i == k)
                break;
            else if (i < k)
                l = i + 1;
            else // i > k
                r = i - 1;
        }
        return nums[k];
    }

    private int partition(int[] arr, int l, int r) {
        int temp = arr[l];
        int i = l, j = r + 1;
        while (true) {
            while (arr[++i] < temp && i < r) ;
            while (arr[--j] > temp && j > l) ;
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
        }
        swap(arr, j, l);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
