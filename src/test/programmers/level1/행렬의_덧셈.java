package test.programmers.level1;

import java.util.Arrays;

public class 행렬의_덧셈 {

    public static int[][] sum(int[][] arr1, int[][] arr2){
        int[][] sum = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[0].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};

        int[][] sum = sum(arr1, arr2);
        for (int[] ints : sum) {
            System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        }
    }
}
