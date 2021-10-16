package test.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {

    public static long descSortLong(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        char[] revChars = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            revChars[i] = chars[chars.length -1 -i];
        }
        String s = String.valueOf(revChars);
        return Long.parseLong(s);
    }

    public static long descSrotLongRe(long n) {
        String[] split = String.valueOf(n).split("");
        Arrays.sort(split, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String str : split) sb.append(str);

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        long n = 118372;
        //long l = descSortLong(n);
        //System.out.println("l = " + l);

        long l = descSrotLongRe(n);
        System.out.println("l = " + l);
    }
}
