package LinkedList.leetcode_82;

/**
 * @author Ji YongGuang.
 * @date 14:58 2019/1/14.
 * @description 删除排序链表中的重复元素 II
 */
public class LeetCode_82 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(0);

            ListNode d = dummy;
            while (head != null) {
                if (head.next != null && head.next.val == head.val) { // 如果后续元素和当前元素相等
                    while (head.next != null && head.next.val == head.val) {// 最终head定位到重复元素的最后一个
                        head = head.next;
                    }
                } else {// 该head节点的后续节点没有和其重复
                    d.next = head;// 最后记得清尾
                    d = d.next;
                }
                head = head.next;
            }
            d.next = null;// 清尾
            return dummy.next;
        }
    }
}
