package Test_263;

/**
 * @Author-- Skipper
 * 执行用时 :
 * 6 ms
 * , 在所有 Java 提交中击败了
 * 58.51%
 * 的用户
 * 内存消耗 :
 * 34.5 MB
 * , 在所有 Java 提交中击败了
 * 12.26%
 * 的用户
 */
public class Solution {
    public boolean isUgly(int num){
        while (num != 1){
            if (num%2==0)num/=2;
            else if (num%3==0)num/=3;
            else if (num%5==0)num/=5;
            else return false;
        }
        return true;
    }
}
