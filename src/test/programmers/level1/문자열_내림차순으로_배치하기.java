package test.programmers.level1;

import java.util.*;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {

        String s = "Zbcdefg";

        char[] chars = s.toCharArray();
        List<Character> listS = new ArrayList<>();
        for(char ch : chars){
            listS.add(ch);
        }

        Collections.sort(listS, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(Character ch: listS){
            sb.append(ch);
        }
        System.out.println("sb = " + sb);
        String s1 = sb.toString();
        System.out.println("s1 = " + s1);


    }
}
