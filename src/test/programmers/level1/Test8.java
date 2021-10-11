package test.programmers.level1;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        //int[] answers = {1,2,3,4,5,4,1,2,2,2,2,3,4,1,2,3,3,3,3,4,4,2,2,2,1,2,3,2,2,4,1,1};
        //int[] answers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        //int[] answers = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int[] answers= {1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2,1,3,2,4,2};
        int fiCount = 0;
        int seCount = 0;
        int thCount = 0;




        for(int i = 0 ; i < answers.length; i ++) {
            // 1번
            if (answers[i] == i % 5 + 1) {
                fiCount++;
            }

            // 2번
            if (i % 2 == 0 && answers[i] == 2) {
                seCount++;
            } else if (i % 2 == 1 ) {
                //&& answers[i] == ((int) (i / 2) % 5 + 1)
                if(i%8 == 1 && answers[i] == 1){
                    seCount++;
                }else if(i%8 == 3 && answers[i] == 3){
                    seCount++;
                }else if(i%8 == 5 && answers[i] == 4){
                    seCount++;
                }else if(i%8 == 7 && answers[i] == 5){
                    seCount++;
                }
            }

            // 3번
            if ((int) ((i % 10) / 2) == 0 && answers[i] == 3) {
                thCount++;
            } else if ((int) ((i % 10) / 2) == 1 && answers[i] == 1) {
                thCount++;
            } else if ((int) ((i % 10) / 2) == 2 && answers[i] == 2) {
                thCount++;
            } else if ((int) ((i % 10) / 2) == 3 && answers[i] == 4) {
                thCount++;
            } else if ((int) ((i % 10) / 2) == 4 && answers[i] == 5) {
                thCount++;
            }
        }

        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("1", fiCount);
        countMap.put("2", seCount);
        countMap.put("3", thCount);


        Collection<Integer> values = countMap.values();
        Object[] valueArr = values.toArray();
        Arrays.sort(valueArr, Collections.reverseOrder());
        System.out.println("values = " + values);
        System.out.println("valueArr = " + Arrays.toString(valueArr));


        if(valueArr[0] == valueArr[1] && valueArr[1]  == valueArr[2]){
            System.out.println("2중복");
            Object[] keyArr = countMap.keySet().toArray();
            Arrays.sort(keyArr);
            int[] answer = new int[3];
            answer[0] = Integer.parseInt((String)keyArr[0]);
            answer[1] = Integer.parseInt((String)keyArr[1]);
            answer[2] = Integer.parseInt((String)keyArr[2]);
            System.out.println("Arrays.toString(keyArr) = " + Arrays.toString(keyArr));
            System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        }else if (valueArr[0] == valueArr[1]){
            System.out.println("1중복");
            for(String key : countMap.keySet()){
                if(countMap.get(key) == valueArr[2]){
                    countMap.remove(key);
                }
            }
            Object[] keyArr = countMap.keySet().toArray();
            Arrays.sort(keyArr);
            int[] answer = new int[2];
            answer[0] = Integer.parseInt((String)keyArr[0]);
            answer[1] = Integer.parseInt((String)keyArr[1]);
            System.out.println("Arrays.toString(keyArr) = " + Arrays.toString(keyArr));
            System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));

        }else {
            System.out.println("노 중복");
            for(String key : countMap.keySet()){
                if(countMap.get(key) == valueArr[0]){
                    int[] answer = {Integer.parseInt(key)};
                    System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
                }
            }
        }



    }
}
