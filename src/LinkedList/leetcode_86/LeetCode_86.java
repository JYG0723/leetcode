package LinkedList.leetcode_86;

/**
 * @author Ji YongGuang.
 * @date 20:09 2019/1/13.
 * @description
 */
public class LeetCode_86 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode btHead = new ListNode(0);// 大于等于x
            ListNode ltHead = new ListNode(0);// 小于x

            ListNode lt = ltHead;
            ListNode bt = btHead;
            ListNode cur = head;
            while (cur != null) {
                if (cur.val < x) {
                    lt.next = new ListNode(cur.val);
                    lt = lt.next;
                } else { // >=
                    bt.next = new ListNode(cur.val);
                    bt = bt.next;
                }
                cur = cur.next;
            }
            lt.next = btHead.next;
            return ltHead.next;
        }
    }
}
