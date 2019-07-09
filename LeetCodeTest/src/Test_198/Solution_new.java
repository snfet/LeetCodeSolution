package Test_198;

/**
 * @Author-- Skipper
 */

/*
执行用时 : 1 ms, 在House Robber的Java提交中击败了99.00% 的用户
内存消耗 : 33.9 MB, 在House Robber的Java提交中击败了90.81% 的用户
 */
public class Solution_new {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n == 0 ? 0 : nums[0];
        int[] arr = new int[n];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++)
            arr[i] = Math.max(arr[i - 1], nums[i] + arr[i - 2]);
        return arr[n - 1];
    }
}
