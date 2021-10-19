package test.programmers.level1;

import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {

    public static long[] basic(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long[] basic = basic(x, n);
        System.out.println("Arrays.toString(basic) = " + Arrays.toString(basic));
    }
}
