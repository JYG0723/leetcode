package LinkedList.leetcode_328;

/**
 * @author Ji YongGuang.
 * @date 20:38 2019/1/13.
 * @description
 */
public class LeetCode_328_1 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {// time:O(n) space:O(n)
        public ListNode oddEvenList(ListNode head) {
            ListNode cur = head;
            ListNode oddHead = new ListNode(1);
            ListNode evenHead = new ListNode(2);

            ListNode odd = oddHead;
            ListNode even = evenHead;
            for (int i = 1; cur != null; cur = cur.next, i++) {
                if (i % 2 != 0) {// odd
                    odd.next = new ListNode(cur.val);
                    odd = odd.next;
                } else {
                    even.next = new ListNode(cur.val);
                    even = even.next;
                }
            }

            odd.next = evenHead.next;
            return oddHead.next;
        }
    }
}
