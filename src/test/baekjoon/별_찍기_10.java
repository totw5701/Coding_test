package test.baekjoon;

import java.util.Scanner;

public class 별_찍기_10 {

    public static StringBuilder patterning(int n) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("*");
        }

        sb.append("\n");

        for (int i = 0; i < n - 2; i++) {
            sb.append("*");

            for (int j = 0; j < n - 2; j++) {
                sb.append(" ");
            }

            sb.append("*");
            sb.append("\n");
        }

        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        return sb;
    }

    public static void appendPattern(int n) {
        StringBuilder sb = new StringBuilder();
        StringBuilder patterning = patterning(n / 3);

        for (int i = 0; i < 3; i++) {
            sb.append("");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder patterning = patterning(N);



    }
}
