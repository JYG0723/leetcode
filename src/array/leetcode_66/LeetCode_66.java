package array.leetcode_66;

/**
 * @author Ji YongGuang.
 * @date 15:59 2018/11/27.
 * @description
 */
public class LeetCode_66 {

    public int[] plusOne(int[] digits) {

        int len = digits.length;
        int flag = 0;

        int[] res = new int[len + 1];

        for (int i = 0; i < len; i++) {
            res[i + 1] = digits[i];
        }

        len = res.length;

        for (int i = len - 1; i >= 0; i--) {
            if (!(flag > 0)) { // 这个1还没处理完
                if (res[i] < 9) {// 当前元素小于9 放心++
                    res[i]++;
                    flag++;
                    break;
                } else {// 当前元素=9
                    res[i] = 0;
                    flag--;
                }
            } else break;
        }

        if (res[0] == 0) {
            System.arraycopy(res, 1, digits, 0, res.length - 1);
            return digits;
        }

        return res;
    }

    public static void main(String[] args) {
        LeetCode_66 leetCode_66 = new LeetCode_66();
        int[] testArr = new int[]{9,9,9};
        int[] res = leetCode_66.plusOne(testArr);

        System.out.printf("[");
        for (int i = 0; i < res.length; i++) {
            System.out.printf("%d", res[i]);
            if (i != res.length - 1)
                System.out.printf(",");
        }
        System.out.printf("]");
    }
}
