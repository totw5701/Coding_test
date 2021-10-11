package test.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test8REre {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5,4,1,2,2,2,2,3,4,1,2,3,3,3,3,4,4,2,2,2,1,2,3,2,2,4,1,1};

        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,1,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};

        int[] supoScore = {0,0,0};
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int i = 0 ; i < answers.length ; i ++){
            if(answers[i] == supo1[i%5]) supoScore[0]++;
            if(answers[i] == supo2[i%8]) supoScore[1]++;
            if(answers[i] == supo3[i%10]) supoScore[2]++;
        }

        int maxScore = 0;
        for(int i = 0 ; i < 3 ; i++){
            if(supoScore[i] >= maxScore){
                maxScore = supoScore[i];
            }
        }

        for(int i =0 ; i < 3 ; i++){
            if(maxScore == supoScore[i]){
                answerList.add(i+1);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = answerList.get(i);
        }
        Arrays.sort(answer);






    }
}
