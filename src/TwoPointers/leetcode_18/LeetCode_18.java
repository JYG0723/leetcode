package TwoPointers.leetcode_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 14:26 2019/1/11.
 * @description
 */
public class LeetCode_18 {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> lists = new ArrayList<>();

            for (int i = 0; i < nums.length - 3; i++) {
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {// 去重
                    int tar = target - nums[i];// 3数和为tar

                    for (int j = i + 1; j < nums.length - 2; j++) {
                        if (j == i + 1 || (j > 0 && nums[j] != nums[j - 1])) {

                            int sum = tar - nums[j];
                            int l = j + 1, r = nums.length - 1;
                            while (l < r) {// [l...r]
                                if (nums[l] + nums[r] == sum) {
                                    lists.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                                    while (l < r && nums[l + 1] == nums[l]) l++;
                                    while (l < r && nums[r - 1] == nums[r]) r--;

                                    l++;
                                    r--;
                                } else if (nums[l] + nums[r] > sum) r--;
                                else l++;
                            }
                        }
                    }
                }
            }
            return lists;
        }
    }
}
