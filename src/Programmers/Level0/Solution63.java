package Programmers.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// 컨트롤 제트
// 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다.
// 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
// 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
public class Solution63 {
    public static void main(String[] args) {
        String s = "1 2 Z 3";
        List<String> array = new ArrayList<>(Arrays.asList(s.split(" ")));

//        for (int i = 0; i < array.size(); i++){
//            if (Objects.equals(array.get(i), "Z")){
//                array.remove(i);
//                array.remove(i-1);
//                i = 0;
//            }
//        }
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).equals("Z")){
                array.remove(i);
                array.remove(i-1);
                i = 0;
            }
        }
        int sum  = 0;

        for (int i = 0; i < array.size(); i++){
            sum += Integer.parseInt(array.get(i));
        }
        System.out.println(sum);
    }
}
