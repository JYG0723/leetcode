package HashTable.leetcode_454;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ji YongGuang.
 * @date 16:52 2019/1/11.
 * @description 四数相加 II
 * 时间复杂度: O(n^2)
 * 空间复杂度: O(n^2)
 */
public class LeetCode_454 {
    class Solution {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

            Map<Integer, Integer> maps = new HashMap<>();
            for (int i = 0; i < C.length; i++) {// 记录C，D数组所有元素和的可能性
                for (int j = 0; j < D.length; j++) {
                    int twoSum = C[i] + D[j];
                    maps.put(twoSum, maps.getOrDefault(twoSum, 0) + 1);
                }
            }

            int res = 0;
            for (int i = 0; i < A.length; i++) {// 迭代A，B数组和去匹配C,D和的可能性。
                for (int j = 0; j < B.length; j++) {
                    int target = -A[i] - B[j];
                    if (maps.containsKey(target)) {
                        res += maps.get(target);
                    }
                }
            }
            return res;
        }
    }
}
