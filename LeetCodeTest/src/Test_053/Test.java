package Test_053;

/**
 * @Author-- Skipper
 */
public class Test {
    public static void main(String[]args){
        Solution s = new Solution();
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int res = s.maxSubArray(a);
        System.out.println(res);
    }

}
