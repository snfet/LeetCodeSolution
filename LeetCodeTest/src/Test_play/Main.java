package Test_play;

import java.util.*;
/**
 * @Author-- Skipper
 */
public class Main{
    public static void main(String[] args){
        int a,b,c,d,h,m;
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        b = sca.nextInt();
        c = sca.nextInt();
        d = sca.nextInt();
        h = c-a;
        if (b>d) {
            m = 60-(b - d);
        }else {
            m = d - b;
        }
        System.out.print(h+" "+m);
    }
}