package LinkedList.leetcode_61;

/**
 * @author Ji YongGuang.
 * @date 12:52 2019/1/15.
 * @description 旋转链表
 */
public class LeetCode_61 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode rotateRight(ListNode head, int k) {

            if (head == null || head.next == null)
                return head;

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast = dummy, slow = dummy;// fast是尾节点指针，slow是断链表指针

            int i;
            for (i = 0; fast.next != null; i++)
                fast = fast.next;

            for (int n = i - k % i; n > 0; n--) {
                slow = slow.next;
            }

            fast.next = dummy.next;
            dummy.next = slow.next;
            slow.next = null;
            return dummy.next;
        }
    }
}
