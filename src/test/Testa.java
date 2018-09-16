import java.lang.reflect.Array;
import java.util.Set;
import java.util.*;
public class Testa {
    public static void main(String args[]) {

        String s1 = "bcda";
        String s2 = "abcd";
        int n1 = s1.length();
        int n2 = s2.length();
        int count = n1 +  n2;
        System.out.println(n1);
        for (int i = 0; i < n2; i++){
            int j = 0;
            int k = i;
            int same = 0;
            int diff = 0;
            while (j < n1 && k < n2){
                if (s2.charAt(k) == s1.charAt(j)){
                    same += 1;
                    j += 1;
                    k += 1;
                }else{
                    diff += 1;
                    j += 1;
                }
            }
            System.out.println(same + "," + diff + "," + (n1 - same + diff));
            count = Math.min(n1 - same + diff , count);
        }

        System.out.print(count);

//        java.text.DecimalFormat df =new java.text.DecimalFormat("#.000000");
////        double a = 2.1234355467888;
////        System.out.print(df.format(a));
//        List<List<String>> l = new ArrayList<>();
//        l.add({"a","a"});
//        int[] a = new int[2];
//        a[0] = 2;
//        double c = Math.sqrt(a[0]);
//        l.add(c);
//        System.out.print(Arrays.toString(a));
//        System.out.print(l.toArray());


    }



}
