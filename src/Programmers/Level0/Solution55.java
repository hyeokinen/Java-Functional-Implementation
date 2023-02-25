package Programmers.Level0;

import java.util.Arrays;

// 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
public class Solution55 {
    public static void main(String[] args) {
        String my_string = "hi12392";
        String[] replace = my_string.replaceAll("[a-z]","").split("");
        int[] my_int = new int[replace.length];

        for (int i = 0; i < replace.length; i++){
            int test = Integer.parseInt(replace[i]);
            my_int[i] += test;

        }
        Arrays.sort(my_int);
        for (int i = 0; i < my_int.length; i++){
            System.out.print(my_int[i] + " ");
        }
    }
}
