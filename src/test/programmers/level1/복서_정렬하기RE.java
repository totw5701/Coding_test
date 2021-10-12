package test.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 복서_정렬하기RE {
    public static void main(String[] args) {

        int[] weights = {60,70,60};
        String[] head2head = {"NNN","NNN","NNN"};

        double[] playerInfo = new double[weights.length];

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
            playerInfo[i] = infoScore;
        }

        // 정렬 후 answer 추출.
        double[] sortedPlayerInfo = playerInfo;
        Arrays.sort(sortedPlayerInfo);

        int[] answer = new int[playerInfo.length];
        for(int i = 0; i < playerInfo.length; i++){
            for(int j = 0; j < playerInfo.length;j++){
                if(sortedPlayerInfo[i] == playerInfo[j]){
                    answer[i]=j+1;
                }
            }
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));



    }


}
