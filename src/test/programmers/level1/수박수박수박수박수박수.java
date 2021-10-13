package test.programmers.level1;

public class 수박수박수박수박수박수 {

    public static String basic(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n/2; i++){
            sb.append("수박");
        }
        if(n%2 == 1){
            sb.append("수");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 4;

        String basic = basic(n);
        System.out.println("basic = " + basic);
    }
}
