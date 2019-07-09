package Test_121_L1_BestSellTicketsTime;

/**
 * @Author-- Skipper
 */

//                        暴力遍历
//public class Solution {
//    public int maxProfit(int[] prices) {
//        int maxprofit = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int profit = prices[j] - prices[i];
//                if (profit > maxprofit){
//                    maxprofit = profit;
//                }
//
//            }
//        }
//        return maxprofit;
//    }
//}
//                        一次遍历   2ms 95%  , 36MB  98%
public class Solution{
    public int maxProfit(int[] prices){
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice){
                minprice = prices[i];
            }else if (prices[i] - minprice > maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}