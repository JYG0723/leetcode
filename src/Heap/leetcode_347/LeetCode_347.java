package Heap.leetcode_347;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author Ji YongGuang.
 * @date 1:04 2019/1/17.
 * @description 前K个高频元素
 */
public class LeetCode_347 {
    class Solution {

        public List<Integer> topKFrequent(int[] nums, int k) {
            int len = nums.length;
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int i = 0; i < len; i++)
                map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);

            //todo 默认最小堆
            PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

            map.forEach((v, p) -> {
                if (queue.size() < k) {
                    queue.add(v);
                } else if (p > map.get(queue.peek())) {
                    queue.remove();
                    queue.add(v);
                }
            });

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < k; i++)
                list.add(queue.remove());
            return list;
        }
    }
}
