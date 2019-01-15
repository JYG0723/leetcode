package LinkedList.leetcode_19;

/**
 * @author Ji YongGuang.
 * @date 0:50 2019/1/15.
 * @description 删除链表的倒数第N个节点
 */
public class LeetCode_19_2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast = dummy;
            ListNode slow = dummy;

            for (int i = 1; i <= n + 1; i++) {// fast先走n+1步。该循环结束后，fast节点应该比slow节点快n+1步。
                fast = fast.next;
            }

            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            // slow即待删除节点的前驱节点
            ListNode rem = slow.next;
            slow.next = rem.next;
            rem.next = null;

            return dummy.next;
        }
    }
}
