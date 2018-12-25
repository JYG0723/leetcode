package Sort;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 18:27 2018/12/25.
 * @description 希尔排序
 */
public class ShellSort {

    private static void shellSort(int[] arr) {

        int len = arr.length;
        if (len <= 1)
            return;

        for (int step = len / 2; step > 0; step /= 2)
            for (int i = step; i < len; i++) {
                int j = i - step;
                int temp = arr[i];

                for (; j >= 0; j -= step)
                    if (arr[j] > temp)// 元素后移
                        arr[j + step] = arr[j];
                    else
                        break;

                arr[j + step] = temp;
            }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 1, 2, 6};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
