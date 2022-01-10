package test.programmers.level2;

import java.util.*;

public class 메뉴_리뉴얼 {

    public static String[] solution(String[] orders, int[] course) {

        for (String order : orders) {
            Set<String> combination = combination(order, 2);
            for (String s : combination) {
                System.out.println("s = " + s);
            }
            System.out.println();
        }

        return null;
    }

    public static Set<String> combination(String order, int pickNum) {
        Set<String> result = new HashSet<>();
        char[] array = order.toCharArray();
        boolean[] visited = new boolean[array.length];

        combinationProc(array, visited, 0, order.length(), pickNum, result);

        return result;
    }


    public static void combinationProc(char[] arr, boolean[] visited, int start, int n, int r, Set<String> result) {
        if(r == 0) {
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    list.add(arr[i]);
                }
            }
            list.sort(Comparator.naturalOrder());

            StringBuilder sb = new StringBuilder();
            for (Character ch : list) {
                sb.append(ch);
            }

            result.add(sb.toString());
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combinationProc(arr, visited, i + 1, n, r - 1, result);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {

        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};
        String[] solution = solution(orders, course);


    }
}
