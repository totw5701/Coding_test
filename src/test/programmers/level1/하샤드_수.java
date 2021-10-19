package test.programmers.level1;

public class 하샤드_수 {

    public static boolean harshad(int x) {
        String s = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
            //sum += Character.getNumericValue(s.charAt(i));
        }
        if(x % sum == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int x = 10;
        boolean harshad = harshad(x);
        System.out.println("harshad = " + harshad);
    }
}
