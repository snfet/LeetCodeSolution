package Test_374;

/**
 * @Author-- Skipper
 */
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0,right = n,mid = 0;
        if (guess(n) == 0) return n;
        while (left < right){
            mid = left + (right - left)/2;
            if (guess(mid) == -1) right = mid - 1;
            else if(guess(mid) == 1) left = mid + 1;
            else return mid;
        }
        return left;
    }
}