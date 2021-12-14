package test.programmers.level2;

import java.util.Arrays;

public class N개의_최소공배수 {

    public static int solutions(int[] arr) {

        Arrays.sort(arr);

        int biggest = arr[arr.length - 1];

        long all = 1;

        for (int i : arr) {
            all *= i;
        }

        for (int i = biggest; i <= all; i++) {
            boolean flag = true;

            for (int i1 : arr) {
                if (i % i1 != 0) flag = false;
            }

            if(flag) return i;
        }

        return 1;
    }

    public static int lCMult(int n, int m) {

        int cMultiple = 0;
        for(int i = Math.max(n,m); i <= m*n; i++){
            if(i % m == 0 && i % n == 0){
                return cMultiple;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1};
        int solutions = solutions(arr);
        System.out.println("solutions = " + solutions);
    }
}
