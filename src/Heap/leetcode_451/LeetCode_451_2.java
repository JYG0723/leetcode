package Heap.leetcode_451;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ji YongGuang.
 * @date 10:34 2019/1/11.
 * @description
 */
public class LeetCode_451_2 {

    /**
     * 输入:
     * "tree"
     * <p>
     * 输出:
     * "eert"
     */
    class Solution {
        public String frequencySort(String s) {
            char[] chars = s.toCharArray();
            Map<Character, Integer> maps = new HashMap<>();

            for (char c : chars) {// 统计每个元素出现的次数
                maps.put(c, maps.getOrDefault(c, 0) + 1);
            }

            // 声明一个数组，数组的每个索引处的位置相当于元素出现的次数。
            List<Character>[] list = new ArrayList[s.length() + 1];
            maps.forEach((k, v) -> {// 统计maps中各k出现的次数，按v战队
                if (list[v] == null)
                    list[v] = new ArrayList<>();
                list[v].add(k);
            });

            StringBuilder sb = new StringBuilder();
            for (int index = list.length - 1; index > 0; index--) {// list[0] 不用打印
                ArrayList<Character> items = (ArrayList<Character>) list[index];

                if (items == null)
                    continue;
                for (char c : items)// 迭代集合每个元素index遍
                    for (int i = 0; i < index; i++)
                        sb.append(c);
            }
            return sb.toString();
        }
    }
}
