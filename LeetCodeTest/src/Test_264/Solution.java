package Test_264;

/**
 * @Author-- Skipper   三指针方法*****
 * 执行用时 :
 * 10 ms
 * , 在所有 Java 提交中击败了
 * 74.53%
 * 的用户
 * 内存消耗 :
 * 35.3 MB
 * , 在所有 Java 提交中击败了
 * 28.83%
 * 的用户
 */
class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
            if (min == dp[i2] * 2)
                i2++;
            if (min == dp[i3] * 3)
                i3++;
            if (min == dp[i5] * 5)
                i5++;
            dp[i] = min;
        }

        return dp[n - 1];
    }
}