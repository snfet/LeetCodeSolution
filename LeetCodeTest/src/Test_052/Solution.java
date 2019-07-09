package Test_052;

/**
 * @Author-- Skipper
 */
class Solution {

    /**
     * 记录某列是否已有皇后摆放
     */
    private boolean col[];

    /**
     * 补充说明： x和y分别是横纵坐标， n是已经摆放好的棋子的数目
     *
     * 记录某条正对角线（左上右下）是否已有皇后摆放（某条对角线对应的摆放位置为 x - y + n - 1）
     * 即对应某条（左上右下）对角线
     */
    private boolean dia1[];

    /**
     * 记录某条斜对角线（左下右上）是否已有皇后摆放（某条对角线对应的摆放位置为 x + y）
     */
    private boolean dia2[];

    public int totalNQueens(int n) {
        // 依然可以使用 51 号问题的解决思路，但问题是有没有更好的方法
        // 这里默认col[],dial[],dia2[]的值都是false
        col = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];
        return putQueen(n, 0);//其中，n是我们还没有摆放的皇后数量，0是我们已经摆放完的数量
    }

    /**
     * 递归回溯方式摆放皇后
     *
     * @param n     待摆放皇后个数
     * @param index 已摆放皇后个数
     */
    private int putQueen(int n, int index) {
        int res = 0;//输出结果 res
        if (index == n) {
            return 1;//如果待摆放的皇后 = 已经摆放的皇后，表示成功摆放完，返回这1种可能性。
        }
        // 表示在 index 行的第 i 列尝试摆放皇后
        for (int i = 0; i < n; i++) {
            if (!col[i] && !dia1[i - index + n - 1] && !dia2[i + index]) {
                // 递归
                col[i] = true;
                dia1[i - index + n - 1] = true;
                dia2[i + index] = true;
                res += putQueen(n, index + 1);//递归入口
                // 回溯
                //如果对之前的进行回溯
                col[i] = false;
                dia1[i - index + n - 1] = false;
                dia2[i + index] = false;
            }
        }
        return res;
    }

}