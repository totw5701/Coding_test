package test.programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 다리를_지나는_트럭_ReFactoring {

    static class Bridge {

        int weight;
        int length;
        Queue<Integer> onBridge;

        public Bridge(int weight, int length) {
            this.weight = weight;
            this.length = length;
            this.onBridge = new LinkedList<>();

            for (int i = 0; i < length; i++) {
                onBridge.add(0);
            }

        }

        public void insert(int insert) {
            onBridge.add(insert);
        }

        public int remove() {
            return onBridge.poll();
        }

        public boolean canLoad(int nextTrukWei) {
            int truckNum = 0;
            int onBridgeWeight = 0;
            for (Integer integer : onBridge) {
                onBridgeWeight += integer;
                if(integer != 0) truckNum++;
            }

            if(truckNum < length && onBridgeWeight + nextTrukWei <= weight) return true;
            return false;
        }

    }


    public static int init(int bridge_length, int weight, int[] truck_weights) {

        /**
         *  1. 차를 내린다.
         *  2. 차를 올릴 수 있나 확인한다  (남아있는 트럭이 있어야함, 다리 하중을 버틸 수 있어야함, 다리길이보다 많이 실을 수 없음)
         *  3 true. 차를 올린다.
         *  4 false. 공백을 올린다.
         *  5. 시간을 경과시킨다.
         */
        Queue<Integer> remains = new LinkedList<>();
        for (int truck_weight : truck_weights) {
            remains.add(truck_weight);
        }

        List<Integer> arrived = new ArrayList<>();

        Bridge bridge = new Bridge(weight, bridge_length);

        int time = 0;

        while (!bridge.onBridge.isEmpty()) {
            int remove = bridge.remove();
            if (remove != 0) arrived.add(remove);

            if(!remains.isEmpty()){
                if (bridge.canLoad(remains.peek())) {
                    bridge.insert(remains.poll());
                } else {
                    bridge.insert(0);
                }
            }

            time++;
        }

        return time;
    }




    public static void main(String[] args) {

        int init = init(100, 100, new int[]{10});
        System.out.println("init = " + init);
    }
}
