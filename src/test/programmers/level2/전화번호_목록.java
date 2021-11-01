package test.programmers.level2;

import java.util.*;
import java.util.regex.Pattern;

public class 전화번호_목록 {

    public static boolean phone_bookV1(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book.length; j++) {
                if (i == j) {
                    continue;
                }
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean phone_bookV2(String[] phone_book) {

        ArrayList<String> list = new ArrayList<>();

        for (String s : phone_book) {
            list.add(s);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            String front = list.get(i);
            String rear = list.get(i + 1);
            if (front.length() > rear.length()) continue;
            if (front.equals(rear.substring(0, front.length()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean phone_bookV3(String[] phone_book) {

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            String front = phone_book[i];
            String rear = phone_book[i+1];
            if (front.length() > rear.length()) continue;
            if (front.equals(rear.substring(0, front.length()))) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String[] phone_book = {"1199999", "219", "97674223", "1195524421"};

        boolean basic = phone_bookV2(phone_book);
        System.out.println("basic = " + basic);
    }
}
