package test.programmers.level2;

public class 괄호_변환 {

    public static String init(String p) {
        if (p.length() == 0) return "";
        String[] sep = separate(p);

        if (isCorrect(sep[0])) {
            System.out.println("correct");
            String result = init(sep[1]);

            String str = sep[0] + result;
            return str;
        } else {
            System.out.println(" wrong ");
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(init(sep[1]));
            sb.append(")");

            for (int i = 1; i < sep[0].length() - 1; i++) {
                if(sep[0].charAt(i) == '(') sb.append(")");
                else sb.append("(");
            }
            return sb.toString();
        }
    }


    public static String[] separate(String p) {

        if (p.length() == 0) return null;

        int n = 0;

        if(p.charAt(0) == '(') n++;
        else n--;

        for (int i = 1; i < p.length(); i++) {
            if(p.charAt(i) == '(') n++;
            else n--;

            if (n == 0) return new String[]{p.substring(0,i+1), p.substring(i+1, p.length())};
        }
        return null;
    }

    public static boolean isCorrect(String p) {

        int n = 0;

        for (int i = 0; i < p.length(); i++) {
            if(p.charAt(i) == '(') n++;
            else n--;

            if (n < 0) return false;
        }

        return true;
    }



    public static void main(String[]args) {

        String s = init("))((()");


        System.out.println("s = " + s);


    }
}
