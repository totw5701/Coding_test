package test.programmers.level1;

import java.util.Arrays;

public class 상호평가 {
    public static void main(String[] args) {
        int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};

        int length = scores.length;
        String grades = "";
        // 학생 순회
        for(int i = 0; i < 2; i++){
            int max = 0;
            int min = 100;
            int sum = 0;
            int cnt = 0;
            // 받은 점수 순회
            for(int j = 0; j < length; j++){
                sum+=scores[j][i];
                cnt++;
                min = Math.min(min, scores[j][i]);
                max = Math.max(max, scores[j][i]);
            }
            // 최고 최저점 중복 유무 확인
            int maxDup = -1;
            int minDup = -1;
            for(int j = 0; j < length; j++){
                if(scores[j][i] == max){
                    maxDup++;
                }
                if(scores[j][i] == min){
                    minDup++;
                }
            }

            if(scores[i][i] == max && maxDup < 1){
                sum -= scores[i][i];
                cnt--;
            }else if(scores[i][i] == min && minDup < 1){
                sum -= scores[i][i];
                cnt--;
            }
            grades+=gradeCal(sum/cnt);

        }
        System.out.println("grades = " + grades);
    }

    public static char gradeCal(int score){
        if(score >= 90){
            return 'A';
        }else if (score >= 80){
            return 'B';
        }else if (score >= 70){
            return 'C';
        }else if (score >= 50){
            return 'D';
        }
        return 'F';
    }
}
