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

            ListNode curNode = head;
            if (head == null) {// 必须有这步进行检测，否则后面while循环curNode.next会报空指针
                return null;
            }

            while (curNode.next != null) {
                if (curNode.next.val == val) {
                    remNode = curNode.next;
                    curNode.next = remNode.next;
                    remNode.next = null;
                } else {
                    curNode = curNode.next;
                }
            }

            return head;
        }
    }
}
