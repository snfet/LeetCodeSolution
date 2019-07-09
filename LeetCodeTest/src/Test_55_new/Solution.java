package Test_55_new;

/**
 * @Author-- Skipper
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        int len = nums.length;
        for (int i = 0; i <= max && i < len; i++) {
            if (nums[i] + i > max)
                max = nums[i] + i;
        }
        return max >= len - 1;
    }
}
