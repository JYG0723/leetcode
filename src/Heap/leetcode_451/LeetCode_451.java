package Heap.leetcode_451;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author Ji YongGuang.
 * @date 17:55 2018/12/13.
 * @description 根据字符出现频率排序
 */
public class LeetCode_451 {

    public String frequencySort(String s) {

        if (Objects.equals(null, s) || s.length() <= 2)
            return s;

        TreeMap<Character, Integer> map = new TreeMap<>();

        char[] chars = s.toCharArray();
        for (char c : chars) {
            /*map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);*/
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Java priorityQueue默认小顶堆,需要将原判断条件逆向
        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        // 把treeMap中的元素存到优先队列中
        map.forEach((k, v) -> queue.offer(k));

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Character character = queue.poll();
            for (int i = 0; i < map.get(character); i++) {
                sb.append(character);
                // sb.append(item); 不能append 否则左右孩子节点可能混轮进入
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LeetCode_451 leetCode_451 = new LeetCode_451();
        String eert = leetCode_451.frequencySort("Aabb");
        System.out.println(eert);
    }
}
