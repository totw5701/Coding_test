package test.programmers.level1;

public class 문자열을_정수로_바꾸기 {

    public static int basic(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String s = "-1234";

        int basic = basic(s);
        System.out.println("basic = " + basic);
    }
}
