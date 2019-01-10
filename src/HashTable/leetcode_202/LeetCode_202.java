package HashTable.leetcode_202;

import java.util.HashMap;

/**
 * @author Ji YongGuang.
 * @date 19:15 2019/1/9.
 * @description HashMap
 */
public class LeetCode_202 {
    static class Solution {
        public boolean isHappy(int n) {
            String s = "" + n;
            int sum = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

            while (sum != 1) {
                sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    int item = Integer.parseInt(s.charAt(i) + "");
                    sum += item * item;
                }

                if (!map.containsKey(sum)) {
                    map.put(sum, 1);
                } else {
                    return false;
                }

                s = "" + sum;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(12));
    }
}
