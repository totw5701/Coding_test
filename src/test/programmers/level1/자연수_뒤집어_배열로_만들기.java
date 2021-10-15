package test.programmers.level1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {

    public static int[] reverseIntegerArr(long n) {
        Long nLong = n;
        String str = nLong.toString();
        int[] answer = new int[str.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str.charAt(str.length() -1 -i) -48;
        }
        return answer;
    }

    public static int[] reverseIntegerArrRe(long n) {

        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = str.charAt(str.length() -1 -i) -48;
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;

        int[] ints = reverseIntegerArr(n);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
    }
}
