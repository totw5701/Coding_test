package test.programmers.level2;

import java.util.*;

public class 캐시 {

    public static int solution(int cacheSize, String[] cities) {

        if(cacheSize == 0) return cities.length * 5;

        LinkedList<String> cache = new LinkedList<>();

        int time = 0;

        for (String city : cities) {
            String s = city.toLowerCase(Locale.ROOT);

            if (cache.contains(s)) {
                cache.remove(cache.indexOf(s));
                cache.add(s);
                time++;
            } else if (cache.size() >= cacheSize) {
                cache.remove(0);
                cache.add(s);
                time += 5;
            } else {
                cache.add(s);
                time += 5;
            }
        }

        return time;
    }

    public static void main(String[] args) {

        int cacheSize = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        int solution = solution(cacheSize, cities);
        System.out.println("solution = " + solution);
    }
}
