package test.programmers.note;

import java.util.Arrays;

public class 문자열_정렬 {



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Arrays.parallelSort(arr);

        System.out.println("arr = " + Arrays.toString(arr));

    }
}
