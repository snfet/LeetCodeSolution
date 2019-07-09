package Test_122;

/**
 * @Author-- Skipper
 */


//                  一遍遍历
//执行用时 : 2 ms, 在Best Time to Buy and Sell Stock II的Java提交中击败了90.34% 的用户
//内存消耗 : 37.3 MB, 在Best Time to Buy and Sell Stock II的Java提交中击败了69.72% 的用户
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxprofit += prices[i] - prices[i-1];
            }
        }

        return maxprofit;
    }
}