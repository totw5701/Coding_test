package test.programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class H_index {

    public static int basic(int[] citations){
        Arrays.sort(citations);
        int[] arr = new int[citations.length];
        for (int i = 0; i < citations.length; i++) {
            arr[i] = citations[citations.length - 1 - i];
        }

        int h = arr[0];
        while (h > 0) {
            int count = arr.length;
            System.out.println("count = " + count);
            System.out.println("h = " + h);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < h) {
                    count = i;
                    System.out.println("count ddd = " + count);;
                    break;
                }
            }

            if (count >= h) {
                return h;
            }

            h--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] citations = {6,6,6,6,6,1};

        // 44444433332211100000

        int basic = basic(citations);
        System.out.println("basic = " + basic);
    }
}
