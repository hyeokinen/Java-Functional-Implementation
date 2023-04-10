package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;

// 잘라서 배열로 저장하기
// 문자열 my_str과 n이 매개변수로 주어질 때,
// my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
public class Solution77 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        int cnt = (my_str.length()+n-1)/n;
        String[] str = new String[cnt];
        for (int i = 0; i < cnt; i++){
           int start = i * n;
           int end = start + n;
           if (end >= my_str.length()){
               end = my_str.length();
           }
        str[i] = my_str.substring(start,end);
            System.out.println(str[i]);
        }
    }
}
