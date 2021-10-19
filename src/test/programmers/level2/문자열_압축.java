package test.programmers.level2;

public class 문자열_압축 {

    public static StringBuilder compress(String s) {
        for (int i = 2; i < 3; i++) {

            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (int j = 0; j < s.length() - i; j++) {

                String template = s.substring(j, j+i);
                System.out.println("template = " + template);
                if(s.substring(j+i, j+i+i).equals(template)){
                    count++;
                    System.out.println("count = " + count);
                    j += i -1;
                }else{
                    sb.append(count+1);
                    sb.append(template);
                    System.out.println("template = " + template);

                    j += i;

                    sb.append(s.charAt(j));
                    System.out.println("s.chatA = " + s.charAt(j));
                    count = 0;
                    System.out.println("sb = " + sb);
                }
            }

            return sb;
        }
        return new StringBuilder();
    }

    public static StringBuilder compressRe(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 2;
        int count = 1;
        String template = "";
        boolean dup = false;
        for(int j = 0; j < s.length() - i -i; j++){
            if (!s.substring(j, j + i).equals(s.substring(j + i, j + i + i))) {
                sb.append(s.charAt(j));
            }else{
                template = s.substring(j, j+i);
                count++;
                j = j + i-1;
            }
            if (!s.substring(j, j + i).equals(s.substring(j + i, j + i + i))
                && count != 1) {
                sb.append(count);
                count = 1;
                template = "";
            }
        }
        return sb;
    }

    public static int compressReRe(String s) {


        int min = s.length();
        for(int i = 1; i < s.length() / 2; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            String template = "";
            boolean dup = false;

            for(int j = 0; j < s.length() - i; j++){
                if (!s.substring(j, j + i).equals(s.substring(j + i, j + i + i))) {
                    sb.append(s.charAt(j));
                }else{
                    template = s.substring(j, j+i);
                    count++;
                    j = j + i-1;
                }
                if (!s.substring(j, j + i).equals(s.substring(j + i, j + i + i))
                        && count != 1) {
                    sb.append(count);
                    count = 1;
                    template = "";
                }
            }

            sb.append(s.substring(s.length()- i*2, s.length()));

            if(sb.length() < min){
                min = sb.length();
            }
            System.out.println("sb = " + sb);
        }
        System.out.println("min = " + min);
        return min;
    }

    public static StringBuilder compressReReRe(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 2;
        int count = 1;
        String template = "";
        boolean dup = false;
        for(int j = 0; j < s.length() - i -i; j++){
            if (!s.substring(j, j + i).equals(s.substring(j + i, j + i + i))) {
                sb.append(s.charAt(j));
            }else{
                template = s.substring(j, j+i);
                count++;
                j = j + i-1;
            }
            if (!s.substring(j, j + i).equals(s.substring(j + i, j + i + i))
                    && count != 1) {
                sb.append(count);
                count = 1;
                template = "";
            }
        }
        return sb;
    }


    public static void main(String[] args) {
        String s = "ababcdcdababcdcd";
        StringBuilder compress = compressReReRe(s);
        System.out.println("compress = " + compress);
    }
}
