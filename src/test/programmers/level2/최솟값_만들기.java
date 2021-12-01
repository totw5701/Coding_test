package test.programmers.level2;

import java.util.Arrays;

public class 최솟값_만들기 {

    public static int init(int[] A, int[] B) {

        Arrays.sort(A);
        Arrays.sort(B);

        int length = A.length;

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += A[i] * B[length - 1 - i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int init = init(A, B);
        System.out.println("init = " + init);
    }
}
