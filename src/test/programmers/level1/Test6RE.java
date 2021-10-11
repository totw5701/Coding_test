package test.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Test6RE {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = "";

        List<String> participantList = new ArrayList<>();

        for(String name : participant){
            participantList.add(name);
        }
        for(String name : completion){
            participantList.remove(name);
        }

        System.out.println("participantList = " + participantList);
        System.out.println(participantList.get(0));




    }
}
