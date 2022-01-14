package test.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 삼각_달팽이_refac {

    public static int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        int[][] graph = mkGraph(n);

        for (int[] ints : graph) {
            System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        }

        for (int i = 0; i < graph.length; i++) {

            int[] arr = graph[i];

            for (int j = 0; j < i + 1; j++) {
                list.add(arr[j]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }


    public static int[][] mkGraph(int n) {

        int[][] graph = new int[n][n];

        int num = 1;
        int size = n;

        int x = 0;
        int y = 0;

        while (size >= 3) {

            for (int i = 0; i < size - 1; i++) graph[y++][x] = num++;

            for (int i = 0; i < size - 1; i++) graph[y][x++] = num++;

            for (int i = 0; i < size - 1; i++) graph[y--][x--] = num++;

            x++;
            y = y + 2;
            size = size - 3;
        }

        if (size == 2) {
            graph[y++][x] = num++;
            graph[y][x++] = num++;
            graph[y][x] = num++;
        } else if (size == 1) {
            graph[y][x] = num++;
        }

        return graph;
    }

    public static void main(String[] args) {
        solution(6);
    }
}
