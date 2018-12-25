package Sort.temp;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 23:53 2018/12/25.
 * @description 堆排序
 */
public class HeapSort {

    private static void heapSort(int[] arr) {
        int len = arr.length;
        if (len <= 1)
            return;

        for (int i = len / 2 - 1; i >= 0; i--)// 构建堆，从最后一个父节点开始
            // 最大元素的下标获取可以截止到数组最后一个元素
            adjustHeap(arr, i, len - 1);

        for (int i = len - 1; i >= 0; i--) {// 交换头尾元素
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            adjustHeap(arr, 0, i - 1);// 构建堆
        }
    }

    private static void adjustHeap(int[] arr, int start, int size) {
        int temp = arr[start];
        for (int i = start * 2 + 1; i <= size; start = i, i = i * 2 + 1) {// 从左孩子开始比较
            if (i < size && arr[i] < arr[i + 1]) // 存在右孩子且右孩子大于左孩子
                ++i;
            if (temp > arr[i])// 已经有序
                break;
            else
                arr[start] = arr[i];
        }
        arr[start] = temp;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{8, 3, 5, 4, 1, 2, 6, 7};
        heapSort(testArr);
        System.out.println(Arrays.toString(testArr));
    }
}
