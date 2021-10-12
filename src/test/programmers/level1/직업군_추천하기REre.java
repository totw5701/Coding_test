package test.programmers.level1;

import java.util.Arrays;

public class 직업군_추천하기REre {
    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"};

        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7, 5, 5};


        String[] jobs = new String[table.length];
        int[] scores = new int[table.length];
        for(int i = 0; i < languages.length ; i++){
            for(int j = 0; j < table.length ; j++){
                String[] langList = table[j].split(" ");
                jobs[j] = langList[0];
                int idx = Arrays.asList(langList).indexOf(languages[i]);
                if(idx > -1) scores[j]+=(6-idx)*preference[i];
            }
        }

        int job = 0;
        int maxScore = 0;
        for(int i = 0; i<scores.length; i++){
            if(scores[i] > maxScore){
                maxScore = scores[i];
                job = i;
            }else if (scores[i] == maxScore){
                int i1 = jobs[i].charAt(0) - '0';
                int i2 = jobs[job].charAt(0) - '0';
                job = (i1<i2)?i:job;
            }
        }

        System.out.println("splitedTable = " + jobs[job]);
        System.out.println("maxScore = " + maxScore);

    }
}
