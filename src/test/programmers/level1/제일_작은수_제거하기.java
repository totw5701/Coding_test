package test.programmers.level1;

import java.util.*;

public class 제일_작은수_제거하기 {

    public static int[] minRemover(int[] arr){
        if(arr.length == 1){
            return new int[]{-1};
        }

        int[] answer = new int[arr.length-1];

        int min = arr[0];
        int idx = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < min){
                idx = i;
            }
        }

        System.arraycopy(arr, 0, answer, 0, idx);
        System.arraycopy(arr, idx + 1, answer, idx, answer.length - idx);
        return answer;
    }

    public static int[] minRemoverV2(int[] arr){
        if(arr.length == 1){
            return new int[]{-1};
        }
        List<Integer> arrList = new ArrayList<>();
        for (int j : arr) {
            arrList.add(j);
        }
        Integer min = Collections.min(arrList);
        arrList.remove(min);
        return arrList.stream().mapToInt(i -> i).toArray();
    }

    public static int[] minRemoverV3(int[] arr){
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    public static void main(String[] args) {
        int[] n = {3,4,2,1,5};
        int[] ints = minRemoverV2(n);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}
