package HashTable.leetcode_219;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ji YongGuang.
 * @date 18:11 2019/1/11.
 * @description 存在重复元素 II
 * 滑动窗口 + 哈希表
 */
public class LeetCode_219 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {// 找到相等元素
                    return true;
                }

                set.add(nums[i]);
                if (set.size() == k + 1) {
                    set.remove(nums[i - k]);
                }
            }
            return false;
        }
    }

}
