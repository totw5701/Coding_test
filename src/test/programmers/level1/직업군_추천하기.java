package test.programmers.level1;

import java.util.Arrays;

public class 직업군_추천하기 {
    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"};

        String[] language = {"PYTHON", "C++", "SQL"};
        int[] preference = {7, 5, 5};

        String[][] splitedTable = new String[5][6];

        for(int i = 0; i < table.length; i++){
            splitedTable[i] = table[i].split(" ");
            System.out.println("Arrays.toString(splitedTable = " + Arrays.toString(splitedTable[i]));
        }

        int job = 0;
        int maxScore = 0;
        for(int i = 0; i < language.length ; i++){
            for(int j = 0; j < table.length ; j++){
                for(int k = 0; k < 6 ; k++){
                    if(language[i].equals(splitedTable[j][k])){
                        if((6-k)*preference[i] > maxScore){
                            job = j;
                            maxScore = (6-k)*preference[i];
                        }else if((6-k)*preference[i] == maxScore){
                            int i1 = splitedTable[j][0].charAt(0) - '0';
                            int i2 = splitedTable[job][0].charAt(0) - '0';
                            if(i1 < i2){
                                job = j;
                            }
                        }
                    }
                    System.out.println("splitedTable[job][0] = " + splitedTable[job][0]);
                    System.out.println("maxScore = " + maxScore);
                }
            }
        }




    }
}
