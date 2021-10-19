package test.programmers.level1;

import java.util.Arrays;

public class 평균_구하기 {

    public static double mean(int[] arr) {
        long sum = Arrays.stream(arr).sum();
        return sum/(double)arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        double mean = mean(arr);
        System.out.println("mean = " + mean);
    }
}
