package Sort;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 18:40 2018/12/24.
 * @description 基数排序
 * https://mp.weixin.qq.com/s?__biz=MzI4Njg5MDA5NA==&mid=2247484071&idx=2&sn=5195363e7a5c5e3e7cac2a733c2695e9&chksm=ebd743a6dca0cab0b79aec38ff835116af9079114c9266ef673c6c1009b32b2abf262bf35e0c#rd
 */
public class RadixSort {

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    /**
     * 把数组按指数位进行排序
     *
     * @param a   a
     * @param exp exp
     */
    private static void sort(int[] a, int exp) {
        int[][] buckets = new int[a.length][10];

        for (int i = 0; i < a.length; i++) {
            int index = (a[i] / exp) % 10;// 拿到比较位的数值
            buckets[i][index] = a[i];// 各数存到其对应的桶中
        }

        int count = 0;
        // 对每个桶里的元素进行回收
        for (int j = 0; j < 10; j++)
            for (int l = 0; l < a.length; l++)
                if (buckets[l][j] != 0)// 桶里有元素就回收
                    a[count++] = buckets[l][j];
    }

    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // 从各位开始，把数组按指数进行排序
        for (int i = 1; max / i > 0; i *= 10)
            sort(arr, i);
    }

    public static void main(String[] args) {
        int a[] = {53, 3, 542, 748, 14, 214, 154, 63, 616};
        radixSort(a);    // 基数排序
        System.out.println(Arrays.toString(a));
    }
}
