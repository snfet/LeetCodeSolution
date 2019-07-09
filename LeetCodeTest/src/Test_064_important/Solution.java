package Test_064_important;

/**
 * @Author-- Skipper
 */
class Solution {
    public int minPathSum(int[][] grid) {
        int r = grid[0].length;
        int l = grid.length;
        int[][] dis = new int[r][l];
        dis[0][0] = grid[0][0];
        for (int i = 1; i < r ; i++) {
            dis[0][i] = grid[0][i] + dis[0][i-1];
        }
        for (int i = 1; i < l; i++) {
            dis[i][0] = grid[i][0] + dis[i-1][0];
        }
        for (int i = 1; i < l; i++) {
            for (int j = 1; j < r; j++) {
                dis[i][j] = Math.min(dis[i-1][j]+grid[i][j],dis[i][j-1]+grid[i][j]);
            }
        }
        return dis[l-1][r-1];
    }
}