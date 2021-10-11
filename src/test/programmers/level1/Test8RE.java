package test.programmers.level1;

import java.util.*;

public class Test8RE {
    public static void main(String[] args) {

        int[] answers = {1,2,3,4,5,4,1,2,2,2,2,3,4,1,2,3,3,3,3,4,4,2,2,2,1,2,3,2,2,4,1,1};
        
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,1,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(1,0);
        countMap.put(2,0);
        countMap.put(3,0);
        
        
        for(int i = 0 ; i < answers.length ; i ++){
            if(answers[i] == supo1[i%5]) countMap.replace(1, countMap.get(1) +1);
            if(answers[i] == supo2[i%8]) countMap.replace(2, countMap.get(2) +1);
            if(answers[i] == supo3[i%10]) countMap.replace(3, countMap.get(3) +1);
        }


        Object[] objValues = countMap.values().toArray();
        Integer[] intValues = new Integer[3];
        for(int i = 0 ; i < 3 ; i++){
            intValues[i] = (Integer) objValues[i];
        }
        Arrays.sort(intValues, Collections.reverseOrder());
        System.out.println("Arrays.toString(objValues) = " + Arrays.toString(intValues));

        if(intValues[0] == intValues[1] && intValues[1] == intValues[2]){
            int[] answer = {1,2,3};
            System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        }else if (intValues[0] == intValues[1]){
            for(Integer key : countMap.keySet()){
                if(countMap.get(key) == intValues[2]){
                    countMap.remove(key);
                }
            }
            int[] answer = new int[2];
            Object[] remainValues = countMap.keySet().toArray();
            for(int i = 0 ; i < 2 ; i++){
                answer[i] = (Integer) remainValues[i];
            }
            System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        }else {
            for(Integer key : countMap.keySet()){
                if(countMap.get(key) == intValues[0]){
                    int[] answer = new int[1];
                    answer[0] = key;
                    System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

                }
            }
        }




    }
}
