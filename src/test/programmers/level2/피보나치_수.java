package test.programmers.level2;

import java.util.ArrayList;

public class 피보나치_수 {

    public static int init(int n) {

        int fibonacci = fibonacci(n);
        return fibonacci % 1234567;
    }

    public static int fibonacci(int idx) {

        if (idx == 0) {
            return 0;
        }

        if (idx == 1) {
            return 1;
        }

        return fibonacci(idx - 1) + fibonacci(idx - 2);

    }



    public static int initV2(int n) {

        Fibonacci fibonacci = new Fibonacci();

        Long num = fibonacci.fibonacci(n);
        System.out.println("num = " + num);
        return (int) (num % 1234567);
    }


    public static class Fibonacci {

        public ArrayList<Long> list = new ArrayList<>();

        public Long fibonacci(int n) {

            for (int i = 0; i < n + 1; i++) {
                list.add(-1L);
            }

            return logic(n);
        }

        public Long logic(int idx) {

            if (idx == 0) {
                return 0L;
            }

            if (idx == 1) {
                return 1L;
            }

            if (this.list.get(idx) != -1) {
                return list.get(idx);
            }

            Long num = (logic(idx - 1) % 1234567 + logic(idx - 2) % 1234567) % 1234567;
            list.set(idx, num);
            return num;
        }
    }

    public static void main(String[] args) {

        int n = 200;
        int init = initV2(n);
        System.out.println("init = " + init);

        // 0 1 1 2 3 5
    }
}
