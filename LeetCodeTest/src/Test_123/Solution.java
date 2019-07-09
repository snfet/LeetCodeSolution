package Test_123;

/**
 * @Author-- Skipper
 */

// [3,3,5,0,0,3,1,4]样例
class Solution {
    public int maxProfit(int[] prices) {
        int fstBuy = Integer.MIN_VALUE, fstSell = 0;
        int secBuy = Integer.MIN_VALUE, secSell = 0;
        for (int p: prices) {
            // -p是来判断最小的第一次买入值,并且每遍历一个元素都会刷新最小值fstBuy
            fstBuy = Math.max(fstBuy, -p);
            //fstSell是来存储第一次的利润，p除了0外，大于零的数在fstBuy中刷新后得到的是负数，即fstBuy+(-p);
            fstSell = Math.max(fstSell, fstBuy + p);
            //
            secBuy = Math.max(secBuy, fstSell - p);
            //
            secSell = Math.max(secSell, secBuy + p);
        }
        return secSell;
    }
}