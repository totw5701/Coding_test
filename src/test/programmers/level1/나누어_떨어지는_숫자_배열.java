package test.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] arr = {5,7,6,10};
        int divisor = 5;

        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            if(num%divisor == 0){
                list.add(num);
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        System.out.println("list = " + list);
    }
}
