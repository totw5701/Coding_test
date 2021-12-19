package test.programmers.level2;

public class JadenCase_문자열_만들기 {

    public static String solution(String s) {

        StringBuilder sb = new StringBuilder(s);

        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));


        boolean nextSpace = false;
        for (int i = 1; i < s.length(); i++) {

            if (sb.charAt(i) == ' ') {
                nextSpace = true;
                continue;
            }

            if (nextSpace) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                nextSpace = false;
                continue;
            }

            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
        }


        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "hello world my name is david";
        String solution = solution(s);
        System.out.println("solution = " + solution);

    }

}
