package test.programmers.level2;

import java.util.Arrays;
import java.util.Collections;

public class 땅따먹기 {

//    public static int basic(int[][] land){
//
//        int nowCol = -1;
//        int score = 0;
//        for (int i = 0; i < land.length; i++) {
//
//            int[] findMax = findMax(land[i]);
//            if (findMax[0] == nowCol) {
//                findMax = findMax(land[i]);
//            }
//            score += findMax[1];
//            nowCol = findMax[0];
//        }
//
//        return score;
//
//    }
//
//    public static int[] findMax(int[] row) {
//
//        int idx = 0;
//        int max = 0;
//
//        for (int i = 0; i < row.length; i++) {
//            if (row[i] > max) {
//                idx = i;
//                max = row[i];
//            }
//        }
//        row[idx] = 0;
//
//        return new int[]{idx, max};
//    }


    public static int basic(int[][] land) {

        int idx = -1;
        int col = 0;
        int score = 0;
        int maxScore = 0;

       hell(land,idx, col, score, maxScore);

       return maxScore;

    }

    public static void hell(int[][] arr, int idx, int col, int score, int maxScore) {

        for (int i = 0; i < arr.length; i++) {
            if (idx == i) {
                continue;
            }

            score += arr[col][i];
            col ++;
            idx = i;

            if (col >= arr.length - 1) {
                if (score > maxScore) {
                    maxScore = score;
                }
                score = 0;
                col = 0;
            }

            hell(arr, idx, col, score, maxScore);
        }

    }



    public static void main(String[] args) {
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        int basic = basic(land);
        System.out.println("basic = " + basic);

    }
}
