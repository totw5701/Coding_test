package test.programmers.level1;

public class 소수_찾기 {

    public static int basic(int n){
        int count = 1;
        for(int i = 3; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    System.out.println("i = " + i);
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        return count;
    }

    public static int basicRefract(int n){
        int count = n-1;
        for(int i = 3; i <= n; i++){
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    System.out.println("i = " + i);
                    count--;
                    break;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;

        //int basic = basic(n);
        int i = basicRefract(n);
        System.out.println("i = " + i);

    }
}
