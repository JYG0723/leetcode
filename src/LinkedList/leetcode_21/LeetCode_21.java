package LinkedList.leetcode_21;

/**
 * @author Ji YongGuang.
 * @date 15:24 2019/1/14.
 * @description 合并两个有序链表
 */
public class LeetCode_21 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode d = dummyHead;
            ListNode t1 = l1, t2 = l2;

            while (t1 != null || t2 != null) {
                if (t1 != null && t2 != null) {// 两者都不为null，比大小
                    if (t1.val < t2.val) {
                        d.next = t1;
                        d = d.next;
                        t1 = t1.next;
                    } else { // >=
                        d.next = t2;
                        d = d.next;
                        t2 = t2.next;
                    }
                } else {// 一方为null
                    ListNode tar = t1 == null ? t2 : t1;
                    while (tar != null) {
                        d.next = tar;
                        d = d.next;
                        tar = tar.next;
                    }
                    return dummyHead.next;
                }
            }
            return dummyHead.next;
        }
    }
}
