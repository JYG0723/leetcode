package Sort.temp;

/**
 * @author Ji YongGuang.
 * @date 16:29 2018/12/17.
 * @description 插入排序
 */
public class InsertionSort {

    private static int[] inertionSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return arr;
        }

        for (int i = 1; i < len; i++) {// 逐步递增向 前面的有序数列添加元素
            int temp = arr[i];
            int j = i - 1;

            for (; j >= 0; j--) {
                if (arr[j] > temp) // 因为是递增有序序列，所以要大从j=i-1就开始后移元素了
                    arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 1, 2, 6};
        int[] resArr = inertionSort(arr);
        StringBuilder sb = new StringBuilder("[");
        for (int item : resArr) {
            sb.append(item);
            sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
