package String.leetcode_125;

/**
 * @author Ji YongGuang.
 * @date 19:49 2019/1/8.
 * @description
 */
public class LeetCode_125 {

    class Solution {
        public boolean isPalindrome(String s) {
            int len = s.length();

            char[] items = new char[len];
            int count = 0;
            for (int i = 0; i < len; i++) {// 将字符串中所有字母和数字提取出来先
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                    items[count++] = c;
                } else if (c >= 'A' && c <= 'Z') {
                    items[count++] = Character.toLowerCase(c);
                }
            }

            int i = 0, j = count - 1;
            while (i < j) {// i == j 时量元素指向同一个元素，那么认为他是回文串
                if (items[i++] != items[j--])
                    return false;
            }
            return true;
        }
    }
}
