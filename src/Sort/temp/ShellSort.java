package Sort.temp;

/**
 * @author Ji YongGuang.
 * @date 18:48 2018/12/25.
 * @description 希尔排序
 */
public class ShellSort {

    private static void shellSort(int[] arr) {

        int len = arr.length;
        if (len <= 1)
            return;

        for (int step = len / 2; step > 0; step /= 2)// 从len/2到1递减增量来排序
            for (int i = step; i < len; i++) {// 第一个拿元素比较的位置，默认0已经在手中w
                int j = i - step;
                int temp = arr[i];

                // 找temp的合适位置
                for (; j >= 0; j -= step)// 根据增量向前递减寻找前驱元素进行比较
                    if (arr[j] > temp)
                        arr[j + step] = arr[j];
                    else
                        break;
                arr[j + step] = temp;
            }
    }
}
