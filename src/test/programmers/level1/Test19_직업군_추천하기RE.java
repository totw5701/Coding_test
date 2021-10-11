package test.programmers.level1;

import java.util.Arrays;

public class Test19_직업군_추천하기RE {
    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"};

        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7, 5, 5};

        String[][] splitedTable = new String[5][6];

        for(int i = 0; i < table.length; i++){
            splitedTable[i] = table[i].split(" ");
        }

        int[] scores = new int[table.length];
        for(int i = 0; i < languages.length ; i++){
            for(int j = 0; j < table.length ; j++){
                for(int k = 0; k < 6 ; k++){
                    if(languages[i].equals(splitedTable[j][k])){
                        scores[j]+=(6-k)*preference[i];
                    }
                }
            }
        }

        int job = 0;
        int maxScore = 0;
        for(int i = 0; i<scores.length; i++){
            if(scores[i] > maxScore){
                maxScore = scores[i];
                job = i;
            }else if (scores[i] == maxScore){
                int i1 = splitedTable[i][0].charAt(0) - '0';
                int i2 = splitedTable[job][0].charAt(0) - '0';
                job = (i1<i2)?i:job;
            }
        }

        System.out.println("splitedTable = " + splitedTable[job][0]);
        System.out.println("maxScore = " + maxScore);



    }
}
