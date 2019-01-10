package HashTable.leetcode_290;

import java.util.HashMap;

/**
 * @author Ji YongGuang.
 * @date 19:42 2019/1/9.
 * @description 单词模式
 */
public class LeetCode_290 {
    static class Solution {
        public boolean wordPattern(String pattern, String str) {

            String[] arr = str.split(" ");
            HashMap<Character, String> map = new HashMap<>();
            if (arr.length != pattern.length())
                return false;

            for (int i = 0; i < arr.length; i++) {// "abba"  "dog cat cat dog"
                char c = pattern.charAt(i);
                if (map.containsKey(c)) {
                    if (!map.get(c).equals(arr[i]))
                        return false;
                } else {
                    if (map.containsValue(arr[i]))// 很精髓，如果k没出现v却出现了 即说明false
                        return false;
                    map.put(c, arr[i]);
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("abc", "b c a"));
    }
}
