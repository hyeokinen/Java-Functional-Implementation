package Programmers.Level0;

// 숨어있는 숫자의 덧셈 (2)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
// my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
public class Solution84 {
    public static void main(String[] args) {
        String my_string = "1a2b3c4d123Z";

        // 제공값 전부 소문자로 변경
        String somun = my_string.toLowerCase();
        // 소문자 삭제(공백으로 처리한 이유는 자리수를 구별하기 위함)
        String delete = somun.replaceAll("[a-z]"," ");
        List<String> list = new ArrayList<>();
        int[] array = new int[]{list.size()};

        int num = 0;
        list = Arrays.asList(delete.split(" "));
        for (int i = 0; i < list.size(); i++){
            if (!list.get(i).equals("")){
                num += Integer.parseInt(list.get(i));
            }
        }
        System.out.println(num);
    }
}
