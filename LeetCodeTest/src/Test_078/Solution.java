package Test_078;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author-- Skipper  思路：先遍历nums数组，然后每新遍历一个元素，就添加到之前已经存在的元素中，和之前的元素组合成为新的元素
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());//添加一个空的数组到res数组中
        for (int num : nums){//开始遍历nums[]
            int len = res.size();//获得res的size，方便给sub对象给每一个原来的数组添加新的元素，成为新的数组
            for (int i = 0;i<len; i++){
                List<Integer> sub = new ArrayList<>(res.get(i));//关键！这里添加之前的元素组合成新的数组
                sub.add(num);//sub数组添加此次遍历到的元素
                res.add(sub);//将sub[]添加到res[]中
            }
        }
        return res;
    }
}