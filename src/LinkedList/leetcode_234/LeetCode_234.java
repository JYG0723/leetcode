package LinkedList.leetcode_234;

/**
 * @author Ji YongGuang.
 * @date 13:06 2019/1/15.
 * @description 回文链表
 */
public class LeetCode_234 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {// time:O(n) space:O(1)
        // step1:快慢指针找中间节点
        // step2:然后反转后半部分链表
        // step3:两部分链表依次比较节点即可
        public boolean isPalindrome(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode fast = dummy, slow = fast;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            ListNode head1 = slow.next;
            slow.next = null;
            ListNode head2 = reverse(head1);

            // compare head & head2
            while (head2 != null) {
                if (head.val != head2.val)
                    return false;
                head = head.next;
                head2 = head2.next;
            }
            return true;
        }

        private ListNode reverse(ListNode head) {
            ListNode pre = null;
            while (head != null) {
                ListNode nextN = head.next;
                head.next = pre;

                pre = head;
                head = nextN;
            }
            return pre;
        }
    }
}
