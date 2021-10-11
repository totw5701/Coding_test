package test.programmers.level1;

import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};

        int numOfType = 1;
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length-1 ; i ++){
            if(nums[i] != nums[i+1]){
                numOfType++;
            }
        }

        int answer = 0;
        if(numOfType >= nums.length/2) answer=nums.length/2;
        else if(numOfType < nums.length/2) answer=numOfType;

        System.out.println("answer = " + answer);
    }
}
