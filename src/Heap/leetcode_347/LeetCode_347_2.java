package Heap.leetcode_347;

import java.util.*;
import java.util.PriorityQueue;

/**
 * @author Ji YongGuang.
 * @date 12:34 2018/12/13.
 * @description
 */
public class LeetCode_347_2 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        int len = nums.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < len; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }

        //todo 默认最小堆
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        map.forEach((v, p) -> {
            if (queue.size() < k) {
                queue.add(v);
            } else if (p > map.get(queue.peek())) {
                queue.remove();
                queue.add(v);
            }
        });

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(queue.remove());
        }
        return list;
    }

    public static void main(String[] args) {
        LeetCode_347_2 leetCode_347_2 = new LeetCode_347_2();
        int[] testArr = new int[]{1, 1, 1, 2, 2, 3};
        List<Integer> list = leetCode_347_2.topKFrequent(testArr, 2);
        for (Integer item : list) {
            System.out.printf("%d ", item);
        }
    }
}
