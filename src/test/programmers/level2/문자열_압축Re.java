package test.programmers.level2;

import java.util.ArrayList;

public class 문자열_압축Re {

    public static int compress(String s) {

        StringBuilder sb = new StringBuilder();
        int min = s.length();
        int count = 1;

        for (int i = 1; i <= s.length() / 2; i++) {
            sb.setLength(0);
            ArrayList<String> arrList = new ArrayList<>();
            for (int k = 0; k <= s.length()  ; k = k + i) {
                arrList.add(s.substring(k, Math.min(s.length(), k + i)));
            }

            for (int j = 0; j < arrList.size()-1; j++) {
                if(arrList.get(j).equals(arrList.get(j+1))){
                    count++;
                }else{
                    if(count != 1) {
                        sb.append(count);
                        count = 1;
                    }
                    sb.append(arrList.get(j));
                }
            }

            if(count != 1){
                sb.append(count);
                sb.append(arrList.get(arrList.size()-1));
            }else{
                sb.append(arrList.get(arrList.size()-1));
            }
            min = Math.min(min, sb.length());
        }


        return min;
    }


    public static void main(String[] args) {
        String s = "ababcdcdababcdcd";
        int compress = compress(s);
        System.out.println("compress = " + compress);


    }
}
