package Programmers.Level0;

import java.util.Arrays;
import java.util.LinkedHashSet;

// 중복된 문자 제거
// 문자열 my_string이 매개변수로 주어집니다.
// my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
public class Solution64 {
    public static void main(String[] args) {
        String my_string = "We are the world";
        // 문자열 쪼개서 배열로 만들기
        String[] str = my_string.split("");
        // LinkedHashSet을 만들고 이걸 통해서 배열에 중복된 문자 제거
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(str));
        // 쪼갠 문자열을 다시 합치기
        String strHap = String.join("", hashSet);
        System.out.println(strHap);
    }
}
