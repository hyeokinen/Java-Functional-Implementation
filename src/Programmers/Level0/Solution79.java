package Programmers.Level0;

// A로 B 만들기

import java.util.HashMap;

// 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을,
// 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
public class Solution79 {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";

        int answer = 0;

        String[] bef = before.split("");
        String[] aft = after.split("");
        HashMap<String, Integer> beforeMap = new HashMap<>();
        HashMap<String, Integer> afterMap = new HashMap<>();

        for (String beforeKey : bef) beforeMap.put(beforeKey, beforeMap.getOrDefault(beforeKey,0)+1);
        for (int i = 0; i < aft.length; i++){
            afterMap.put(aft[i],afterMap.getOrDefault(aft[i],0)+1);
        }
        if (beforeMap.equals(afterMap)){
            answer =1;
        }
        else {
            answer=0;
        }

        System.out.println(beforeMap);
        System.out.println(afterMap);
        System.out.println(answer);
    }
}
