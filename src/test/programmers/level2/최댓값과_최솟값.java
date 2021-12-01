package test.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 최댓값과_최솟값 {

    public static String init(String s) {

        String[] s1 = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s2 : s1) {
            list.add(Integer.parseInt(s2));
        }

        int max = list.get(0);
        int min = list.get(0);

        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }
        }

        String answer = String.valueOf(min) + " " + String.valueOf(max);
        return answer;
    }

    public static void main(String[] args) {
        String s = "1 2 3 4";

        String init = init(s);
        System.out.println("init = " + init);
    }
}
