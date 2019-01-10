package HashTable.leetcode_242;

/**
 * @author Ji YongGuang.
 * @date 18:49 2019/1/9.
 * @description 针对没有Unicode字符的情况
 */
public class LeetCode_242_2 {
    public class Solution {
        public boolean isAnagram(String s, String t) {
            int[] arr = new int[26];

            for (int i = 0; i < s.length(); i++)
                arr[s.charAt(i) - 'a']++;

            for (int i = 0; i < t.length(); i++)
                arr[s.charAt(i) - 'a']--;

            for (int i = 0; i < arr.length; i++)
                if (arr[i] != 0)
                    return false;
            return true;
        }
    }
}
