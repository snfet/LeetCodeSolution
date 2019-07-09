package Test_070;

/**
 * @Author-- Skipper
 */
class Solution {
    public int climbStairs_dynamicProgramming(int n) {
//    dynamic programming  递归
        if (n < 1) {
            return 0;
        }
        if (n < 2){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return climbStairs_dynamicProgramming(n - 1) + climbStairs_dynamicProgramming(n - 2);
    }
//    备忘录算法
    //略略略略

//最优算法，动态规划
    public int climbStairs(int n) {
        if (n < 1) {
            return 0;
        }
        if (n < 2){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int step = 0,a = 1,b = 2;
        for (int i = 3; i <= n; i++) {
            step = a + b;
            a = b;
            b = step;
        }
        return step;
    }
}