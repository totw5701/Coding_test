package test.baekjoon;

import java.util.Scanner;

public class 나머지 {

    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;

        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
