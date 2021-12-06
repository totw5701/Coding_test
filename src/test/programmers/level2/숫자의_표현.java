package test.programmers.level2;

public class 숫자의_표현 {

    public static int solution(int n) {


        int count = 0;

        for (int str = 1; str <= n / 2; str++) {

            for (int end = str + 1; end <= n / 2 + 1; end++) {

                int sum = sum(str, end);
                if (sum == n) {
                    count++;
                    break;
                } else if (sum > n) {
                    break;
                }

            }

        }

        return count + 1;
    }

    public static int sum(int str, int end) {

        return (end - str + 1) * (str + end) / 2;
    }

    public static void main(String[] args) {

    }
}
