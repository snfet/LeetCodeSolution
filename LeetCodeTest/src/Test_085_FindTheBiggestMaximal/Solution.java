package Test_085_FindTheBiggestMaximal;

/**
 * @Author-- Skipper
 */
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int res = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int[][] matrixint = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            matrixint[0][i] = matrix[0][i] - 48;
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '0') {
                    matrixint[i][j] = 0;
                } else {
                    matrixint[i][j] = matrixint[i-1][j] + 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrixint[i][j] > 0){
                    int left = j - 1;
                    int right = j + 1;
                    int wide = 1;
                    while (left >= 0 && matrixint[i][left] >= matrixint[i][j]){
                        left--;
                        wide++;
                    }
                    while (right < matrixint[0].length && matrixint[i][right] >= matrixint[i][j]){
                        right++;
                        wide++;
                    }
                    int area = matrixint[i][j] * wide;
                    if (area > res){
                        res = area;
                    }

                }
            }
        }
        return res;
    }
}
//class Solution {
//    public int maximalRectangle(char[][] matrix) {
//        int res = 0;
//        if(matrix==null||matrix.length==0||matrix[0].length==0){
//            return res;
//        }
//        //用于存放最当前的高
//        int[][] matrixint = new int[matrix.length][matrix[0].length];
//        //第一层的高度是当前的数字最高为1
//        for (int i = 0; i < matrix[0].length; i++) {
//            matrixint[0][i] = matrix[0][i] - 48;
//        }
//        //循环所有一行一行的向下来计算每行的高度（一行一行的截取矩形的高度）
//        for (int i = 1; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                //如果为零说明断开不能与上一层相连
//                if (matrix[i][j] == '0') {
//                    matrixint[i][j] = 0;
//                } else {
//                    //不为零则进行计算加上本身的1
//                    matrixint[i][j] = matrixint[i - 1][j] + 1;
//                }
//            }
//        }
//        // 每一行都可以看做是一个底 一行一行的进行算面积（知道高了找到相应最大的宽就好了）
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                //大于零的高有意义
//                if (matrixint[i][j] > 0) {
//                    //定义两个指针进行搜索宽
//                    int left = j - 1;//以原点的左边一个点为left指针
//                    int right = j + 1;//以原点的右边一个点为right指针
//                    int wide = 1;//宽度为1
//                    //搜索每一个高比当前中间这个高的值（向左可以组成矩形）
//                    while (left >= 0 && matrixint[i][left] >= matrixint[i][j]) {//左边大于零 && 左边一列的值大于[i][j]里的即可以继续左移动
//                        left--;
//                        wide++;
//                    }
//                    //right小于matrixint[0]的长度的原因是确保到了最后一行后角标不会越界
//                    // && 根据左边的一列的长度是否大于右边一列的长度可以判断右边这一列中是否满足条件，保证右边这一列中不会有0
//                    while (right < matrixint[0].length && matrixint[i][right] >= matrixint[i][j]) {
//                        right++;
//                        wide++;
//                    }
//                    //计算面积
//                    int air = matrixint[i][j] * wide;
//                    if (air > res) {
//                        res = air;
//                    }
//                }
//            }
//        }
//        return res;
//    }
//}