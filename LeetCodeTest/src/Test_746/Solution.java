package Test_746;

/**
 * @Author-- Skipper
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len < 2){
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i-2],dp[i-1])+cost[i];
        }
        return Math.min(dp[len - 1],dp[len - 2]);
    }

}
