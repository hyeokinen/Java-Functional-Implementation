package Programmers.Level0;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// 7의 개수
// 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.


/**
 * 1. 정수형을 문자열로 변환
 * 2. 문자형 배열을 쪼갠다음에 다시 배열에 저장을 해야한다.
 * 그러면 배열의 크기를 어떻게 잡아야 할까? 동적할당?
 *
 */


public class Solution62 {
//    public static void main(String[] args) {
//
//        int[] array = new int[]{7,77,17};
//        List<String> list = new ArrayList<>();
//        int count = 0;
//        String[] seven = new String[array.length];
//
//        int a = 0;
//        for (int i = 0; i < array.length; i++){
//            seven[i] = Integer.toString(array[i]);
//
//            list.add(Arrays.toString(seven[i].split("")));
//
//        }
//    }

    public static void main(String[] args) {

        // int형 배열 선언
        int[] array = new int[]{7,77,17};

        // String형 배열 선언
        String[] str = new String[array.length];

        // 동적배열
        ArrayList<String> arrayStr = new ArrayList<String>();

        String test = "";


        // 반복문을 통해 int -> String 변환
        for (int i = 0; i < 10; i++){
            str[i] = Integer.toString(array[i]);
            arrayStr.add(Arrays.toString(str[i].split("")));
            test += arrayStr;
            System.out.print(test);
        }






    }
}
