package Test_213;

/**
 * @Author-- Skipper
 */
public class Test {
    public static void main(String[] args){
        Solution s = new Solution();
        int[] ans = new int[]{2,3,2};
        System.out.println(s.rob(ans));
        System.out.println(s.rob(new int[]{0, 0}));
    }

}
