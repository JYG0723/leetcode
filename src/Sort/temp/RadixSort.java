package Sort.temp;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 16:00 2018/12/25.
 * @description 基数排序
 * https://mp.weixin.qq.com/s?__biz=MzI4Njg5MDA5NA==&mid=2247484071&idx=2&sn=5195363e7a5c5e3e7cac2a733c2695e9&chksm=ebd743a6dca0cab0b79aec38ff835116af9079114c9266ef673c6c1009b32b2abf262bf35e0c#rd
 */
public class RadixSort {

    private static void radixSort(int[] a) {
        int max = getMax(a);

        for (int i = 1; max / i > 0; i *= 10) {// i控制的是 此次排序比较的位
            sort(a, i);
        }
    }

    /**
     * 对数组a按exp位进行排序`
     *
     * @param a   a
     * @param exp exp
     */
    private static void sort(int[] a, int exp) {
        int[][] buckets = new int[a.length][10];

        // 对数组a中每个元素取其exp位，然后放到自己该在的桶中
        for (int i = 0; i < a.length; i++)
            buckets[i][a[i] / exp % 10] = a[i];

        // 对每个桶中的元素进行回收
        int count = 0;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < a.length; j++)
                if (buckets[j][i] != 0)
                    a[count++] = buckets[j][i];
    }

    private static int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {
        int a[] = {53, 3, 542, 748, 14, 214, 154, 63, 616};
        radixSort(a);    // 基数排序
        System.out.println(Arrays.toString(a));
    }
}
