package Test_102;

/**
 * @Author-- Skipper
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 执行结果：通过
 * 显示详情
 * 执行用时 :2 ms, 在所有 Java 提交中击败了91.91%的用户
 * 内存消耗 :37 MB, 在所有 Java 提交中击败了43.29%的用户
 */
/*
    创建一个新的LinkedList来对TreeNode 进行操作
    然后利用poll函数的特性：“获得并删除第一个元素（表头），如果为空，则获得的是null”
    将左边不为空的元素left优先插入queue队列中，实现从左到右遍历列表
 */
class TreeNode {
    int val;
    TreeNode left;
   TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while(count > 0){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)queue.add(node.left);
                if (node.right != null)queue.add(node.right);
                count--;
            }
            res.add(list);
        }
        return res;
    }
}
