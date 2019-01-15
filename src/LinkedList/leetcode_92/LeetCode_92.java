package LinkedList.leetcode_92;

/**
 * @author Ji YongGuang.
 * @date 17:14 2019/1/13.
 * @description 反转链表 II
 */
public class LeetCode_92 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            if (head == null || head.next == null)
                return head;

            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;

            ListNode parentNode1 = null;
            ListNode curNode1 = dummyHead;
            for (int i = 0; i < m; i++) {// 移动m步即到了待反转的节点
                parentNode1 = curNode1;
                curNode1 = curNode1.next;
            }

            // 为了防止之前定位的指针 丢失目标
            ListNode parrentNode2 = parentNode1;
            ListNode curNode2 = curNode1;
            for (int i = m; i <= n; i++) {// [m...n]反转 -> [n...m]
                ListNode nextNode = curNode2.next;

                curNode2.next = parrentNode2;
                parrentNode2 = curNode2;
                curNode2 = nextNode;
            }

            parentNode1.next = parrentNode2;
            curNode1.next = curNode2;

            return dummyHead.next;
        }
    }
}
