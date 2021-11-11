package test.programmers.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 위장 {

    public int solution(String[][] clothes) {
        Map<String, HashSet<String>> map = new HashMap<>();

        for (String[] clothe : clothes) {
            if (map.containsKey(clothe[1])) {
                HashSet<String> set = map.get(clothe[1]);
                set.add(clothe[0]);
            } else {
                HashSet<String> set = new HashSet<>();
                set.add(clothe[0]);
                map.put(clothe[1], set);
            }
        }

        int answer = 1;
        for (String s : map.keySet()) {
            int i = map.get(s).size() + 1;
            answer *= i;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        
    }
}
