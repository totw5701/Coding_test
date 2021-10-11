package test.programmers.level1;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = "";

        boolean completed = false;
        for(String name : participant){
                completed = false;
            for(int i = 0 ; i < completion.length ; i++){
                if(name.equals(completion[i])){
                    completion[i] = "";
                    completed = true;
                    break;
                }
            }
            if(!completed){
                answer = name;
                break;
            }
        }

        System.out.println("Arrays.toString(completion) = " + Arrays.toString(completion));
        
        System.out.println(answer);
    }

}
