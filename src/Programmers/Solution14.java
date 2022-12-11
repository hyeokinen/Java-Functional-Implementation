package Programmers;
// 배열의 평균값
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

public class Solution14 {

        public double solution(int[] numbers) {
            double count = 0;
            double average = 0;
            for(int i = 0; i < numbers.length; i++){
                count += numbers[i];
            }
            average = count/numbers.length;
            double answer = average;
            return answer;
        }

}
