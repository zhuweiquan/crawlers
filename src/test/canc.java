import java.util.*;
public class canc {
    public static void main(String[] args) {

        long n = 1000000;
        long be = 1L;
        for (int i = 1; i <= n; i++){
            be = lcm(i, be);
        }
        long last = n + 1;
        long j = 1;

        while (true){
            long lcm1 = lcm(last, be);
            long lcm2 = lcm(last,j);
//            System.out.println(lcm1 + "," + lcm2);
            if(lcm1 == lcm2){
                break;
            }
            be = lcm1;
            j = lcm2;
            last += 1;
        }
        System.out.println(last);

    }

    private static long lcm(long a, long b){
        long u= a*b;
        long c = a;
        long d = b;
        while(b>0){
            if(a>=b&&a%b!=0){
                long t = b;
                b = a%b;
                a = t;
            }else if(a%b==0){
                break;
            }else{
                long  s = a;
                a = b;
                b = s;
            }
        }
        return u/b;
    }
}
