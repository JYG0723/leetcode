package TwoPointers.leetcode_28;

/**
 * @author Ji YongGuang.
 * @date 15:53 2019/1/9.
 * @description 实现strStr()
 */
public class LeetCode_28 {
    class Solution {
        public int strStr(String haystack, String needle) {
            for (int i = 0; ; i++) {// haystack
                for (int j = 0; ; j++) {// needle
                    if (j == needle.length()) return i;// needle最后一个元素比完了，i没有被换即结果找到
                    if (i + j == haystack.length()) return -1;// haystack最后一个元素比完了，j还没被换即结果没找到
                    if (haystack.charAt(i + j) != needle.charAt(j)) break;// 换i
                }
            }
        }
    }
}
