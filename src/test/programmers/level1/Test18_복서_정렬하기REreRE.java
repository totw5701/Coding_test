package test.programmers.level1;

import java.util.*;

public class Test18_복서_정렬하기REreRE {
    public static void main(String[] args) {

        int[] weights = {60,70,60};
        String[] head2head = {"NNN","NNN","NNN"};

        Map<Integer, Double> playerInfo = new HashMap<>();

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
                        infoScore+= 1*0.001;
                    }
                }
                else if (head2head[i].charAt(j) == 'L') LCount++;
            }
            if(WCount + LCount != 0){
                infoScore+= (int)(WCount/(LCount+WCount)*1000000);
            }
            // 무게 더하기.
            infoScore+= weights[i]*0.000001;
            playerInfo.put(i+1, infoScore);
        }

        // 정렬 후 answer 추출.
        int[] answer = new int[weights.length];

        List<Map.Entry<Integer, Double>> listPlayerInfo =
                new ArrayList<Map.Entry<Integer, Double>>(playerInfo.entrySet());

        Collections.sort(listPlayerInfo, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return o1.getValue().compareTo(o2.getValue())*(-1);
            }
        });

        System.out.println("listPlayerInfo = " + listPlayerInfo);

        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = listPlayerInfo.get(i).getKey();
        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));


    }


}
