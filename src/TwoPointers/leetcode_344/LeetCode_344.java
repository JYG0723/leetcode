package TwoPointers.leetcode_344;

/**
 * @author Ji YongGuang.
 * @date 20:12 2019/1/8.
 * @description 反转字符串
 */
public class LeetCode_344 {
    class Solution {
        public String reverseString(String s) {
            int len = s.length();

            char[] items = new char[len];
            for(int i = 0; i < len; i ++) {
                items[i] = s.charAt(i);
            }

            StringBuilder sb = new StringBuilder();
            for(int i = len - 1; i >= 0; i --) {
                sb.append(items[i]);
            }

            return sb.toString();
        }
    }
}
