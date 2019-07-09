package Test_003;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

/**
 * @Author-- Skipper
 */
public class Solution {
    public int lengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s,i,j))ans = Math.max(ans ,j-i);
            }
        }
        return ans;
    }

    private boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (set.contains(character)) return false;
            set.add(character);
        }
        return true;
//        int len = s.length();
//        int ans = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < len; j++) {
//                if (allUnique(s,i,j)) ans = Math.max(ans,j - i);
//            }
//        }
//        return ans;
//    }
//    public boolean allUnique(String s, int start,int end ){
//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            Character character = s.charAt(i);
//            if (set.contains(character)) return false;
//            set.add(character)
//        }
//        return true;
    }

}
