package Programmers.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// 7의 개수
// 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
public class Solution62 {
    public static void main(String[] args) {

        int[] array = new int[]{7,77,17};
        List<String> list = new ArrayList<>();
        int count = 0;
        String[] seven = new String[array.length];

        int a = 0;
        for (int i = 0; i < array.length; i++){
            seven[i] = Integer.toString(array[i]);

            list.add(Arrays.toString(seven[i].split("")));

        }
        System.out.println(list.get(1));
//        for (int i = 0; i < list.size(); i++){
//            for (int j = 0; j < 3; j++){
//
//                if (Objects.equals(list.get(i), "7")){
//                    count++;
//                }
//            }
//        }



    }
}
