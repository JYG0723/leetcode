package Sort.temp;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 16:13 2018/12/19.
 * @description
 */
public class QuickSort {

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * @param arr   待排序数组
     * @param start 待排序数组arr的元素比较的起始位置，数组下标
     * @param end   待排序数组arr的元素比较的终点位置，数组下标
     */
    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int i = start, j = end;
        int mid = arr[i];// 待排序数组的首位置
        while (i < j) {
            while (i < j && arr[j] >= mid) {// 找后半数组小于mid的元素的数组下标
                j--;
            }
            if (i < j)
                arr[i++] = arr[j];

            while (i < j && arr[i] <= mid) {// 找前半数组大于mid的元素的数组下表
                i++;
            }
            if (i < j)
                arr[j--] = arr[i];
        }
        // 安置前面比较过程使用过的中间元素
        arr[i] = mid;
        quickSort(arr, start, i - 1);
        quickSort(arr, i + 1, end);
    }

    public static void main(String[] args) {

        int a[] = {49, 38, 65, 97, 76, 13, 27, 49};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }

}
