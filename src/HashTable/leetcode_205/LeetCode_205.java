package HashTable.leetcode_205;

/**
 * @author Ji YongGuang.
 * @date 21:18 2019/1/9.
 * @description 同构字符串
 */
public class LeetCode_205 {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length())
                return false;

            int[] arrS = new int[256];
            int[] arrT = new int[256];

            for (int i = 0; i < t.length(); i++) {
                char sc = s.charAt(i);
                char tc = t.charAt(i);
                if (arrS[sc] != arrT[tc])
                    return false;
                // 初次进来，两字符串首先遍历到的元素挂上关系，初始都为0
                // 字符匹配标记，即两个字符的arrS,arrT对应值一样。
                arrS[sc] = i + 1;
                arrT[tc] = i + 1;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isIsomorphic("egg", "add"));
    }
}
