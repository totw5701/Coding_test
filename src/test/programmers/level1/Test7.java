package test.programmers.level1;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[commands.length];

        for(int i = 0 ; i < commands.length ; i++){
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            for(int j = 0 ; j < temp.length ; j++){
                temp[j] = array[commands[i][0]-1 + j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }




    }
}
