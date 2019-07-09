package Test_078;

import java.util.List;

/**
 * @Author-- Skipper
 */
public class Test {
    public static void main(String[]args){
        Solution solution=  new Solution();
        List<List<Integer>> ans = solution.subsets(new int[]{1, 2, 3});
        System.out.println(ans);
    }

}
