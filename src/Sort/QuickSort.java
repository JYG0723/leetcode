package Sort;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 11:16 2018/12/19.
 * @description 快速排序
 */
public class QuickSort {

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * 对arr从数组下标start到end处的元素进行快速排序
     *
     * @param arr   目标数组
     * @param start 目标数组待排序元素的起始位置
     * @param end   目标数组待排序元素的终点位置
     */
    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int i = start, j = end;
        int index = arr[i];// 用子表的第一个记录做基准
        while (i < j) {
            while (i < j && arr[j] >= index) {// 从后往前找到第一个不大于index的元素的数组下标
                j--;
            }
            if (i < j)
                arr[i++] = arr[j];

            while (i < j && arr[i] < index) {// 从前往后找到第一个大于index的元素的数组下标
                i++;
            }
            if (i < j)
                arr[j--] = arr[i];
        }
        // 上序遍历完，i = j 但是数组会空出一个位置。空出的位置填上中间元素index
        arr[i] = index;
        quickSort(arr, start, i - 1);// 对低子表进行递归排序
        quickSort(arr, i + 1, end);// 对高子表进行递归排序
    }

    public static void main(String[] args) {

        int a[] = {49, 38, 65, 97, 76, 13, 27, 49};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
