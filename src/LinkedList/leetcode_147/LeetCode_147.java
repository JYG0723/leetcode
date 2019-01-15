package LinkedList.leetcode_147;

/**
 * @author Ji YongGuang.
 * @date 20:16 2019/1/14.
 * @description 对链表进行插入排序
 */
public class LeetCode_147 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {// 对链表进行插入排序，相当于检索到链表的合适插入点插入即可。
        public ListNode insertionSortList(ListNode head) {// time: 0(n^2) space:O(1)
            ListNode dummy = new ListNode(0);// dummy后跟的是 已经有序的数据序列
            ListNode d = null;
            ListNode cur = head;

            while (cur != null) {

                d = dummy;
                while (d.next != null && cur.val > d.next.val) {// 退出时d.val < cur.val < d.next.val
                    d = d.next;
                }

                // 将cur插入到有序数列dummy中
                ListNode dNext = d.next;
                d.next = cur;
                ListNode nextHead = cur.next;
                cur.next = dNext;
                // 下一个节点
                cur = nextHead;
            }
            return dummy.next;
        }
    }
}
