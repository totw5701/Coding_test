package test.programmers.level1;

import java.util.*;

public class Test18_복서_정렬하기REre {
    public static void main(String[] args) {

        int[] weights = {60,70,60};
        String[] head2head = {"NNN","NNN","NNN"};

        Map<Integer, Double> playerInfo = new HashMap<>();
        Double[] playerInfoValue = new Double[weights.length];

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
            playerInfo.put(i+1, infoScore);
            playerInfoValue[i] = infoScore;
        }

        // 정렬 후 answer 추출.
        int[] answer = new int[weights.length];
        Arrays.sort(playerInfoValue, Collections.reverseOrder());
        Set<Map.Entry<Integer, Double>> entries = playerInfo.entrySet();
        for (Map.Entry<Integer, Double> entry : entries) {
            for(int i = 0 ; i < playerInfoValue.length ; i++){
                if(entry.getValue() == playerInfoValue[i]){
                    answer[i] = entry.getKey();
                    playerInfoValue[i] = -1.0;
                }
            }
        }


        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));


    }


}
