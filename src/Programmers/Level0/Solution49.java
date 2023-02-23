package Programmers.Level0;
// 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution49 {
    public static void main(String[] args) {
        String my_string1 = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123";

//        String replace = "";
//        replace = my_string1.toLowerCase().replaceAll("[a-z]","");
//        List<String> list = Arrays.asList(replace.split(""));
//
//        List<Integer> list2 = list.stream()
//                            .map(s -> Integer.parseInt(s))
//                            .collect(Collectors.toList());
//
//        System.out.println(list2);

        List<String> list = new ArrayList<>(Arrays.asList(my_string1.toLowerCase().replaceAll("[a-z]","").split("")));
        List<Integer> stream = list.stream()
                .map(k -> Integer.parseInt(k))
                .collect(Collectors.toList());

        int count = stream.stream().mapToInt(s -> s).sum();
        System.out.println(count);






        // 배열에서 split 사용하는 방법
//        String[] array = my_string1.split("");

        // List에서 split 사용법
//        List<String> list = Arrays.asList(my_string2.split(""));





    }
}
