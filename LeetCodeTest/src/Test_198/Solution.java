package Test_198;

/**
 * @Author-- Skipper
 */
public class Solution {
    public int rob(int[] nums) {
        int profit = 0;
        int maxProfit = 0;
        if (nums.length <= 2) {
            for (int i = 0; i < nums.length; i++) {
                if (profit < nums[i]) {
                    profit = nums[i];
                }
            }
        }
        int n = 0;
        while (n <= nums.length - 4) {
            if (nums.length - n < 2) {
                maxProfit += Math.max(nums[0], nums[1]);
                break;
            }
            if (nums[n] + nums[n + 2] > nums[n + 1] + nums[n + 3]) {
                maxProfit += nums[n] + nums[2];
                n += 4;
            } else {
                n++;
            }
        }
        return maxProfit;
    }
}

