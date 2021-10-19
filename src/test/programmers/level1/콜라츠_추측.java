package test.programmers.level1;

public class 콜라츠_추측 {

    public static int collatz(int num) {
        long lNum = (long) num;
        int idx = 0;
        while(idx < 500 && lNum != 1){
            if(lNum % 2 == 0){
                lNum /= 2;
            }else{
                lNum = lNum*3+1;
            }
            idx++;
        }
        if(idx == 500 && lNum != 1) return -1;
        return idx;
    }

    public static int collatzV2(int num) {
        long lNum = (long) num;
        for(int i = 0; i < 500; i++){
            if(lNum == 1) return i;
            lNum = lNum % 2 == 0? lNum/2 : lNum*3+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int num = 626331;
        int collatz = collatzV2(num);
        System.out.println("collatz = " + collatz);
    }
}
