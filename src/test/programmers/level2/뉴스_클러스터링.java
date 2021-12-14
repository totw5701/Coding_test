package test.programmers.level2;

import java.util.*;

public class 뉴스_클러스터링 {

    public static int solution(String str1, String str2) {

        List<String> x = stringCutter(str1);
        List<String> y = stringCutter(str2);

        List<String> cross = cross(x, y);

        List<String> union = union(x, y);

        double v = (double) cross.size() / union.size() * 65536;

        if (union.size() == 0) return 65536;
        return (int) ((double) cross.size() / union.size() * 65536);
    }

    public static List<String> union(List<String> orix, List<String> oriy) {

        List<String> list = new ArrayList<>();
        List<String> y = new ArrayList<>();

        for (String s : oriy) {
            y.add(s);
        }

        for (String s : orix) {
            list.add(s);
            if (y.contains(s)) {
                int idx = y.indexOf(s);
                y.remove(idx);
            }
        }

        for (String s : y) {
            list.add(s);
        }

        return list;
    }

    public static List<String> cross(List<String> orix, List<String> oriy) {

        List<String> list = new ArrayList<>();
        List<String> y = new ArrayList<>();

        for (String s : oriy) {
            y.add(s);
        }

        for (String s : orix) {
            if (y.contains(s)) {
                list.add(s);
                int idx = y.indexOf(s);
                y.remove(idx);
            }
        }

        return list;
    }

    public static List<String> stringCutter(String str) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            String substring = str.substring(i, i + 2).toLowerCase(Locale.ROOT);
            if(substring.matches("^[a-zA-Z]+$")) list.add(substring);
        }

        return list;
    }

    public static void main(String[] args) {
        int france = solution("aa1+aa2", "AAAA12");
        System.out.println("france = " + france);
    }
}
