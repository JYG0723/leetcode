package Sort;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 22:56 2018/12/25.
 * @description 堆排序
 */
public class HeapSort {

    private static void heapSort(int[] arr) {
        int len = arr.length;
        if (len <= 1)
            return;

        for (int i = len / 2 - 1; i >= 0; i--)// 从最后一个父节点开始构建堆
            adjustHeap(arr, i, len - 1);

        for (int i = len - 1; i >= 0; i--) {// 交换记录
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustHeap(arr, 0, i - 1);// 调整堆
        }
    }

    /**
     * 构建大顶堆
     *
     * @param arr   arr
     * @param start 被下调节点的起始位置(一般为0，表示从第1个开始)
     * @param size  截至范围(一般为数组中最后一个元素的索引)
     */
    private static void adjustHeap(int[] arr, int start, int size) {
        int temp = arr[start];
        for (int j = start * 2 + 1; j <= size; start = j, j = j * 2 + 1) {
            if (j < size && arr[j] < arr[j + 1])// 这里j一定是小于size。否则++j就超出了size
                ++j;
            if (temp >= arr[j])// 已平衡
                break;
            else
                arr[start] = arr[j];// 子替父
        }
        arr[start] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 3, 5, 4, 1, 2, 6, 7};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
