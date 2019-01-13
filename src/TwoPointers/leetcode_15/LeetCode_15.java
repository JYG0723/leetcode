package TwoPointers.leetcode_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 12:21 2019/1/11.
 * @description 三数之和
 */
public class LeetCode_15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] num) {
            Arrays.sort(num);
            List<List<Integer>> lists = new ArrayList<>();

            for (int i = 0; i < num.length - 2; i++) {
                if (i == 0 || (i > 0 && num[i] != num[i - 1])) {// 排过序了
                    int target = -num[i];
                    int l = i + 1, r = num.length - 1;
                    while (l < r) {
                        if (num[l] + num[r] == target) {
                            lists.add(Arrays.asList(num[i], num[l], num[r]));
                            // 我这趟操作完了，如果我后续元素和我一样。我善后，让他们到正确位置
                            while (l < r && num[l + 1] == num[l]) l++;
                            while (l < r && num[r - 1] == num[r]) r--;
                            l++;
                            r--;
                        } else if (num[l] + num[r] > target)
                            r--;
                        else l++;
                    }
                }
            }
            return lists;
        }
    }
}
