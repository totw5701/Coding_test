package test.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,7,9,7,3,4,7,2,7,6,5,8,9};
        String hand = "left";


        int[] leftLoc ={0,3};
        int[] rightLoc = {2,3};
        String answer = "";

        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer+='L';
                leftLoc[0] = 0;
                leftLoc[1] = (int)(numbers[i]/3);
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer+='R';
                rightLoc[0] = 2;
                rightLoc[1] = (int)(numbers[i]/3) - 1;
            }else{
                // 거리 계산
                int[] numberLoc = {1 ,(int)(numbers[i]/3)};
                if(numbers[i] == 0){
                    numberLoc[1] = 3;
                }

                int leftDis = Math.abs(leftLoc[1] - numberLoc[1]) + Math.abs(leftLoc[0] - numberLoc[0]);
                int rightDis = Math.abs(rightLoc[1] - numberLoc[1]) + Math.abs(rightLoc[0] - numberLoc[0]);

                if(leftDis > rightDis){
                    rightLoc = numberLoc;
                    answer+= 'R';
                }else if (leftDis < rightDis){
                    leftLoc = numberLoc;
                    answer+='L';
                }else{
                    if(hand.equals("left")){
                        leftLoc = numberLoc;
                        answer+='L';
                    }else if(hand.equals("right")){
                        rightLoc = numberLoc;
                        answer+= 'R';
                    }
                }
            }
        }
    }

}
