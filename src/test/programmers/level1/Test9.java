package test.programmers.level1;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};


        int[] students = new int[n];
        for(int i = 0 ; i < students.length ; i++){
            students[i] = 1;
        }
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

        for(int i = 0 ; i < reserve.length ; i ++){
            students[reserve[i]-1]++;
        }
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

        for(int i = 0 ; i < lost.length; i++){
            students[lost[i]-1]--;
        }
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

        if(students[0]==0 && students[1]==2){
            students[0]++;
            students[1]--;
        }
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

        for(int i = 1 ; i < students.length-1 ; i++){
            if(students[i]==0 && students[i-1]==2){
                students[i-1]--;
                students[i]++;
            }
            if(students[i]==0 && students[i+1]==2){
                students[i+1]--;
                students[i]++;
            }
        }
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

        if(students[students.length-1] == 0 && students[students.length-2] == 2){
            students[students.length-1]++;
            students[students.length-2]--;
        }
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

        int count = 0;
        for(int i = 0 ; i < students.length ; i++){
            if(students[i] == 1 || students[i] == 2){
                count++;
            }else if (students[i] == 0){

            }else{
                System.out.println("error");
            }
        }

        System.out.println("count = " + count);


    }
}
