package LinkedList.leetcode_2;

/**
 * @author Ji YongGuang.
 * @date 12:36 2019/1/14.
 * @description 两数相加
 */
public class LeetCode_2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode res = new ListNode(0);
            ListNode t1 = l1, t2 = l2, t = res;
            int r = 0;

            while (t1 != null || t2 != null || r != 0) {// 谁为null都能运算
                int var1 = t1 == null ? 0 : t1.val;
                int var2 = t2 == null ? 0 : t2.val;
                r += var1 + var2;// r代表本位的总数
                t.next = new ListNode(r % 10);
                r /= 10;// 进位
                t = t.next;

                if (t1 != null) t1 = t1.next;// 如果本轮不为null则代表该字符串可继续计算
                if (t2 != null) t2 = t2.next;
            }
            return res.next;
        }
    }
}
