package test.programmers.level1;

public class 이상한_문자_만들기 {

    public static String oodString(String s){
        String[] words = s.split(" ");
        StringBuilder answer = new StringBuilder();

        for(String word: words){
            StringBuilder sb = new StringBuilder();
            if(word == "") continue;
            for(int i = 0; i < word.length(); i++){
                if(i%2 == 0){
                    sb.append(Character.toUpperCase(word.charAt(i)));
                }else{
                    sb.append(Character.toLowerCase(word.charAt(i)));
                }
            }
            answer.append(sb);
            answer.append(" ");
        }
        if(s.charAt(s.length()-1) == ' ') return answer.toString();
        return answer.substring(0, answer.length() - 1);
    }

    public static String oodStringKeepPattern(String s){

        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        for(String word : words){
            StringBuilder sb = new StringBuilder();
            if(word == "") {
                answer.append(" ");
                continue;
            }

            word += " ";
            for(int i = 0; i < word.length(); i++){
                if(i%2 == 0){
                    sb.append(Character.toUpperCase(word.charAt(i)));
                }else{
                    sb.append(Character.toLowerCase(word.charAt(i)));
                }
            }
            answer.append(sb);
        }
        return answer.substring(0, answer.length()-1);
    }

    public static String oodStringKeepPattern2(String s){

        StringBuilder answer = new StringBuilder();
        String[] words = s.split("");

        for(String word : words){
            System.out.println("word = " + word);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String s = " try hello dfdf  f   world    sdsd     asdadaw       QWE    ";

//        String s1 = oodString(s);
//        System.out.println("s1 = " + s1);
//
//        System.out.println("=========");
//        String s2 = oodStringKeepPattern(s);
//        System.out.println("s2 = " + s2);

        String s1 = oodStringKeepPattern2(s);
        System.out.println("s1 = " + s1);
    }
}
