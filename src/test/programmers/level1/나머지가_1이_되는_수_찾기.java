package test.programmers.level1;

public class 나머지가_1이_되는_수_찾기 {

    public static int basic(int n){
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n%i == 1){
                return i;
            }
        }
        return n-1;
    }

    public static void main(String[] args) {
        int n = 6;

        int basic = basic(n);
        System.out.println("basic = " + basic);

    }
}
