package Test_070;

/**
 * @Author-- Skipper
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("dynamic programming:\n" + s.climbStairs_dynamicProgramming(10));
        System.out.println("动态规划:\n" + s.climbStairs(10));
    }

}
