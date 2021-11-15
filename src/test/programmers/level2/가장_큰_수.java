package test.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 가장_큰_수 {

    public static String basic(int[] numbers) {

        ArrayList<String> arr = new ArrayList<>();

        for (int number : numbers) {
            arr.add(Integer.toString(number));
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.length() == o2.length()){
                    return Integer.parseInt(o2) - Integer.parseInt(o1);
                } else {
                    int min = Math.min(o1.length(), o2.length());
                    int o11 = Integer.parseInt(o1.substring(0, min));
                    int o22 = Integer.parseInt(o2.substring(0, min));

                    if (o11 != o22) {
                        return o22 - o11;
                    } else {
                        if (o1.length() > o2.length()) {
                            return (o1.charAt(0) + '0') - (o1.charAt(min) + '0');
                        } else if (o1.length() < o2.length()){
                            return (o1.charAt(0) + '0') -(o2.charAt(min) + '0');
                        }
                    }
                }
                return 0;
            }
        });

        System.out.println("arr = " + arr);

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String basicV2(int[] numbers) {

        ArrayList<String> arr = new ArrayList<>();

        for (int number : numbers) {
            arr.add(Integer.toString(number));
        }


        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o1o2 = Integer.parseInt(o1 + o2);
                int o2o1 = Integer.parseInt(o2 + o1);

                if (o1o2 > o2o1) {
                    return -1;
                } else if (o1o2 < o2o1) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println("arr = " + arr);

        if (arr.get(0).equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }


        return sb.toString();
    }

    public static void main(String[] args) {

        int[] numbers = {23, 232, 21, 212};

        String basic = basicV2(numbers);
        System.out.println("basic = " + basic);

    }
}
