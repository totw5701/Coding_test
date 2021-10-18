package test.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 최대공약수_최소공배수 {

    public static int[] basic(int n, int m){

        List<Integer> nDivisor = divisor(n);
        List<Integer> mDivisor = divisor(m);
        int cDivisor = 0;
        for(int i = nDivisor.size()-1 ; i > -1; i--){
            if(mDivisor.contains(nDivisor.get(i))){
                cDivisor = nDivisor.get(i);
                break;
            }
        }

        int cMultiple = 0;
        for(int i = Math.max(n,m); i <= m*n; i++){
            if(i % m == 0 && i % n == 0){
                cMultiple = i;
                break;
            }
        }
        return new int[]{cDivisor, cMultiple};
    }

    public static List<Integer> divisor(int n){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        list.add(n);
        System.out.println("list = " + list);
        return list;
    }

    public static int[] basicV2(int n, int m){

        int cDivisor = 0;
        int cMultiple = 0;

        for(int i = 1; i <= Math.max(n,m)/2; i++){
            if(n % i == 0 && m % i ==0){
                cDivisor = i;
            }
        }

        for(int i = Math.max(n,m); i <= m*n; i++){
            if(i % m == 0 && i % n == 0){
                cMultiple = i;
                break;
            }
        }
        return new int[]{cDivisor, cMultiple};
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int[] basic = basic(n, m);
        System.out.println("basic = " + Arrays.toString(basic));

    }
}
