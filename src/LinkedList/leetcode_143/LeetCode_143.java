package LinkedList.leetcode_143;

/**
 * @author Ji YongGuang.
 * @date 12:35 2019/1/15.
 * @description 重排链表
 */
public class LeetCode_143 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void reorderList(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast = dummy, slow = dummy;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            ListNode head1 = slow.next;
            slow.next = null;
            ListNode head2 = reverse(head1);

            while (head != null && head2 != null) {
                ListNode p = head2.next;
                head2.next = head.next;
                head.next = head2;

                head = head2.next;
                head2 = p;
            }
        }

        private ListNode reverse(ListNode head) {
            ListNode cur = null;
            while (head != null) {
                ListNode nextN = head.next;
                head.next = cur;

                cur = head;
                head = nextN;
            }
            return cur;
        }
    }
}
