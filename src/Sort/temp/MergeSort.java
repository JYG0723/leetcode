package Sort.temp;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 9:35 2018/12/19.
 * @description 归并排序
 */
public class MergeSort {

    /**
     * 对数组arr进行归并排序
     *
     * @param arr
     */
    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * 归并排序数组arr从start到end索引处的元素
     *
     * @param arr   待归并排序数组
     * @param start 数组归并排序的起始位置
     * @param end   数组归并排序的末尾位置
     */
    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = (start + end) / 2;
        // 左归并排序
        mergeSort(arr, start, mid);
        // 右归并排序
        mergeSort(arr, mid + 1, end);
        // 左右归并排序后的结果归并
        merge(arr, start, mid, end);
    }

    /**
     * 将数组arr从start-mid处的元素 与数组arr从mid+1到end处的元素归并。
     *
     * @param arr   待归并排序数组
     * @param start 数组归并的起始位置
     * @param mid   数组归并的中间节点
     * @param end   数组归并的末尾位置
     */
    private static void merge(int[] arr, int start, int mid, int end) {
        // 准备临时数组
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int index = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])// 两个序列谁小谁先进备用数组
                temp[index++] = arr[i++];
            else
                temp[index++] = arr[j++];
        }

        // 剩余元素归到数组末尾待下一轮归并排序使其有序化
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= end) {
            temp[index++] = arr[j++];
        }

        // 元素归位
        for (int k = 0; k < temp.length; k++) {
            arr[start + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{50, 10, 90, 30, 70, 40, 80, 60, 20};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
