package test.baekjoon;

import java.util.Scanner;

public class 팩토리얼 {

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = factorial(n);
        System.out.println(answer);
    }
}
