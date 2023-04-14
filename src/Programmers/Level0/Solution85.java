package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;

public class Solution85 {
    public static void main(String[] args) {
        /*
         * 반복문을 사용해서 문자배열을 하나씩 확인한다 id 문자열과 db문자열을 비교하면서
         * 조건문을 사용하여서 값을 비교한뒤 출력값을 결정한다.
         */
        String[] id_pw = new String[]{"meosseugi", "1234"};
        String[][] db = new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        String l = "login";
        String w = "wrong pw";
        String f = "fail";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < db.length; i++){
            if (id_pw[0].equals(db[i][0])){
                if (id_pw[1].equals(db[i][1])){
                    list.add(l);
                } else if (!id_pw[1].equals(db[i][1])) {
                    list.add(w);
                }
            }
            else if(!id_pw[0].equals(db[i][0])){
                list.add(f);
            }
        }

        if (list.contains(l)){
            System.out.println(l);
        } else if (list.contains(w)) {
            System.out.println(w);
        } else System.out.println(f);


    }
}
