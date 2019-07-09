package Test_play;

/**
 * @Author-- Skipper
 */
//public class DIGUI {
//    private boolean[] col;
//    private boolean[] dia1;
//    private boolean[] dia2;
//    public int totalNQueen(int n){
//        col = new boolean[n];
//        dia1 = new boolean[2*n-1];
//        dia2 = new boolean[2*n-1];
//        return putQueen(n,0);
//    }
//    private int putQueen(int n,int index){
//        int res = 0;
//        if (n == index){
//            return 1;
//        }
//        for (int i = 0; i < n ; i++){
//            if (!col[i] && !dia1[i - index + n - 1] && !dia2[i + index]){
//                col[i] = true;
//                dia1[i - index + n - 1] = true;
//                dia2[i + index] = true;
//                res += putQueen(n,index + 1);
//                col[i] = false;
//                dia1[i - index + n - 1] = false;
//                dia2[i + index] = false;
//            }
//        }
//        return res;
//    }
//    public static void main(String[] args){
//        DIGUI digui = new DIGUI();
//        System.out.println(digui.totalNQueen(4));
//    }
//
//}
public class DIGUI{
    private boolean dp1[];
    private boolean dp2[];
    private boolean col[];
    public int setDigui(int n){
        dp1 = new boolean[n * 2 + 1];
        dp2 = new boolean[n * 2 + 1];
        col = new boolean[n];
        return digui(n,0);
    }
    public int digui(int n, int index){
        int res = 0;
        if (n == index)return 1;
        for (int i = 0; i < n; i++) {
            if (!col[i] && !dp2[i + index] && !dp1[i - index + n - 1]){
                col[i] = true;
                dp2[i + index] = true;
                dp1[i - index + n - 1] = true;
                res += digui(n,index + 1);
                col[i] = false;
                dp2[i + index] = false;
                dp1[i - index + n - 1] = false;
            }
        }
        return res;

    }
    public static void main(String[] args){
        DIGUI digui = new DIGUI();
        System.out.println(digui.setDigui(8));
    }
}