package LinkedList.leetcode_24;

/**
 * @author Ji YongGuang.
 * @date 16:15 2019/1/14.
 * @description 两两交换链表中的节点
 */
public class LeetCode_24 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode d = dummy;

            while (d.next != null && d.next.next != null) {// d是定位条件
                ListNode node1 = d.next;
                ListNode node2 = node1.next;

                node1.next = node2.next;
                node2.next = node1;
                d.next = node2;

                d = node1;
            }
            return dummy.next;
        }
    }
}
