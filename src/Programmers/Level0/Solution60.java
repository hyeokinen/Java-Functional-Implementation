package Programmers.Level0;
// 합성수 찾기
// 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int Solution60(int n) {
        int answerCount = 0;
        for (int i = 4; i <= n; i++) {
            if (isValue(i)) answerCount++;
        }
        return answerCount;
    }

    public static boolean isValue(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) count++;
        }
        return count >= 2;
    }
}