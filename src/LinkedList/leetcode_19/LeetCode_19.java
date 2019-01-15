package LinkedList.leetcode_19;

/**
 * @author Ji YongGuang.
 * @date 23:50 2019/1/14.
 * @description 删除链表的倒数第N个节点
 */
public class LeetCode_19 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode cur = head;

            int count = 0;
            while (cur != null) {// 统计当前链表有多少个节点
                cur = cur.next;
                count++;
            }

            if (count == n) {
                return head.next;
            }

            int tar = count - n;// 因为是从1开始数，所以第tar个节点即为待删除节点的父节点
            ListNode step = head;
            ListNode parrent = null;

            while (tar - 1 >= 0) {
                parrent = step;
                step = step.next;
                tar--;
            }

            // step此时即为待删除节点，parrent节点是待删除节点的前驱节点
            parrent.next = step.next;
            step = null;

            return head;
        }
    }
}
