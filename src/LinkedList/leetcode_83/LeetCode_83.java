package LinkedList.leetcode_83;

/**
 * @author Ji YongGuang.
 * @date 20:17 2019/1/13.
 * @description
 */
public class LeetCode_83 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = head;
            while (cur != null && cur.next != null) {
                ListNode nextNode = cur.next;

                if (nextNode.val == cur.val) {// cur节点的next节点更新了，继续判断
                    ListNode remNode = nextNode;
                    cur.next = nextNode.next;
                    remNode = null;
                } else {
                    cur = cur.next;
                }
            }
            return head;
        }
    }
}
