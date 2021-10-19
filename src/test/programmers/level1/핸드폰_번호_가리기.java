package test.programmers.level1;

public class 핸드폰_번호_가리기 {

    public static String phoneHide(String phone_number) {
        int length = phone_number.length();
        String answer = "";
        for(int i = 0; i < length - 4; i++){
            answer += "*";
        }
        answer += phone_number.substring(length - 4, length);
        return answer;
    }

    public static String phoneHideV2(String phone_number) {
        char[] chars = phone_number.toCharArray();
        for (int i = 0; i < chars.length - 4; i++) {
            chars[i] = '*';
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";
        String s = phoneHideV2(phone_number);
        System.out.println("s = " + s);
    }
}
