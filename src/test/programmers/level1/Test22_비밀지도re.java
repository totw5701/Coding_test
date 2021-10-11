package test.programmers.level1;

import java.util.Arrays;

public class Test22_비밀지도re {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        String[] result = new String[n];
        for(int i = 0 ; i < n ; i++){
            result[i] = toBinary(arr1[i]|arr2[i], n).replace("1", "#").replace("0", " ");
            System.out.println("result[i] = " + result[i]);
        }
    }
    public static String toBinary(int num, int length){
        StringBuilder binary = new StringBuilder();
        for(int i = 0; i < length; i++){
            binary.append(num%2);
            num = num/2;
        }
        String string = binary.reverse().toString();
        return string;
    }

}
