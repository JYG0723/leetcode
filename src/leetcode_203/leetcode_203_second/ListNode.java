package leetcode.leetcode_203.leetcode_203_second;

/**
 * @author Ji YongGuang.
 * @date 23:34 2018/4/19.
 * Definition for singly-linked list.
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int[] e) {
        this.val = e[0];
        ListNode preNode = this;
        for (int i = 1; i < e.length; i++) {
            preNode.next = new ListNode(e[i]);
            preNode = preNode.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}
