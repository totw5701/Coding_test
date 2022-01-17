package test.programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 카카오프렌즈_컬러링북 {

    private static int[] dx = {-1,1,0,0};
    private static int[] dy = {0,0,-1,1};
    private static int tempArea = 0;

    public static int[] solution(int m, int n, int[][] picture) {

        int x = 0;
        int y = 0;
        int max = 0;
        int count = 0;

        boolean[][] check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if(picture[i][j] == 0 || check[i][j]) continue;

                int area = removingCal(i, j, picture, check);
                max = Math.max(area, max);
                count++;
                tempArea = 0;
            }
        }

        int[] answer = {count, max};
        return answer;
    }

    public static int removingCal(int x, int y, int[][] picture, boolean[][] check) {

        if(check[x][y]) return 0;

        check[x][y] = true;
        tempArea++;


        for (int z = 0; z < 4; z++) {
            int nx = x + dx[z];
            int ny = y + dy[z];

            if (nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length) continue;

            if(picture[x][y] == picture[nx][ny] && !check[nx][ny]) {
                removingCal(nx, ny, picture, check);
            }
        }


        return tempArea;
    }

    public static void main(String[] args) {

        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        for (int[] ints : picture) {
            System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        }
        
        int[] solution = solution(m, n, picture);

        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));

    }
}
