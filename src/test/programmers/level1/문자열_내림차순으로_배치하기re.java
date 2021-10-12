package test.programmers.level1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기re {
    public static void main(String[] args) {

        String s = "Zbcdefg";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String s1 = new StringBuilder(new String(chars)).reverse().toString();
        System.out.println("s1 = " + s1);
    }
}
