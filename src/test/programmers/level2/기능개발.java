package test.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class 기능개발 {

    public static ArrayList<Integer> basic(int[] progresses, int[] speeds){

        ArrayList<Integer> releaseNum = new ArrayList<Integer>();
        int count = 0;
        int idx = 0;
        while(idx < progresses.length){
            if (progresses[idx] >= 100) {
                for (int i = idx; i < progresses.length; i++) {
                    if (progresses[i] >= 100) {
                        progresses[i] = -1;
                        count++;
                        idx = i+1;
                    } else {
                        idx = i;
                        break;
                    }
                }
                releaseNum.add(count);
                count = 0;
            }

            for (int i = idx; i < progresses.length; i++) {
                if(progresses[i] >= 100){
                    continue;
                }
                progresses[i] += speeds[i];
            }
        }

        return releaseNum;
    }

    public static ArrayList<Integer> stackQueue(int[] progresses, int[] speeds){
        return null;
    }

    public static void main(String[] args) {

//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};

        int[] progresses = {95, 90, 99, 99,80, 99};
        int[] speeds = {1,1,1,1,1,1};

        ArrayList<Integer> basic = basic(progresses, speeds);
        System.out.println("basic = " + basic);

    }
}
