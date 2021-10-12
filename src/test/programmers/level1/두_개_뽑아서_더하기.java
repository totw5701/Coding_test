package test.programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};

        Set<Integer> answerSet = new HashSet<>();
        for(int i = 0 ; i < numbers.length -1 ; i++){
            for(int j = i + 1 ; j < numbers.length; j++){
                answerSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[answerSet.size()];
        Object[] objects = answerSet.toArray();
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = (int)objects[i];
        }
        Arrays.sort(answer);

        System.out.println("answer = " + Arrays.toString(answer));



    }
}
