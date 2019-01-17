package Queue.leetcode_23;

import java.util.PriorityQueue;

/**
 * @author Ji YongGuang.
 * @date 12:50 2019/1/17.
 * @description 合并K个排序链表
 */
public class LeetCode_23 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {

            // step1: 优先队列
            PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> {
                if (a.val > b.val) return 1;
                else if (a.val == b.val) return 0;
                else return -1;
            });

            // step2: 所有有序列表的队头入队
            for (ListNode node : lists)
                if (node != null)
                    pq.add(node);

            // step3: 整合所有链表
            ListNode dummy = new ListNode(0);
            ListNode d = dummy;

            while (!pq.isEmpty()) {
                d.next = pq.poll();
                d = d.next;

                if (d.next != null)
                    pq.add(d.next);
            }
            return dummy.next;
        }
    }
}
