package Programmers.Level0;
// 이진수 더하기

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
// 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
public class Solution81 {
    public static void main(String[] args) {

        /*
         * 예를들어 1001이진수를 10진수로 변환후 다시 2진수로 변환을 해야한다.
         * 배열에 이진수를 넣고 배열의 크기부터 시작을해서 반대로 반복문을 사용한다.
         * 제곱수를 이용해서 문제를 푼다.
         */

        String bin1 = "0";
        String bin2 = "1";
        int num = 2;
        int k1 = 0; int k2 = 0;
        int result1 = 0; int result2 = 0;
        int hap = 0;

        // split메소드로 문자 쪼개기
        String[] str1 = bin1.split("");
        String[] str2 = bin2.split("");

        // int형 배열 생성
        int[] arr1 = new int[str1.length];
        int[] arr2 = new int[str2.length];

        // 반복문을 통해 문자형 -> 정수형
        for (int i = 0; i < str1.length; i++){
            arr1[i] = Integer.parseInt(str1[i]);
        }

        for (int o = 0; o < str2.length; o++){
            arr2[o] = Integer.parseInt(str2[o]);
        }

        // 반복문안에 조건문을 넣어 조건에 맞을 경우 2의 제곱을 저장
        for (int j = arr1.length-1; j >= 0; j--){
            if (arr1[j] == 1){
                result1 += (int) Math.pow(num, k1);
                k1++;
            }
            else {
                k1++;
            }
        }

        for (int p = arr2.length-1; p >= 0; p--){
            if (arr2[p] == 1){
                result2 += (int) Math.pow(num, k2);
                k2++;
            }
            else {
                k2++;
            }
        }

        hap = result1+result2;

        // 최종 숫자를 다시 이진수로 변환후 문자열로 전환
        // 이진수를 담을 List 생성
        List<Integer> list = new ArrayList<>();

        while (hap > 0){
            list.add(hap%num);
            hap /= num;

        }
        Collections.reverse(list);
        String answer = "";
        for (int i = 0; i < list.size(); i++){
            answer += Integer.toString(list.get(i));
        }
        System.out.println(answer);
//        if (bin1.equals("0")&&bin2.equals("0")){
//            System.out.println("0입니다.");
//        }

    }
}
