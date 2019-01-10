package LinkedList.leetcode_203;

/**
 * @author Ji YongGuang.
 * @date 15:38 2019/1/10.
 * @description
 */
public class LeetCode_203 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            ListNode remNode;
            // 排除头结点为6
            while (head != null && head.val == val) {
                remNode = head;
                head = head.next;
                remNode.next = null;
            }

            ListNode prevNode = head;
            if (head == null) {
                return null;
            }

            while (prevNode.next != null) {
                if (prevNode.next.val == val) {
                    remNode = prevNode.next;
                    prevNode.next = remNode.next;
                    remNode.next = null;
                } else {
                    prevNode = prevNode.next;
                }
            }

            return head;
        }
    }
}
