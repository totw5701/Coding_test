package test.programmers.level1;

public class 정수_제곱근_판별 {

    public static long basic(long n){

        double sqrt = Math.sqrt(n);

        if(sqrt == (long) sqrt){
            return (long) (Math.pow(sqrt+1, 2));
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        long n = 3;

        long basic = basic(n);
        System.out.println("basic = " + basic);
    }
}
