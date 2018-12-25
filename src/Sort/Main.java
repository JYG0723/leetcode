package Sort;

import java.util.Arrays;

/**
 * @author Ji YongGuang.
 * @date 15:04 2018/12/24.
 * @description
 */
public class Main {

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            if (arr[j] < arr[i])
                temp[k++] = arr[j++];
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            arr[l + low] = temp[l];
        }
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int i = start;
        int j = end;
        int temp = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= temp) {
                j--;
            }
            if (i < j)
                arr[i] = arr[j];

            while (i < j && arr[i] < temp) {
                i++;
            }
            if (i < j)
                arr[j] = arr[i];
        }
        arr[i] = temp;

        quickSort(arr, start, i - 1);
        quickSort(arr, i + 1, end);
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{50, 10, 90, 30, 70, 40, 80, 60, 20};
        quickSort(testArr);
        System.out.println(Arrays.toString(testArr));
    }

}
