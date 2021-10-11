package test.programmers.level1;

public class Test16_2016년 {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;

        int sum = daysSum(a, b);

        String answer ="";
        if(sum%7 == 1){
            answer = "FRI";
        }else if(sum%7 ==2){
            answer = "SAT";
        }else if(sum%7 ==3){
            answer = "SUN";
        }else if(sum%7 ==4){
            answer = "MON";
        }else if(sum%7 ==5){
            answer = "TUE";
        }else if(sum%7 ==6){
            answer = "WED";
        }else if(sum%7 ==0){
            answer = "THU";
        }

        System.out.println("answer = " + answer);


    }

    private static int daysSum(int a, int b) {
        int days = 0;
        for(int i = 1; i < a; i++){
            if(i == 2){
                days += 29;
            }else if(i < 8 ){
                if(i%2 == 0){
                    days +=30;
                }else {
                    days +=31;
                }
            }else{
                if(i%2 == 0){
                    days +=31;
                }else {
                    days +=30;
                }
            }
        }
        days+=b;
        return days;
    }
}
