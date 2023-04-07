package Programmers.Level0;
// 문자열 정렬하기(2)

import java.util.Arrays;
import java.util.Collections;

// 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
// my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
public class Solution76 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        String str = my_string.toLowerCase();
        char[] charArrays = str.toCharArray();
        Arrays.sort(charArrays);
        String result = new String(charArrays);
        System.out.println(result);
    }
}
