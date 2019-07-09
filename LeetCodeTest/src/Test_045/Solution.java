package Test_045;

/**
 * @Author-- Skipper
 */
class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1)return 0;
        int reach = 0,nextreach = nums[0],step = 0;
        for (int i = 0; i < nums.length; i++){
            nextreach = Math.max(nums[i]+i,nextreach);
            if (nextreach >= nums.length - 1)return ++step;
            if (i == reach){
                step++;
                reach = nextreach;
            }
        }
        return step;
    }
}