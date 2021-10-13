package test.programmers.level1;

public class 시저_암호 {

    public static String basic(String s, int n){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append(' ');
            }else if(65 <= s.charAt(i) && s.charAt(i) <= 90){
                int i1 = 65 + ((s.charAt(i) - 65) + n % 26) % 26;
                sb.append((char)i1);
            }else if(97 <= s.charAt(i) && s.charAt(i) <= 122){
                int i1 = 97 + ((s.charAt(i) - 97) + n % 26) % 26;
                sb.append((char)i1);
            }
        }
        return sb.toString();
    }

    public static String basicRefract(String s, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            n = n %26;
            char ch = s.charAt(i);

            if(ch == ' '){
                sb.append(' ');
            }else if(Character.isLowerCase(ch)){
                char newCh = (char) ('a' + ((ch - 'a') + n) % 26);
                sb.append(newCh);
            }else if(Character.isUpperCase(ch)){
                char newCh = (char) ('A' + ((ch - 'A') + n) % 26);
                sb.append(newCh);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;

        String basic = basic(s, n);
        System.out.println("basic = " + basic);
    }
}
