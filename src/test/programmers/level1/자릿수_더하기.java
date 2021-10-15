package test.programmers.level1;

public class 자릿수_더하기 {

    public static int digitSum(int n) {
        Integer num = n;
        int leng = num.toString().length();

        int digSum = 0;
        for (int i = 0; i < leng; i++) {
            digSum += n % 10;
            n = n/10;
        }
        return digSum;
    }

    public static int digitSumRe(int n) {
        int digSum = 0;
        while(n > 0){
            digSum += n % 10;
            n = n/10;
        }
        return digSum;
    }

    public static void main(String[] args) {
        int n = 123;

//        int i = digitSum(n);
//        System.out.println("i = " + i);

        int i = digitSumRe(n);
        System.out.println("i = " + i);

    }
}
