package test.programmers.level2;

public class 타겟_넘버 {

    public static int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private static int dfs(int[] numbers, int target, int depth, int sum) {
        int matchCount = 0;

        if (depth == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        matchCount += dfs(numbers, target, depth + 1, sum + numbers[depth]);
        matchCount += dfs(numbers, target, depth + 1, sum - numbers[depth]);
        return matchCount;
    }

    public static void main(String[] args) {

    }


}
