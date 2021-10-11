package test.programmers.level1;

public class 가운데_글자 {
    public static void main(String[] args) {
        String s = "abcdde";

        int length = s.length();
        if(length%2 == 1){
            String substring = s.substring(s.length() / 2, s.length() / 2);
        }else{
            s.substring(s.length()/2-1, s.length()/2);
        }


    }
}
