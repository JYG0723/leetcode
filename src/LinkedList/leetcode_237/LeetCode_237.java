package LinkedList.leetcode_237;

/**
 * @author Ji YongGuang.
 * @date 23:30 2019/1/14.
 * @description 删除链表中的节点
 */
public class LeetCode_237 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void deleteNode(ListNode node) {

            if (node == null) {
                return;
            }

            ListNode cur = node;
            cur.val = cur.next.val;
            cur.next = cur.next.next;
        }
    }
}
