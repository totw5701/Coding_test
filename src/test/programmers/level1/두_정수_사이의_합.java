package test.programmers.level1;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        long a = 10000000;
        long b = -10000000;

        long sum = (a+b)*(Math.abs(b-a)+1)/2;

        System.out.println("sum = " + sum);
    }
}
