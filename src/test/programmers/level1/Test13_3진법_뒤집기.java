package test.programmers.level1;

import java.util.Arrays;

public class Test13_3진법_뒤집기 {
    public static void main(String[] args) {
        int n = 26;

        int top = 0;
        int[] ternary = new int[20];

        while(true) {
        int threeMult = 1;

            if(n < 3){
                ternary[0] = n;
                break;
            }

            for (int i = 1; i < 200; i++) {
                threeMult *= 3;
                if (threeMult == n) {
                    n-=threeMult;
                    ternary[i]++;
                    if(top < i){
                        top = i;
                    }
                    break;
                } else if (threeMult > n) {
                    n -= threeMult/3;
                    ternary[i - 1]++;
                    if(top < i){
                        top = i;
                    }
                    break;
                }
            }
        }

        System.out.println("ternary = " + Arrays.toString(ternary));
        System.out.println("top = " + top);

        int decimal = 0;
        for(int i = 0 ; i <= top; i ++){
            int threeMult = 1;
            for(int j = 1; j < top-i ; j ++){
                threeMult*=3;
            }
            decimal += threeMult*ternary[i];
        }

        System.out.println("decimal = " + decimal);


        // 3의 거듭제곱중 n보다 큰 값 찾기.
        // 찾은 거듭제곱/3 을 n에서 빼기.
        // 그 거듭제곱 수 배열에 1 더하기.
        // 갱신된 n으로 위 반복


    }
}
