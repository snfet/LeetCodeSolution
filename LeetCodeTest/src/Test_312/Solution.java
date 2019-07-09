package Test_312;

/**
 * @Author-- Skipper       难
 * 有 n 个气球，编号为0 到 n-1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
 * 现在要求你戳破所有的气球。每当你戳破一个气球 i 时，你可以获得 nums[left] * nums[i] * nums[right] 个硬币。
 * 这里的 left 和 right 代表和 i 相邻的两个气球的序号。
 * 注意当你戳破了气球 i 后，气球 left 和气球 right 就变成了相邻的气球。
 * 求所能获得硬币的最大数量。
 *
 */
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] tmps = new int[n + 2];
        tmps[0] = 1;//tmps数组两边赋值为1
        tmps[n + 1] = 1;
        System.arraycopy(nums, 0, tmps, 1, n);
        nums = tmps;
        int[][] dp = new int[n + 2][n + 2];
        for (int len = 1; len <= n; len++) {
            for (int i = 1; i <= n - len + 1; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++)
                    dp[i][j] = Math.max(dp[i][j], dp[i][k - 1] + dp[k + 1][j] + nums[i - 1] * nums[k] * nums[j + 1]);
            }
        }
        return dp[1][n];
    }
}