package test.programmers.level1;

public class 약수의_합 {

    public static int basic(int n){
        int answer = 0;
        for(int i = 1; i <= n/2; i++){
            if(n%i == 0){
                answer += i;
            }
        }
        answer += n;
        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        int basic = basic(n);
        System.out.println("basic = " + basic);

    }
}
