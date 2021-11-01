package test.programmers.note;

import java.util.Arrays;

public class 문자열_정렬 {



    public static void main(String[] args) {
        String[] arr = {"가나다", "가나", "다라마바", "하가나다"};

        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
