package Test_1025;

/**
 * @Author-- Skipper
 */
class Solution {
    public boolean divisorGame(int N) {
        int num = 1;
        for (int x = N - 1; x > 0 ; x--) {
            if (N % x == 0){
                num++;
                x = N - x;
            }
        }
        if (num % 2 == 0)return true;
        else return false;
    }
}