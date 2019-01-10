package String.leetcode_345;

/**
 * @author Ji YongGuang.
 * @date 20:29 2019/1/8.
 * @description 反转字符串中的元音字母
 * 双指针
 */
public class LeetCode_345 {

    static class Solution {
        public String reverseVowels(String s) {// 快排partition操作
            String vowels = "aeiouAEIOU";

            char[] items = s.toCharArray();
            int l = 0, r = s.length() - 1;
            while (l < r) {// l == r不反转
                while (!vowels.contains(items[l] + "") && l < r) {
                    l++;
                }
                while (!vowels.contains(items[r] + "") && r > l) {
                    r--;
                }
                if (l >= r)
                    break;
                swap(items, l++, r--);
            }
            return new String(items);
        }

        private void swap(char[] arr, int i, int j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        String test = "hello";
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels(test));
    }
}
