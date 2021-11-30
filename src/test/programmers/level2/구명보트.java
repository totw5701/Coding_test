package test.programmers.level2;

import java.util.*;

public class 구명보트 {

    public static int init(int[] people, int limit) {

        List<Integer> list = new ArrayList<>();

        for (int person : people) {
            list.add(person);
        }

        Collections.sort(list, Collections.reverseOrder());

        int count = 0;

        while (list.size() > 0) {

            if (list.size() == 1) {
                count++;
                break;
            }

            int fattest = list.get(0);

            if (fattest <= limit/2) {
                count += Math.round(list.size()/2.0);
                break;
            }

            for (int i = 1; i < list.size(); i++) {

                if (fattest + list.get(i) > limit &&
                        i == list.size() - 1) {

                    count++;
                    list.remove(0);
                    break;

                } else if (fattest + list.get(i) <= limit) {
                    count++;
                    list.remove(i);
                    list.remove(0);
                    break;
                }
            }
        }

        return count;
    }

    public static int initV2(int[] people, int limit) {

        Arrays.parallelSort(people);

        List<Integer> list = new LinkedList<>();

        for (int i = 0 ; i < people.length; i++) {
            list.add(people[people.length - 1 - i]);
        }


        int count = 0;

        while (list.get(0) > limit / 2) {

            if (list.get(0) + list.get(list.size()-1) <= limit) {
                list.remove(0);
                list.remove(list.size()-1);
            } else {
                list.remove(0);
            }
            count++;

            if (list.size() == 0) return count;
        }

        count += Math.round(list.size()/2.0);

        return count;
    }

    public static int initV3(int[] people, int limit) {
        return 1;
    }

    public static void main(String[] args) {

        int[] people = {90, 10, 80, 20};
        int limit = 100;

        int init = initV2(people, limit);
        System.out.println("init = " + init);
    }
}
