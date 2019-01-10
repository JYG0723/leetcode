package Array.leetcode_215;

import java.util.PriorityQueue;

/**
 * @author Ji YongGuang.
 * @date 16:29 2018/12/13.
 * @description 数组中的第K个最大元素
 */
public class LeetCode_215_2 {

    /*
        思路: priorityQueue中只存储K个元素，多余的元素入队时从队列头删除一个元素，
            由于Java priorityQueue的特性，是小顶堆，所以一直在有小元素出队，所以最后遍历完之后队列中只有K个元素，
            而且是最大的K个。
            而堆顶的就是第K个大的元素，因为其左右孩子都大于它
     */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();// 小顶堆
        for (int item : nums) {
            queue.add(item);
            if (queue.size() > k) {
                queue.remove();
            }
        }
        return queue.remove();
    }

    public static void main(String[] args) {
        LeetCode_215_2 leetCode_215 = new LeetCode_215_2();
        int[] testArr = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int kthLargest = leetCode_215.findKthLargest(testArr, 4);
        System.out.println(kthLargest);
    }
}
