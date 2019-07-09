package Test_020;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author-- Skipper
 */
class Solution {
    private HashMap<Character,Character> hashMap;
    public Solution(){
        this.hashMap = new HashMap<>();
        this.hashMap.put('(',')');
        this.hashMap.put('[',']');
        this.hashMap.put('{','}');
        this.hashMap.put('<','>');
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.hashMap.containsKey(c)){
                char topEle = stack.empty()?'#':stack.pop();
                if (topEle != this.hashMap.get(c)){
                    return false;
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }
}
