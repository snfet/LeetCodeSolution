package Test_213;

/**
 * @Author-- Skipper
 */

/**
 * 执行用时 : 1 ms, 在House Robber II的Java提交中击败了99.10% 的用户
 * 内存消耗 : 33.1 MB, 在House Robber II的Java提交中击败了99.77% 的用户
 */
public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n == 0 ? 0 : n == 2 ? Math.max(nums[0],nums[1]):nums[0];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n - 1; i++)
            dp1[i] = Math.max(nums[i] + dp1[i - 2], dp1[i - 1]);
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1], nums[2]);
        for (int i = 3; i < n; i++)
            dp2[i] = Math.max(nums[i] + dp2[i - 2], dp2[i - 1]);
        return Math.max(dp1[n - 2], dp2[n - 1]);
    }

}
