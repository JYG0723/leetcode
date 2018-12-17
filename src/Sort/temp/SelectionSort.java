package Sort.temp;

/**
 * @author Ji YongGuang.
 * @date 17:13 2018/12/17.
 * @description 选择排序
 */
public class SelectionSort {

    private static int[] selectionSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return arr;
        }

        for (int i = 0; i < len - 1; i++) {// 最后一个元素不需要再比较
            int soldier = 0;// 未排序序列中最大值的索引
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[soldier]) {
                    soldier = j;
                }
            }

            // 数据交换
            int temp = arr[len - i - 1];
            arr[len - i - 1] = arr[soldier];
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
