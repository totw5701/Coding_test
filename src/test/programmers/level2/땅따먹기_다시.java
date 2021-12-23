package test.programmers.level2;

public class 땅따먹기_다시 {

    public static int solution(int[][] land) {

        int length = land.length;

        for (int i = 1; i < length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        return Math.max(Math.max(land[length - 1][0], land[length - 1][1]), Math.max(land[length - 1][2], land[length - 1][3]));

    }



    public static void main(String[] args) {

    }
}
