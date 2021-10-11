package test.programmers.level1;

import java.util.Arrays;

public class 다트_게임 {
    public static void main(String[] args) {
        String dartResult = "1D2S#10S";

        int[] result = new int[3];
        int idx = -1;
        for(int i = 0; i < dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                if(dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0'){
                    idx++;
                    result[idx] = 10;
                    i++;
                }else{
                    idx++;
                    result[idx] = dartResult.charAt(i) - '0';
                }
            }else {
                switch (dartResult.charAt(i)){
                    case 'D':
                        result[idx] = result[idx]*result[idx];
                        break;
                    case 'T':
                        result[idx] = result[idx]*result[idx]*result[idx];
                        break;
                    case '*':
                        result[idx] = result[idx]*2;
                        if(idx>=1){
                            result[idx-1] = result[idx-1]*2;
                        }
                        break;
                    case '#':
                        result[idx] = result[idx]*(-1);
                }
            }
        }

        int answer = Arrays.stream(result).sum();
        System.out.println("answer = " + answer);
    }
}
