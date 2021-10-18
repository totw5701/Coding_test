package test.programmers.level1;

public class 짝수와_홀수 {

    public static String basic(int num){
        if(num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static String basic2(int num){
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num = 3;
    }
}
