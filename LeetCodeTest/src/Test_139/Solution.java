package Test_139;

import java.util.List;

/**
 * @Author-- Skipper
 */
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] flags = new boolean[n + 1];
        flags[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (flags[j] && wordDict.contains(s.substring(j, i))) {
                    flags[i] = true;
                    break;
                }
            }
        }
        return flags[n];
    }
}