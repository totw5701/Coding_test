package test.programmers.level1;

public class Test16_2016년_RE {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;

        int sum = daysSum(a, b);

        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        String answer ="";
        answer = day[sum%7];

        System.out.println("answer = " + answer);


    }

    private static int daysSum(int a, int b) {
        int[] daysArr = {31,29,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        for(int i = 0 ; i < a ; i++){
            days+=daysArr[i];
        }
        days+=b;
        return days;
    }
}
