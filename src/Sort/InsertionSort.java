package Sort;

/**
 * @author Ji YongGuang.
 * @date 16:22 2018/12/14.
 * @description 插入排序
 */
public class InsertionSort {

    private static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) // 比较趟数

            for (int j = i; j > 0; j--)// 和前驱位置比较大小
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1]; // 元素后移
                    arr[j - 1] = temp;
                } else
                    break; // 数组前面元素不再含有比该值大的元素，此次比较结束
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
