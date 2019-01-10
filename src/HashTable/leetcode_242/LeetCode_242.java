package HashTable.leetcode_242;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ji YongGuang.
 * @date 18:28 2019/1/9.
 * @description 有效的字母异位词
 * 针对字符串中有Unicode字符的情况使用Map解决.
 */
public class LeetCode_242 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            Map<Character, Integer> chars = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!chars.containsKey(c)) {
                    chars.put(c, 1);
                } else {
                    chars.put(c, chars.get(c) + 1);
                }
            }

            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                if (!chars.containsKey(c)) {
                    return false;
                } else {
                    chars.put(c, chars.get(c) - 1);
                }
            }

            Set<Map.Entry<Character, Integer>> entries = chars.entrySet();
            for (Map.Entry<Character, Integer> item : entries) {
                if (item.getValue() != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
