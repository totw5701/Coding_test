package test.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 서울에서_김서방_찾기 {
    public static String basic(String[] seoul){
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("kim")) return "김서방은 "+i+"에 있다";
        }
        return null;
    }

    public static String list(String[] seoul){
        int idx = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+idx+"에 있다";
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        String basic = basic(seoul);
        System.out.println("basic = " + basic);

        String list = list(seoul);
        System.out.println("list = " + list);

    }
}
