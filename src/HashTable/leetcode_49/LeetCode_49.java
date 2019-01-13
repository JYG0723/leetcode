package HashTable.leetcode_49;

import java.util.*;

/**
 * @author Ji YongGuang.
 * @date 17:16 2019/1/11.
 * @description
 */
public class LeetCode_49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> maps = new HashMap<>();
            for (String str : strs) {// ["eat", "tea", "tan", "ate", "nat", "bat"]
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String item = String.valueOf(chars);// 各元素重组

                if (maps.get(item) == null)// 安置所有重组后相等的字符串
                    maps.put(item, new ArrayList<>());
                maps.get(item).add(str);
            }

            return new ArrayList<>(maps.values());
        }
    }
}
