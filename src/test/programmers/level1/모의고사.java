package test.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class 모의고사 {

    public static int[] basic(int[] answers){
        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2,4,2,5};
        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};

        int[] score = {0, 0, 0};
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == stu1[i%5]) score[0]++;
            if(answers[i] == stu2[i%8]) score[1]++;
            if(answers[i] == stu3[i%10]) score[2]++;
        }

        int max = -1;
        for(int i = 0; i < 3; i++){
            if(score[i] > max){
                max = score[i];
            }
        }

        List<Integer> answerList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(score[i] == max){
                answerList.add(i+1);
            }
        }

        // 짧지만 시간이 더 소요되는 코드. (Stream)
        // answerList.stream().mapToInt(i -> i).toArray();

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] answers = {1,3,2,4,2};
        int[] basic = basic(answers);
        System.out.println("Arrays.toString(basic) = " + Arrays.toString(basic));

    }
}
