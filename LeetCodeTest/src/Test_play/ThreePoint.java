package Test_play;

/**
 * @Author-- Skipper  丑数II
 */
public class ThreePoint {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int index2 = 0,index3 = 0,index5 = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(dp[index2]*2,Math.min(dp[index3]*3,dp[index5]));
            if (min == dp[index2]*2)index2++;
            if (min == dp[index3]*3)index3++;
            if (min == dp[index5]*5)index5++;
            dp[i]=min;
        }
        return dp[n-1];
    }
}
