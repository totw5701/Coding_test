package test.programmers.level2;

public class 올바른_괄호 {

    public boolean init(String s) {

        if(s.charAt(0) == ')') return false;

        int view = 1;

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '(') view++;
            else view--;

            if(view < 0) return false;
        }

        if(view == 0) return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
