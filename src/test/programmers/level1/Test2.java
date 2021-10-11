package test.programmers.level1;

import static java.lang.Character.isDigit;

public class Test2 {
    public static void main(String[] args) {
        String s = "2three45sixseven";
        String answerS = "";

        while(true) {
            System.out.println("s = " + s);
            if(s.equals("")){
                break;
            }
            if (isDigit(s.charAt(0))) {
                answerS += s.charAt(0);
                s = s.substring(1, s.length());
            } else {
                String tempS = "";
                tempS = s.substring(0, 3);
                switch (tempS) {
                    case "zer":
                        answerS += '0';
                        s = s.substring(4, s.length());
                        break;
                    case "one":
                        answerS += '1';
                        s = s.substring(3, s.length());
                        break;
                    case "two":
                        answerS += '2';
                        s = s.substring(3, s.length());
                        break;
                    case "thr":
                        answerS += '3';
                        s = s.substring(5, s.length());
                        break;
                    case "fou":
                        answerS += '4';
                        s = s.substring(4, s.length());
                        break;
                    case "fiv":
                        answerS += '5';
                        s = s.substring(4, s.length());
                        break;
                    case "six":
                        answerS += '6';
                        s = s.substring(3, s.length());
                        break;
                    case "sev":
                        answerS += '7';
                        s = s.substring(5, s.length());
                        break;
                    case "eig":
                        answerS += '8';
                        s = s.substring(5, s.length());
                        break;
                    case "nin":
                        answerS += '9';
                        s = s.substring(4, s.length());

                }
            }
            System.out.println("answerS = " + answerS);

        }
        System.out.println("DONE answerS = " + Integer.parseInt(answerS));

    }
}
