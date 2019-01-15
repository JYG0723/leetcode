package LinkedList.leetcode_445;

import java.util.Stack;

/**
 * @author Ji YongGuang.
 * @date 12:43 2019/1/14.
 * @description 两数相加 II
 */
public class LeetCode_445 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            Stack<Integer> stackL1 = new Stack<>();
            Stack<Integer> stackL2 = new Stack<>();

            ListNode t1 = l1;
            ListNode t2 = l2;
            while (t1 != null) {// 栈从栈顶到栈底，分别是原数低位到高位
                stackL1.push(t1.val);
                t1 = t1.next;
            }
            while (t2 != null) {
                stackL2.push(t2.val);
                t2 = t2.next;
            }

            Stack<Integer> res = new Stack<>();// 栈从栈顶到栈底，分别是两序列总和的从高到低位 7807
            int r = 0;// 该位总数
            while (!stackL1.isEmpty() || !stackL2.isEmpty() || r != 0) {// 没有都empty
                int val1 = stackL1.isEmpty() == true ? 0 : stackL1.pop();
                int val2 = stackL2.isEmpty() == true ? 0 : stackL2.pop();
                r += val1 + val2;

                res.push(r % 10);
                r /= 10;
            }

            ListNode dummyHead = new ListNode(0);
            ListNode cur = dummyHead;
            while (!res.isEmpty()) {
                cur.next = new ListNode(res.pop());
                cur = cur.next;
            }
            return dummyHead.next;
        }
    }
}
