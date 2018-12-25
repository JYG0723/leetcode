package Sort;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 23:58 2018/12/18.
 * @description 归并排序
 */
public class MergeSort {

    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * 对数组a从数组下标low到high的元素进行归并排序
     *
     * @param a    待归并排序数组[p..q..r]
     * @param low  p 待归并排序的数组首元素
     * @param high r 待归并排序的数组尾元素
     * @return
     */
    private static void mergeSort(int[] a, int low, int high) {
        // 递归终止条件，归并排序的数组a只剩一个元素则不需要排序
        if (low == high)
            return;

        int mid = (low + high) / 2;
        // 左边
        mergeSort(a, low, mid);// 0 1
        // 右边
        mergeSort(a, mid + 1, high);// 1 1
        // 左右归并
        merge(a, low, mid, high);
    }

    /**
     * 被分治的子数组合并
     *
     * @param a    待归并排序的源数组
     * @param low  待合并数组的首元素
     * @param mid  待合并数组的切割元素
     * @param high 待合并数组的尾元素
     * @return
     */
    private static void merge(int[] a, int low, int mid, int high) {// 0 0 1
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;

        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        // 把左边剩余的数并入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数并入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            // 往上顶元素
            a[k2 + low] = temp[k2];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{50, 10, 90, 30, 70, 40, 80, 60, 20};
        mergeSort(arr);
        Arrays.toString(arr);
    }
}
