package test.programmers.level2;

public class 예상_대진표 {

    public static int solution(int n, int a, int b) {

        int idx = 0;
        while (a != b) {
            a = (int) Math.ceil(a / 2.0);
            b = (int) Math.ceil(b / 2.0);
            idx++;
        }
        return idx;
    }

    public static void main(String[] args) {

        int solution = solution(8, 4, 7);
        System.out.println("solution = " + solution);
    }
}
