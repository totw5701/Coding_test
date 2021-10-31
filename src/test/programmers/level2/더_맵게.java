package test.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class 더_맵게 {

    public static int basic(int[] scoville, int K){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : scoville) {
            list.add(i);
        }

        int mixCount = 0;
        while(true){
            Collections.sort(list);
            System.out.println("list = " + list);
            if (list.get(0) >= K) {
                break;
            }
            if (list.get(0) >= K && list.size() == 1) {
                return -1;
            }
            Integer mix = list.get(0) + list.get(1) * 2;
            list.remove(0);
            list.remove(0);

            list.add(mix);
            System.out.println("after list = " + list);
            mixCount++;
        }

        return mixCount;
    }

    public static int useHeap(int[] scoville, int K) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : scoville) {
            minHeap.add(i);
        }

        int mixCount = 0;
        while(true){
            if (minHeap.peek() >= K) {
                break;
            }
            if (minHeap.size() == 1) {
                return -1;
            }
            Integer mix = minHeap.poll() + minHeap.poll() * 2;
            minHeap.add(mix);
            mixCount++;
        }

        return mixCount;

    }


    public static void main(String[] args) {
        int[] scoville = {1,2};
        int k = 7;

        int basic = basic(scoville, 7);
        System.out.println("basic = " + basic);
    }
}
