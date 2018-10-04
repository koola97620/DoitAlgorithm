package Homework.kakao19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class User {
    private String id;
    private String nickname;
    private boolean in;
    public User(String id) {
        this.in = true;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String inChat() {
        this.in= true;
        return this.nickname + "님이 들어왔습니다.";
    }
    public String outChat() {
        this.in = false;
        return this.nickname + "님이 나갔습니다.";
    }
}





public class Question01 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] str = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234" , "Enter uid1234 Prodo" ,"Change uid4567 Ryan"};
        String[] str1 = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234" , "Enter uid1234 Prodo" ,"Change uid4567 Ryan"};

        String[] aa = solution2(str1);
        for(String a : aa) {
            System.out.println(a);
        }




    }

    public static String[] solution2(String[] record) {
        String[] answer = {};

        Map<String, String> map = new HashMap<String, String>();
        List<String> answerList = new ArrayList<String>();




        for(int i=0; i < record.length ; i++) {

            String[] line = record[i].split(" ");

            // line[0] enter , leave, change
            // line[1] id
            // line[2] nick
            if(line[0].equals("Enter") && !map.containsKey(line[1]) ) {
                map.put(line[1],line[2]);
                //answer[i] = line[2] + "님이 들어왔습니다.";
                answerList.add(line[1] + "님이 들어왔습니다.");

            } else if(line[0].equals("Enter") && map.containsKey(line[1])) {

                map.put(line[1],line[2]);
                answerList.add(line[1] + "님이 들어왔습니다.");



            } else if(line[0].equals("Leave") && map.containsKey(line[1])) {
                //answer[i] = map.get(line[1]) + "님이 나갔습니다.";
                answerList.add(line[1] + "님이 나갔습니다.");
                //map.remove(line[1]);

            } else if (line[0].equals("Change")) {
                System.out.println("change -   id : " + line[1] + "    nick : " + map.get(line[1]));
                map.put(line[1],line[2]);
            }

        }

        System.out.println(map);

        Set keys = map.keySet();

        String str = "";
        for(Object key : keys) {
            for(int i=0; i < answerList.size() ; i++) {
                str = answerList.get(i).replace((String)key,map.get(key));
                answerList.set(i,str);
            }
        }
        answer = answerList.toArray(new String[answerList.size()]);

        return answer;
    }



}
