package test.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 삼각_달팽이 {

    public static int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        int[][] graph = mkGraph(n);

        for (int[] ints : graph) {
            System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        }


        for (int[] ints : graph) {
            for (int anInt : ints) {
                list.add(anInt);
            }
        }


        return list.stream().mapToInt(i -> i).toArray();
    }


    public static int[][] mkGraph(int n) {

        int[][] graph = new int[n][];

        for (int i = 1; i <= n; i++) {

            int[] arr = new int[i];

            graph[i-1] = arr;

        }

        int num = 1;
        int size = n;
        int depth = 0;

        while (size >= 3) {

            for (int i = 0; i < size - 1; i++) {
                graph[depth * 2 + i][depth] = num++;
            }

            for (int i = 0; i < size - 1; i++) {
                graph[depth * 2 + size - 1][depth + i] = num++;
            }

            for (int i = 0; i < size - 1; i++) {
                graph[depth * 2 + size - 1 - i][graph[depth * 2 + size - 1 - i].length - 1 - depth] = num++;
            }

            depth++;
            size = size - 3;
        }

        if (size == 2) {
            graph[depth * 2][depth] = num++;
            graph[depth * 2 + 1][depth] = num++;
            graph[depth * 2 + 1][depth + 1] = num++;

        } else if (size == 1) {
            graph[depth * 2][depth] = num++;
        }


        return graph;
    }

    public static void main(String[] args) {
        solution(8);
    }
}
