package Sort;

/**
 * @author Ji YongGuang.
 * @date 16:22 2018/12/14.
 * @description 插入排序
 */
public class InsertionSort {

    private static int[] insertionSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return arr;
        }

        // 像有序数据队中插入元素 并使原有序队继续有序
        for (int i = 1; i < len; i++) {// 比较趟数
            int temp = arr[i];
            int j = i - 1;

            for (; j >= 0; j--) {
                if (arr[j] > temp) // 切户忘记与arr[i]比较的是有序递增队列。
                    arr[j + 1] = arr[j]; // 元素后移
                else
                    break; // 数组前面元素不再含有比该值大的元素，此次比较结束
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 1, 2, 6};
        int[] resArr = insertionSort(arr);
        StringBuilder sb = new StringBuilder("[");
        for (int item : resArr) {
            sb.append(item);
            sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
