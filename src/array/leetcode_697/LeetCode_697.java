package leetcode.leetcode_697;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ji YongGuang.
 * @date 10:35 2018/11/27.
 * @description 数组的度
 * <p>
 * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 */
public class LeetCode_697 {

    /**
     * 输入: [1, 2, 2, 3, 1]
     * 输出: 2
     * 解释:
     * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
     * 连续子数组里面拥有相同度的有如下所示:
     * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
     * 最短连续子数组[2, 2]的长度为2，所以返回2.
     * <p>
     * 输入: [1,2,2,3,1,4,2]
     * 输出: 6
     */
    public int findShortestSubArray(int[] nums) {

        int len = nums.length;
        Map<Integer, Integer> count = new HashMap<>(len);
        Map<Integer, Integer> pos = new HashMap<>();

        int maxCount = 0;
        int length = len;
        for (int i = 0; i < len; i++) {// 2,1,1,2,1,3,3,3,1,3,1,3,2

            int c = count.getOrDefault(nums[i], 0) + 1;
            count.put(nums[i], c);

            if (!pos.containsKey(nums[i])) {
                // 跟踪第一次出现的元素的 首次出现的数组下标
                pos.put(nums[i], i);
            }

            if (c > maxCount) {
                maxCount = c;
                length = i - pos.get(nums[i]) + 1;
            } else if (c == maxCount) {
                length = Math.min(i - pos.get(nums[i]) + 1, length);
            }
        }

        return length;
    }

    public static void main(String[] args) {
        LeetCode_697 leetCode_697 = new LeetCode_697();
        int[] testArr = new int[]{2, 1, 1, 2, 1, 3, 3, 3, 1, 3, 1, 3, 2};
        System.out.println(leetCode_697.findShortestSubArray(testArr));
    }
}
