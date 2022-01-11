package test.programmers.level2;

import java.util.*;

public class 메뉴_리뉴얼 {

    public static String[] solution(String[] orders, int[] course) {


        List<String> answer = new ArrayList<>();

        int longest = 0;
        for (int i : course) {
            longest = Math.max(longest, i);
        }

        for (int pickNum : course) {

            Map<String, Integer> menus = new HashMap<>();

            // 조합 뽑기.
            for (String order : orders) {
                Set<String> comb = combination(order, pickNum);


                // menu Map에 넣기
                for (String s : comb) {
                    if (menus.containsKey(s)) {
                        menus.put(s, menus.get(s) + 1);
                    } else {
                        menus.put(s, 1);
                    }
                }

            }

            List<String> topMenus = topChoice(menus);
            for (String topMenu : topMenus) answer.add(topMenu);


            System.out.println("menus = " + menus);
            System.out.println("answer = " + answer);
        }

        answer.sort(Comparator.naturalOrder());
        return answer.toArray(new String[0]);
    }

    public static List<String> topChoice(Map<String, Integer> menus) {
        List<String> topMenus = new ArrayList<>();

        int topNum = 0;
        for (String key : menus.keySet()) {
            if (menus.get(key) > topNum) {
                topNum = menus.get(key);
            }
        }

        if(topNum <= 1) return topMenus;

        for (String key : menus.keySet()) {
            if (menus.get(key) == topNum) {
                topMenus.add(key);
            }
        }


        return topMenus;
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

        System.out.println(Arrays.toString(solution));


    }
}
