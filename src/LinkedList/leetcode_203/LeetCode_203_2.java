package LinkedList.leetcode_203;

/**
 * @author Ji YongGuang.
 * @date 14:02 2019/1/14.
 * @description 移除链表元素
 */
public class LeetCode_203_2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            if (head == null)
                return head;

            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;

            ListNode cur = dummyHead;
            while (cur.next != null) {
                ListNode nextNode = cur.next;
                if (nextNode.val == val) {// 当前元素的下个元素匹配
                    ListNode remNode = nextNode;
                    cur.next = nextNode.next;
                    remNode.next = null;
                } else cur = cur.next;
            }
            return dummyHead.next;
        }
    }
}
