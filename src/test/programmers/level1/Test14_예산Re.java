package test.programmers.level1;

import java.util.Arrays;

public class Test14_예산Re {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 11;


        int answer = 0;
        Arrays.sort(d);
        System.out.println("Arrays.toString(d) = " + Arrays.toString(d));
        for(int i = 0 ; i < d.length ; i++){
            budget -= d[i];
            if(budget < 0) break;
            answer = i+1;
        }

        
    }
}
