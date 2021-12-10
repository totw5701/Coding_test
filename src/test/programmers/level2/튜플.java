package test.programmers.level2;

import java.util.*;

public class 튜플 {

    public static int[] solution(String s) {

        String[] split = s.substring(1, s.length() - 1).split("},");


        List<Integer> list = new ArrayList<>();
        for (String s1 : split) {

            if (s1.charAt(s1.length() - 1) == '}') {
                String[] arr = s1.substring(1, s1.length() - 1).split(",");
                int count = 0;
                for (String s2 : arr) {
                    count += Integer.parseInt(s2);
                }
                list.add(count);
                continue;
            }

            String[] arr = s1.substring(1).split(",");
            int count = 0;
            for (String s2 : arr) {
                count += Integer.parseInt(s2);
            }
            list.add(count);
        }

        Collections.sort(list);

        for (int i = list.size()-1; i > 0; i--) {
            int i1 = list.get(i) - list.get(i - 1);
            list.set(i, i1);
        }


        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {

        String s = "{{1,2},{1},{1,2,3}}";
        solution(s);

    }
}
