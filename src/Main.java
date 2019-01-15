public class Main {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    /**
     * 通过数组创建链表
     */
    private static ListNode createdLinkedList(int[] arr) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }

        return head;
    }

    private static void soutLinkedList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.printf("%d -> ", cur.val);
        }
        System.out.printf("NULL");
    }

    public static void main(String[] args) {
        System.out.println(0x10-0x09);
    }
}
