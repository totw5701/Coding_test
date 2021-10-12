package test.programmers.level1;

public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        long moneyLong = money;

        for(int i = 1; i <= count; i++){
            money -= price*i;
        }
        if(money>=0){
            System.out.println("부족하지 않음 money = " + money);
            return;
        }
        System.out.println("money*(-1) = " + money * (-1));


    }
}
