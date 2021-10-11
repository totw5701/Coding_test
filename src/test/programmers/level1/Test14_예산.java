package test.programmers.level1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test14_예산 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 11;


        int answer = 0;
        Arrays.sort(d);
        System.out.println("Arrays.toString(d) = " + Arrays.toString(d));
        for(int i = 0 ; i < d.length ; i++){
            if(d[i] <= budget){
                budget-=d[i];
                System.out.println("i = " + i);
                System.out.println("budget = " + budget);
            }else if (d[i] > budget){
                answer = i;
                System.out.println("answer = " + answer);
                break;
            }
            if(i == d.length-1){
                answer = i+1;
                System.out.println("answer, 0 = " + answer);
                break;
            }
        }

        
    }
}
