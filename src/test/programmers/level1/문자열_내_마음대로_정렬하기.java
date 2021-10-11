package test.programmers.level1;

import java.util.*;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        List<String> list = new ArrayList<>();
        for(String str : strings){
            list.add(str);
        }

        Collections.sort(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n)-o2.charAt(n);
            }
        });

        String[] arr = new String[strings.length];
        String[] answer = list.toArray(arr);

        System.out.println("list = " + list);

    }
}
