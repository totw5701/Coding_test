package test.programmers.level1;

import java.util.Locale;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";

        int y = 0;
        int p = 0;
        for(int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'y') y++;
            else if(c == 'p') p++;
        }

        if(y == p) System.out.println(" true ");
        else System.out.println(" false ");

    }
}
