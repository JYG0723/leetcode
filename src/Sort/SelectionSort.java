package Sort;

/**
 * @author Ji YongGuang.
 * @date 12:58 2018/12/17.
 * @description 选择排序 即每次遍历选出最大或最小的一个元素。共遍历n-1次
 */
public class SelectionSort {

    private static int[] selectionSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return arr;
        }

        // 小到大递增序列
        for (int j = 0; j < len - 1; j++) {// 比较的趟数，当数组中剩最后一个元素时退出，因为此时数组已然有序
            int soldier = 0;// 记录最终最大值数组下标

            for (int i = 0; i < len - j; i++) {// 剩余元素中提取最大值，比较过了几趟，就少比较几个数
                if (arr[i] > arr[soldier]) {
                    soldier = i;
                }
            }

            // 最大值换到未排序序列的最后一位
            int temp = arr[len - j - 1];
            arr[len - j - 1] = arr[soldier];
            arr[soldier] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 1, 2, 6};
        int[] resArr = selectionSort(arr);
        StringBuilder sb = new StringBuilder("[");
        for (int item : resArr) {
            sb.append(item);
            sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
