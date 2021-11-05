package test.programmers.level2;

import java.util.*;

public class 큰_수_만들기 {

    public static String basic(String number, int k) {

        char[] arr = number.toCharArray();
        int length = number.length() - k;

        Map<Integer, Integer> map = new HashMap<>();

        while (map.size() < length) {
            int max = 0;
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i] - '0';
                if (num > max) {
                    max = num;
                    idx = i;
                }
            }
            map.put(idx, max);
            arr[idx] = '0';
        }

        Object[] keySet = map.keySet().toArray();
        Arrays.sort(keySet);

        StringBuilder sb = new StringBuilder();

        for (Object o : keySet) {
            sb.append(map.get(o));
        }

        return sb.toString();
    }

    public static String basicV2(String number, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            list.add(number.charAt(i)-'0');
        }

        int length = number.length() - k;
        StringBuilder sb = new StringBuilder();

        while(sb.length() < number.length() - k) {
            int idx = numFind(list, length);
            System.out.println("idx = " + idx);
            sb.append(list.get(idx));
            length--;

            ArrayList<Integer> newList = new ArrayList<>();
            for (int i = idx + 1; i < list.size(); i++) {
                newList.add(list.get(i));
            }
            System.out.println("newList = " + newList);
            list = newList;
        }

        return sb.toString();
    }

    public static int numFind(ArrayList<Integer> arr, int length){
        System.out.println("큰_수_만들기.numFind");
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == i && arr.size() - j >= length) {
                    // 숫자 사용
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    return j;
                } else if (arr.get(j) == i && arr.size() - j < length) {
                    break;
                }

            }
        }
        return 0;
    }

    public static String basicV3(String number, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            list.add(number.charAt(i)-'0');
        }

        int length = number.length() - k;
        StringBuilder sb = new StringBuilder();

        int startIdx = 0;
        while(sb.length() < number.length() - k) {
            int idx = numFindV2(list, length, startIdx);
            System.out.println("idx = " + idx);
            sb.append(list.get(idx));
            startIdx = idx + 1;
            length--;
        }

        return sb.toString();
    }

    public static int numFindV2(ArrayList<Integer> arr, int length, int startIdx){
        System.out.println("큰_수_만들기.numFind");
        for (int i = 9; i >= 0; i--) {
            for (int j = startIdx; j < arr.size(); j++) {
                if (arr.get(j) == i && arr.size() - j >= length) {
                    // 숫자 사용
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    return j;
                } else if (arr.get(j) == i && arr.size() - j < length) {
                    break;
                }

            }
        }
        return 0;
    }

    public static void main(String[] args) {

        String number = "10475810930578415080185679";
        int k = 6;

        String basic = basicV3(number, k);
        System.out.println("basic = " + basic);

    }
}
