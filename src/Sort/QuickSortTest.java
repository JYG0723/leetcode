package Sort;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 19:27 2018/12/20.
 * @description 寻找 4， 2， 5， 12， 3 这样一组数据，第 3 大元素
 * https://blog.csdn.net/xiaoding133/article/details/8037086 博客记录了多种解法
 */
public class QuickSortTest {

    private static int quickSort(int[] arr, int n) {
        return quickSort(arr, 0, arr.length - 1, n);
    }

    /**
     * 对arr从数组下标start到end处的元素进行快速排序
     *
     * @param arr   目标数组
     * @param start 目标数组待排序元素的起始位置
     * @param end   目标数组待排序元素的终点位置
     */
    private static int quickSort(int[] arr, int start, int end, int n) {
        if (start >= end) // 只有一个元素就只返回该元素即可
            return arr[start];

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
        if (i + 1 == n)
            return arr[i];
        else if (n > i + 1)
            return quickSort(arr, i + 1, end, n);// 对高子表进行递归排序
        else
            return quickSort(arr, start, i - 1, n);// 对低子表进行递归排序
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 5, 12, 3};
        System.out.println(quickSort(arr, 3));
        Arrays.toString(arr);
    }
}
