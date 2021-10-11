package test.programmers.level1;

public class Test12_약수의_개수와_덧셈 {
    public static void main(String[] args) {
        int left = 1;
        int right = 2;


        int answer = 0;

        for(int i = left ; i <= right ; i++){
            int factorCount = 2; // 1과 자기 자신.
            if(i == 1){
                factorCount--;
            }

            for(int k = 2 ; k <= i/2 ; k++){
                if(i % k == 0){
                    System.out.println("k = " + k);
                    factorCount++;
                }
            }
            if(factorCount%2 == 0){
                System.out.println("i += " + i);
                answer+=i;
            }else if(factorCount%2 == 1){
                System.out.println("i -= " + i);
                answer-=i;
            }else{
                System.out.println("Error");
            }
        }

        System.out.println(answer);



    }
}
