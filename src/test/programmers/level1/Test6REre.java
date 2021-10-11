package test.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6REre {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Arrays.sort(participant);
        Arrays.sort(completion);

        int idx = participant.length-1;
        for(int i = 0; i < participant.length -1 ; i++){
            if(!participant[i].equals(completion[i])){
                idx = i;
                break;
            }
        }

        System.out.println("participant = " + participant[idx]);



    }
}
