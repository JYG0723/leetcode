package leetcode.leetcode_122;

/**
 * @author Ji YongGuang.
 * @date 21:40 2018/11/25.
 * @description 买卖股票的最佳时机 II
 * <p>
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class LeetCode_122 {

    /**
     * 输入: [7,1,5,3,6,4]
     * 输出: 7
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
     * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
     * <p>
     * 输入: [1,2,3,4,5]
     * 输出: 4
     * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
     * 注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
     * 因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
     * <p>
     * 输入: [7,6,4,3,1]
     * 输出: 0
     * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
     */
    public int maxProfit(int[] prices) {

        int len = prices.length;
        int min = 0;

        int res = 0;
        for (int i = 0; i < len; i++) {
            if (prices[i] < prices[min]) {
                min = i;
            } else if (prices[i] > prices[min] && min < i) {// 防止 min>i 。
                // i是卖出的天 min是买入的天 min必须小于i
                res += prices[i] - prices[min];// 7,1,5,3,6,4
                // 暂存该卖出价格等于买入价格。方便后续计算
                min = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        LeetCode_122 leetCode_122 = new LeetCode_122();
        int[] testArr = new int[]{7,1,5,6,8,4};
        System.out.println(leetCode_122.maxProfit(testArr));
    }
}