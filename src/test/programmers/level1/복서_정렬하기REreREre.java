package test.programmers.level1;

import java.util.*;

public class 복서_정렬하기REreREre {
    public static void main(String[] args) {

        int[] weights = {50,82,75,120};
        String[] head2head = {"NLWL","WNLL","LWNW","WWLN"};

        Double[][] playerInfo = new Double[weights.length][2];

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
                        infoScore+= 1*0.01;
                    }
                }
                else if (head2head[i].charAt(j) == 'L') LCount++;
            }
            if(WCount + LCount != 0){
                infoScore+= (int)(WCount/(LCount+WCount)*1000000);
            }
            // 무게 더하기.
            infoScore+= weights[i]*0.00001;
            playerInfo[i][0] = i+1.0;
            playerInfo[i][1] = infoScore;
        }

        // 정렬 후 answer 추출.
        int[] answer = new int[weights.length];

        Arrays.sort(playerInfo, new Comparator<Double[]>() {
            @Override
            public int compare(Double[] o1, Double[] o2) {
                if (o1[1] == o2[1]) return o1[0].intValue() - o2[0].intValue();
                else return o1[1].intValue()-o2[1].intValue();
            }
        });

        for(int i = 0 ; i < weights.length ; i ++){
            answer[weights.length-1-i] = playerInfo[i][0].intValue();
        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));


    }


}
