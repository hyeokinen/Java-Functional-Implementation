package Programmers.Level0;
// 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.

import java.util.Scanner;

public class Solution48 {
    public static void main(String[] args) {
        String rsp = "205";
        String[] div = rsp.split("");
        String[] save = new String[rsp.length()];
        for (int i = 0; i < div.length; i++){
            if (div[i].equals("0")){
                save[i] = "5";
            } else if (div[i].equals("2")) {
                save[i] = "0";

            } else if (div[i].equals("5")) {
                save[i] = "2";
            }
        }
        for (String answer : save){
            System.out.println(answer);
        }

    }
}
