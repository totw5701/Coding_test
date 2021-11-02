package test.programmers.level2;

import java.util.*;

public class 프린터 {

    public static int basic(int[] priorities, int location) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int p : priorities) {
            list.add(p);
        }

        int printCnt = 0;
        int idx = 0;
        for (int i = 9; i > 0; i--) {
            while (list.contains(i)) {
                Integer num = list.get(idx);

                // 프린트
                if (num == i) {
                    list.set(idx, 0);
                    printCnt++;
                    if (idx == location) {
                        return printCnt;
                    }
                }

                idx++;
                if (idx == priorities.length) {
                    idx = 0;
                }
            }
        }

        return -1;
    }

    public static int queue(int[] priorities, int location) {

        Queue<Integer> q = new LinkedList<>();

        for (int p : priorities) {
            q.add(p);
        }


        int printCnt = 0;

        for (int i = 9; i > 0; i--) {

            while (q.contains(i)) {
                Integer num = q.poll();

                // 프린트
                if (num == i) {
                    printCnt++;
                    if (location == 0) {
                        return printCnt;
                    }
                } else {
                    q.add(num);
                }

                location--;
                if (location == -1) {
                    location = q.size()-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        int basic = basic(priorities, location);
        System.out.println("basic = " + basic);

    }
}
