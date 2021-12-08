package test.programmers.level2;

public class 조이스틱Re {

    public static int solution(String name) {

        int count = 0;
        int idx = 0;

        while (true) {
            // 알파벳 수정

            char c = name.charAt(idx);
            count += (c - 'A' < 'Z' - c + 1) ? (c - 'A') : ('Z' - c + 1);

            name = name.substring(0, idx) + 'A' + name.substring(idx + 1);

            String str = "";
            if (idx == 0) {
                str = name.substring(1);
            } else if (idx == name.length() - 1) {
                str = name.substring(0, name.length() - 1);
            } else {
                str = name.substring(idx + 1) + name.substring(0, idx);
            }

            int direction = lOrR(str);
            if(direction == 0) break;
            count += Math.abs(direction);

            idx += direction;
            if (idx < 0) {
                idx = name.length() + idx;
            } else if (idx >= name.length()) {
                idx = idx % name.length();
            }
        }


        return count;
    }

    public static int lOrR(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != 'A') {
                return i + 1;
            }

            if (str.charAt(str.length() - 1 - i) != 'A') {
                return -1 * i - 1;
            }

        }

        return 0;
    }


    public static void main(String[] args) {

        int count = solution("JEROEN");
        System.out.println("count = " + count);


    }
}
