package test.programmers.level1;

public class 상호평가re {
    public static void main(String[] args) {
        int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};

        int length = scores.length;
        String grades = "";
        // 학생 순회
        for(int i = 0; i < length; i++){
            int max = 0;
            int min = 100;
            int sum = 0;
            int cnt = 0;
            int isDup = 0;
            // 받은 점수 순회
            for(int j = 0; j < length; j++){
                sum+=scores[j][i];
                cnt++;
                min = Math.min(min, scores[j][i]);
                max = Math.max(max, scores[j][i]);
                if(scores[j][i] == scores[i][i]){
                    isDup++;
                }
            }

            if(scores[i][i] == max && isDup == 1){
                sum -= scores[i][i];
                cnt--;
            }else if(scores[i][i] == min && isDup == 1){
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
