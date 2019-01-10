package HashTable.leetcode_202;

import java.util.HashSet;

/**
 * @author Ji YongGuang.
 * @date 19:26 2019/1/9.
 * @description HashSet
 */
public class LeetCode_202_2 {
    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> hashSet = new HashSet<>();

            while (hashSet.add(n)) {// hashSet中有即为false，没有即为true
                int sum = 0;
                while (n > 0) {// 逐位求和 低到高
                    int mul = n % 10;
                    sum += mul * mul;
                    n /= 10;
                }

                if (sum == 1)
                    return true;
                n = sum;
            }
            return false;
        }
    }
}
