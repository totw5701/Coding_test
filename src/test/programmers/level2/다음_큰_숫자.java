package test.programmers.level2;

import java.util.Arrays;

public class 다음_큰_숫자 {

    public static int basic(int n){

        StringBuilder binSb = decToBin(n);
        char[] bin = binSb.toString().toCharArray();

        System.out.println("binSb = " + binSb);

        for (int i = binSb.length() - 1; i >= 0; i--) {
            if (binSb.charAt(i) == '0') {
                continue;
            }

            if (i == 0) {
                binSb.replace(0,1, "10");

                String substring = binSb.substring(2);

                int count = 0;
                for (int j = 0; j < substring.length(); j++) {
                    if (substring.charAt(j) == '1') {
                        count++;
                    }
                }

                StringBuilder restSb = new StringBuilder();
                for (int j = 0; j < substring.length(); j++) {
                    if (j < count) {
                        restSb.append('1');
                        continue;
                    }
                    restSb.append('0');
                }
                restSb.reverse();

                binSb.replace(2, binSb.length(), restSb.toString());


                return binToDec(binSb);
            }

            if (binSb.charAt(i - 1) == '1') {
                continue;
            }

            binSb.replace(i - 1, i + 1, "10");
            System.out.println("binSb = " + binSb);


            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                sb.append(binSb.charAt(j));
            }

            for (int j = bin.length - 1; j > i; j--) {
                sb.append(binSb.charAt(j));
            }

            return binToDec(sb);
        }


        return 1;
    }

    public static int basicV2(int n) {
        StringBuilder binSb = decToBin(n);
        char[] arr = binSb.toString().toCharArray();

        System.out.println("binSb = " + binSb);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '0') {
                continue;
            }

            if (i == 0) {
                arr[i] = '0';

                int count = 0;

                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == '1') {
                        count++;
                        arr[j] = '0';
                    }
                }

                for (int j = 0; j < count; j++) {
                    arr[arr.length - 1 - j] = '1';
                }

                StringBuilder sb = new StringBuilder();
                sb.append('1');
                for (char c : arr) {
                    sb.append(c);
                }
                System.out.println("sb = " + sb);
                return binToDec(sb);
            }

            if (arr[i - 1] == '1') {
                continue;
            }

            arr[i] = '0';
            arr[i - 1] = '1';

            int count = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] == '1') {
                    count++;
                    arr[j] = '0';
                }
            }


            for (int j = 0; j < count; j++) {
                arr[arr.length - 1 - j] = '1';
            }

            StringBuilder sb = new StringBuilder();
            for (char c : arr) {
                sb.append(c);
            }

            System.out.println("sb = " + sb);

            return binToDec(sb);


        }




        return 1;
    }


    public static StringBuilder decToBin(int n ){
//        StringBuilder sb = new StringBuilder();
//
//        while (n > 0) {
//            sb.insert(0, n % 2);
//            n = n / 2;
//        }
//
//        return sb;

        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        return sb;
    }

    public static int binToDec(StringBuilder sb) {
//        char[] arr = sb.toString().toCharArray();
//
//        int decimal = 0;
//        for (int i = 0; i < arr.length; i++) {
//            decimal += (arr[i] - '0') * Math.pow(2, arr.length -1 - i);
//        }
//        return decimal;

        return Integer.parseInt(sb.toString(), 2);

    }



    public static void main(String[] args) {
        int n = 78;

        int basic = basicV2(n);
        System.out.println("basic = " + basic);


    }
}
