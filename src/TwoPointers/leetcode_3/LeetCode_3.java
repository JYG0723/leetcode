package TwoPointers.leetcode_3;

/**
 * @author Ji YongGuang.
 * @date 15:12 2019/1/9.
 * @description 无重复字符的最长子串
 * 滑动窗口
 */
public class LeetCode_3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int l = 0, r = -1;// 滑动窗口，l 左边，r 右边
            int len = 0;
            int[] freq = new int[128];

            while (l < s.length()) {
                if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {// 必须判断r + 1 < s.length()，
                    // 因为l..r之间在我们的滑动窗口的范围，要继续扩大滑动窗口就要保证r右边界不出界
                    freq[s.charAt(++r)]++;
                } else {
                    freq[s.charAt(l++)]--;
                }
                // 计算该趟子串的长度为多少
                len = Math.max(len, r - l + 1);
                if (r + 1 >= s.length()) {// 滑动窗口已不能再扩大
                    break;
                }
            }
            return len;
        }
    }
}
