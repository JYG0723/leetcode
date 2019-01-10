package Array.leetcode_771;

/**
 * @author Ji YongGuang.
 * @date 9:58 2018/11/21.
 * @description
 */
public class Leetcode_771 {

    public int numJewelsInStones(String J, String S) {
        if (J.length() == 0 || J.length() > 50 || S.length() == 0 || S.length() > 50) {
            return 0;
        }

        int[] chars = new int[58];
        for (char c : J.toCharArray()) {
            chars[c - 'A']++;
        }

        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (chars[S.charAt(i) - 'A'] > 0) {
                result++;
            }
        }

        return result;
    }

}
