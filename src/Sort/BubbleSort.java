package Sort;

/**
 * @author Ji YongGuang.
 * @date 15:26 2018/12/14.
 * @description 冒泡排序
 */
public class BubbleSort {

    /**
     * 小到大
     */
    private static int[] bubbleSort(int[] arr) {

        int len = arr.length;
        if (len <= 1)
            return arr;

        int count = 0;
        for (int i = 0; i < len; i++) {// 控制循环次数

            count++;
            boolean flag = false;
            for (int j = 0; j < len - i - 1; j++) {// (len-i-1) i即数组尾已经有序的元素，1即不和自己比较
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    // 不介入第三个变量交换两元素
                    /*arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];*/
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }

            if (!flag) {
                System.out.println(count);// 单纯统计下次数
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 1, 2, 6};
        int[] resArr = bubbleSort(arr);
        StringBuilder sb = new StringBuilder("[");
        for (int item : resArr) {
            sb.append(item);
            sb.append(",");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
