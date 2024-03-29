package Test_play;

import org.w3c.dom.css.CSSFontFaceRule;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * @Author-- Skipper
 */
public class Test_01 {
    public static void main(String[] args) throws IllegalAccessException {
        int[] sums = {1,2,4,6,7};
        int[] answer = toSum(sums,5);
        for (int i = 0; i < sums.length; i++) {
            System.out.print(" "+answer[i]);
        }
        System.out.println(answer.toString());
    }

//    //方法二：两遍哈希表
//    //为了对运行时间复杂度进行优化，我们需要一种更有效的方法来检查数组中是否存在目标元素。如果存在，我们需要找出它的索引。保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表。
//    //
//    //通过以空间换取速度的方式，我们可以将查找时间从 O(n)O(n) 降低到 O(1)O(1)。哈希表正是为此目的而构建的，它支持以 近似 恒定的时间进行快速查找。我用“近似”来描述，是因为一旦出现冲突，查找用时可能会退化到 O(n)O(n)。但只要你仔细地挑选哈希函数，在哈希表中进行查找的用时应当被摊销为 O(1)O(1)。
//    //
//    //一个简单的实现使用了两次迭代。在第一次迭代中，我们将每个元素的值和它的索引添加到表中。然后，在第二次迭代中，我们将检查每个元素所对应的目标元素（target - nums[i]target−nums[i]）是否存在于表中。注意，该目标元素不能是 nums[i]nums[i] 本身！
//    private static int[] toSum(int[] sums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < sums.length; i++) {
//            map.put(sums[i],i);
//        }
//        for (int i = 0; i < sums.length; i++) {
//            int complement = target - sums[i];
//            if (map.containsKey(complement) && map.get(complement) != i){
//                return new int[] {i,map.get(complement)};
//            }
//        }
//        throw new IllegalArgumentException("no the two number");
//    }

//    //1,暴力法
//    public static int[] toSum(int[] nums, int target) throws IllegalAccessException {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                if(nums[j] == target - nums[i]){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        throw new IllegalAccessException("不存在two sum solution");
//    }

    //方法三：一遍哈希表 best
    public static int[] toSum(int[] sums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < sums.length; i++) {
            int complement = target - sums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(sums[i],i);
        }
        throw new IllegalArgumentException("no the two number");
    }
}
