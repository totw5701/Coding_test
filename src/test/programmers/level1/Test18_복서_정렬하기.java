package test.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test18_복서_정렬하기 {
    public static void main(String[] args) {

        int[] weights = {60,70,60};
        String[] head2head = {"NNN","NNN","NNN"};

        Map<Double, Integer> playerInfo = new HashMap<>();

        for(int i = 0 ; i < weights.length; i++){
            Double infoScore = 0.0;
            // 승률 계산하기.
            double WCount = 0.0;
            int LCount = 0;
            for(int j = 0 ; j < weights.length; j ++){
                if(head2head[i].charAt(j) == 'W') {
                    WCount++;
                    // 무게가 더 많이 나가는 선수를 이긴 횟수
                    if(weights[i] < weights[j]){
                        infoScore+= 1*0.1;
                    }
                }
                else if (head2head[i].charAt(j) == 'L') LCount++;
            }
            if(WCount + LCount != 0){
                infoScore+= (int)(WCount/(LCount+WCount)*100);
            }
            // 무게 더하기.
            infoScore+= weights[i]*0.0001;
            System.out.println("infoScore = " + infoScore);
            playerInfo.put(infoScore, i+1);
        }

        // 정렬 후 answer 추출.
        Double[] tempRankArr = new Double[weights.length];
        Set<Double> keySet = playerInfo.keySet();
        int idx = 0;
        for (Double d : keySet) {
            tempRankArr[idx] = d;
            idx++;
        }
        System.out.println("Arrays.toString(tempRankArr) = " + Arrays.toString(tempRankArr));
        Arrays.sort(tempRankArr);

        int[] answer = new int[weights.length];
        for(int i = 0 ; i < answer.length ; i ++){
            answer[answer.length-1-i] = playerInfo.get(tempRankArr[i]);
        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));


    }


}
