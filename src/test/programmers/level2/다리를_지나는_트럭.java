package test.programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 다리를_지나는_트럭 {

    public static int init(int bridge_length, int weight, int[] truck_weights) {



        /**
         *  1. 차를 내린다.
         *  2. 차를 올릴 수 있나 확인한다
         *  3 true. 차를 올린다.
         *  4 false. 공백을 올린다.
         *  5. 시간을 경과시킨다.
         */

        Queue<Integer> trucks = new LinkedList<>();
        for (int truck_weight : truck_weights) {
            trucks.add(truck_weight);
        }
        
        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        List<Integer> arrived = new ArrayList<>();
        int time = 0;

        while (true) {

            Integer poll = bridge.poll();
            if (poll != 0) arrived.add(poll);

            int bridgeWeight = weightCal(bridge);

            if (trucks.isEmpty() && bridgeWeight == 0) {
                break;
            }

            if (!trucks.isEmpty()) {

                int onBridge = getNumOnBridge(truck_weights, trucks, arrived);
                if (onBridge < bridge_length &&
                        bridgeWeight + trucks.peek() <= weight) {

                    // 넣어라.
                    bridge.add(trucks.poll());
                } else {
                    bridge.add(0);
                }
            } else {
                bridge.add(0);
            }
            time++;
        }
        return time + 1;
    }


    private static int getNumOnBridge(int[] truck_weights, Queue<Integer> trucks, List<Integer> arrived) {
        int onBridge = truck_weights.length - trucks.size() - arrived.size();
        return onBridge;
    }

    public static int weightCal(Queue<Integer> bridge) {
        int nowBrWeight = 0;
        for (Integer truck : bridge) {
            nowBrWeight += truck;
        }
        return nowBrWeight;
    }

    public static void main(String[] args) {

        int init = init(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10});
        System.out.println("init = " + init);
    }
}
