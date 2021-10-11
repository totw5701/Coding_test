package test.programmers.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        List<Integer> answerList = new LinkedList();
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                continue;
            }else{
                answerList.add(arr[i]);
            }
        }
        answerList.add(arr[arr.length-1]);
//        Integer[] answer = new Integer[answerList.size()];
//        answer = answerList.toArray(answer);

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }

        System.out.println("answer = " + Arrays.toString(answer));
    }
}
