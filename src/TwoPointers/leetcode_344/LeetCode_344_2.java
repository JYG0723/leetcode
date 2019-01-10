package TwoPointers.leetcode_344;

/**
 * @author Ji YongGuang.
 * @date 20:12 2019/1/8.
 * @description 双指针
 */
public class LeetCode_344_2 {

    class Solution {
        public String reverseString(String s) {
            char[] items = s.toCharArray();
            int l = 0, r = items.length - 1;
            while (l < r) {
                if (items[l] == items[r]) {
                    l++;
                    r--;
                } else {
                    swap(items, l++, r--);
                }
            }
            return new String(items);
        }

        private void swap(char[] arr, int i, int j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
