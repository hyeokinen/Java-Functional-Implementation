package Programmers;

// 최대값 만들기(1)
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

// 배열을 정렬한다 오름차순으로 그뒤에 맨뒤에서 두개를 추려서 곱하면 된다.
public class Solution34 {
    public static void main(String[] args) {
        int[] number1 = new int[]{1,2,3,4,5,6};
        int[] number2 = new int[]{10,14,12,44,9};
        int num = 0;

        Arrays.sort(number1);
        Arrays.sort(number2);

        num = number1[number1.length-1]*number1[number1.length-2];
        System.out.println(num);

//        int max = 0;
//        for (int i = 0; i < number1.length; i++){
//            if (number1[i] > max){
//                max = number1[i];
//            }
//        }
    }
}
