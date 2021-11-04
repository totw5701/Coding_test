package test.programmers.level2;

import java.util.ArrayList;
import java.util.Stack;

public class 짝지어_제거하기 {

    public static int basic(String s) {
        StringBuilder sb = new StringBuilder(s);

        while(!sb.isEmpty()) {
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    //제거
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    break;
                }

                if (i + 1 == sb.length() - 1 && !sb.isEmpty()) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int basicV2(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            Character ch = s.charAt(i);

            if (!st.empty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }

        }
        if (st.empty()) {
            return 1;
        } else {
            return 0;
        }


    }

    public static void main(String[] args) {
        String s = "baabaa";
        int basic = basicV2(s);
        System.out.println("basic = " + basic);
    }
}
