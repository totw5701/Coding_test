package test.programmers.level2;

import java.util.*;

public class 오픈채팅방 {

    public static String[] openChet(String[] record){
        ArrayList<String> answer = new ArrayList<>();

        Map<String, String> finalNickName = new HashMap<>();

        for (String s : record) {
            String[] userLog = s.split(" ");
            if(!userLog[0].equals("Leave")) finalNickName.put(userLog[1], userLog[2]);
        }

        for (int i = 0; i < record.length; i++) {
            String[] userLog = record[i].split(" ");
            if(userLog[0].equals("Change")) continue;
            if(userLog[0].equals("Enter")){
                answer.add(finalNickName.get(userLog[1]) + "님이 들어왔습니다.");
            }else {
                answer.add(finalNickName.get(userLog[1]) + "님이 나갔습니다.");
            }
        }

        String[] answerArr = new String[answer.size()];
        for (int i = 0; i < answerArr.length; i++) {
            answerArr[i] = answer.get(i);
        }

        return answerArr;
    }


    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"};

        String[] strings = openChet(record);
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }
}
