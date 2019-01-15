package LinkedList.leetcode_206;

/**
 * @author Ji YongGuang.
 * @date 16:47 2019/1/13.
 * @description 反转链表
 */
public class LeetCode_206 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        /**
         * 输入: 1->2->3->4->5->NULL
         * 输出: 5->4->3->2->1->NULL
         *
         * @param head
         * @return
         */
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null)
                return head;

            ListNode curNode = head;
            ListNode prevNode = null;
            while (curNode != null) {
                ListNode nextNode = curNode.next;

                curNode.next = prevNode;
                prevNode = curNode;
                curNode = nextNode;
            }
            return prevNode;
        }
    }
}
