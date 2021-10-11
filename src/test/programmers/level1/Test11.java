package test.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test11 {
    public static void main(String[] args) {
        // 1 6 7 9 13 23 24 25

        testF();
        int N = 5;
        int[] stages = {4,4,4,4,4};

        Map<Integer, Double> stageFRatio = new HashMap<>();
        int[] stageClear = new int[N];

        for(int i = 0 ; i < N ; i++){
            stageFRatio.put(i+1, 0.0);
            System.out.println("stageFRatio = " + stageFRatio);
            for(int j = 0 ; j < stages.length ; j++){
                if(stages[j] > i+1){
                    stageClear[i]++;
                }else if (stages[j] == i+1){
                    stageFRatio.put(i+1, stageFRatio.get(i+1)+1);
                }
            }
            if((stageFRatio.get(i+1)+stageClear[i]) != 0) {
                stageFRatio.replace(i + 1, stageFRatio.get(i + 1) / (stageFRatio.get(i + 1) + stageClear[i]));
            }else if ((stageFRatio.get(i+1)+stageClear[i]) == 0){
                stageFRatio.replace(i + 1, 0.0);
            }
                System.out.println("stageFRatio = " + stageFRatio);
        }

        int[] answer = new int[N];
        for(int i = 0 ; i < N ; i++){
            double max = -1;
            for(int j = 0 ; j < stageFRatio.size() ; j++){
                if(stageFRatio.get(j+1) > max){
                    max = stageFRatio.get(j+1);
                    answer[i] = j+1;
                }
            }
            stageFRatio.replace(answer[i], -1.0);
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        
        
    }

    static void testF(){
        int N = 8;
        Map<Integer, Double> stageFRatio = new HashMap<>();
        stageFRatio.put(1, 0.2);
        stageFRatio.put(2,0.2);
        stageFRatio.put(3,0.03);
        stageFRatio.put(4,0.0);
        stageFRatio.put(5, 0.03);
        stageFRatio.put(6, 0.002);
        stageFRatio.put(7, 0.7);
        stageFRatio.put(8, 0.43);

        int[] answer = new int[N];
        for(int i = 0 ; i < N ; i++){
            double max = -1;
            for(int j = 0 ; j < stageFRatio.size() ; j++){
                if(stageFRatio.get(j+1) > max){
                    max = stageFRatio.get(j+1);
                    answer[i] = j+1;
                }
            }
            stageFRatio.replace(answer[i], -1.0);
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
