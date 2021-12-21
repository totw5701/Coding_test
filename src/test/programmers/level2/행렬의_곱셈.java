package test.programmers.level2;

import java.util.Arrays;

public class 행렬의_곱셈 {

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int rowNum = arr1.length;
        int colNum = arr2[0].length;

        int[][] answer = new int[rowNum][colNum];

        for (int r = 0; r < rowNum; r++) {
            for (int c = 0; c < colNum; c++) {

                int sum = 0;
                for (int n = 0; n < arr1[0].length; n++) {
                    sum += arr1[r][n] * arr2[n][c];
                }
                
                //

                for (int[] ints : answer) {
                    System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
                }
                System.out.println("===");
                
                //
                
                answer[r][c] = sum;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        //int[][] arr1 = {{2,3,2}, {4,2,4}, {3,1,4}};
        //int[][] arr2 = {{5,4,3}, {2,4,1}, {3,1,1}};

        int[][] arr1 = {{1,4}, {3, 2}, {4,1}};
        int[][] arr2 = {{3,3}, {3,3}};

        int[][] solution = solution(arr1, arr2);

        for (int[] ints : solution) {
            System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        }
    }
}
