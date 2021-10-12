package test.programmers.level1;

public class 문자열_다루기_기본 {
    public static boolean isDigit(String s){
        if(s.length() != 4 && s.length() != 6){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' '){
                return false;
            }
        }
        return true;
    }

    public static boolean isMatch(String s){
        return s.matches("-?\\d+");
    }

    public static void main(String[] args) {
        String s = "0234.";

        boolean digit = isDigit(s);
        System.out.println("digit = " + digit);

        System.out.println("=============");
        boolean match = isMatch(s);
        System.out.println("match = " + match);
    }
}
