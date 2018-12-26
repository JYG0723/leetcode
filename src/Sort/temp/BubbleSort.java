package Sort.temp;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 16:14 2018/12/17.
 * @description 冒泡排序
 */
public class BubbleSort {

    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return;
        }

        for (int i = 0; i < len - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < len - i - 1; j++) {// -1即arr[len]取不到，且arr[len-2]就已经和arr[len-1]比较了
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (!flag) {
                return;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 1, 2, 6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
