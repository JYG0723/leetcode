package LinkedList.leetcode_148;

/**
 * @author Ji YongGuang.
 * @date 23:10 2019/1/14.
 * @description 排序链表
 */
public class LeetCode_148 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null)
                return head;

            ListNode fast = head, slow = head;// slow节点时后链表的头结点，fast节点用来定位两个链表的头结点程序
            ListNode pre = head;// pre节点是前链表的尾节点，用来分割两个链表
            while (fast != null && fast.next != null) {// 快慢节点分割链表进行归并
                fast = fast.next.next;
                pre = slow;
                slow = slow.next;
            }
            pre.next = null;

            ListNode l1 = sortList(head);
            ListNode l2 = sortList(slow);

            return merge(l1, l2);
        }

        private ListNode merge(ListNode l1, ListNode l2) {// 归并
            ListNode res = new ListNode(0), r = res;


            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    r.next = l1;
                    l1 = l1.next;
                } else { // >=
                    r.next = l2;
                    l2 = l2.next;
                }
                r = r.next;
            }

            if (l1 != null) {
                r.next = l1;
            }

            if (l2 != null) {
                r.next = l2;
            }

            return res.next;
        }
    }
}
