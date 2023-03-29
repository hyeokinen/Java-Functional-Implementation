package Programmers.Level0;

import java.util.Arrays;

// 최대값 만들기(2)
// 정수 배열 numbers가 매개변수로 주어집니다.
// numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
public class Solution65 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,-3,4,-5};
        int gop = 0;
        // 먼저 배열을 오름차순으로 정리를 해준다.
        Arrays.sort(numbers);
        // - 음수의 경우는 어떻게 처리를 해야할까?
        // 배열을 이용하여서
        for (int i = 0; i < numbers.length-1; i++){
            if (numbers[i] * numbers[i+1] > gop ){
                gop = numbers[i] * numbers[i+1];
                if (gop < 0){
                    gop = 0;
                }
            }

        }
        System.out.println(gop);
    }
}
