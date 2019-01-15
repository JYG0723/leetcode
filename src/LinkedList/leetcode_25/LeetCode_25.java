package LinkedList.leetcode_25;

/**
 * @author Ji YongGuang.
 * @date 19:18 2019/1/14.
 * @description k个一组翻转链表
 */
public class LeetCode_25 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode d = dummy;

            ListNode subHead = head;
            ListNode cur = subHead;
            while (subHead != null) {
                int i = k;
                while (i - 1 > 0) {// 找该子链表的最后一位节点
                    cur = cur.next;
                    if (cur == null) {
                        return dummy.next;
                    }
                    i--;
                }

                // 切断当前子链表和后续子链表的连接
                ListNode temp = cur.next;
                cur.next = null;

                // 反转当前子链表
                ListNode nowHead = reverseListNode(subHead);
                d.next = nowHead;
                d = subHead;

                subHead = temp;
                cur = subHead;

                // 将后续子链表与当前处理完的子链表再接上。当成一个新链表去继续下次处理
                d.next = subHead;
            }
            return dummy.next;
        }

        private ListNode reverseListNode(ListNode head) {
            ListNode cur = null;

            while (head != null) {
                ListNode nextNode = head.next;
                head.next = cur;

                cur = head;
                head = nextNode;
            }
            return cur;
        }
    }
}
