package LinkedList.leetcode_328;

/**
 * @author Ji YongGuang.
 * @date 20:28 2019/1/13.
 * @description 奇偶链表
 */
public class LeetCode_328 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {// time:O(n) space: O(1)
        public ListNode oddEvenList(ListNode head) {
            ListNode cur = head;// 初始节点
            if (head != null) {
                ListNode odd = cur; ListNode evenNode = cur.next; ListNode even = evenNode;

                while (even != null && even.next != null) {//
                    odd.next = even.next;
                    odd = odd.next;
                    even.next = odd.next;
                    even = even.next;
                }
                odd.next = evenNode;
            }
            return head;
        }
    }
}
