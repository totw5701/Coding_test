package test.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class 영어_끝말잊기 {

    public static int[] solution(int n, String[] words) {

        Set<String> set = new HashSet<>();
        char lastAl = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            System.out.println("word = " + word);

            if (set.contains(word) || word.charAt(0) != lastAl) {
                return new int[]{i % n + 1, i / n + 1};
            }

            lastAl = word.charAt(word.length() - 1);
            set.add(word);
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {

        String[] s = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};

        int[] solution = solution(3,s);
        System.out.println("solution = " + solution[0]);
        System.out.println("solution[1] = " + solution[1]);

    }
}
