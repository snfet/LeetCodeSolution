package Test_020;

/**
 * @Author-- Skipper
 */
public class Test {
    public static void main(String[] args){
        Solution solution = new Solution();
        boolean answer = solution.isValid("()");
        System.out.println(answer);

        Answer answer1 = new Answer();
        boolean fuckyou = answer1.isValid("()");
        System.out.println(fuckyou);
    }

}
