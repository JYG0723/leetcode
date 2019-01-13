package HashTable.leetcode_220;

import java.util.TreeSet;

/**
 * @author Ji YongGuang.
 * @date 20:37 2019/1/11.
 * @description
 */
public class LeetCode_220 {
    class Solution {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            TreeSet<Long> sets = new TreeSet<>();

            for (int i = 0; i < nums.length; i++) {
                long num = nums[i];
                Long floor = sets.floor(num + t);// 最接近该值的，小于该值的值
                Long ceil = sets.ceiling(num - t);// 最接近该值，大于该值的值

                if (floor != null && floor >= nums[i] || ceil != null && ceil <= nums[i]) {
                    return true;
                }

                sets.add(num);
                if (sets.size() == k + 1) {//  i 和 j 之间的差的绝对值最大为 ķ
                    sets.remove((long) nums[i - k]);
                }
            }
            return false;
        }
    }
}
