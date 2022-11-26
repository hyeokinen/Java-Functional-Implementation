package Programmers;

// 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

import java.util.Scanner;

public class Solution3 {
    public double solution(double num1, double num2){
        double result = (num1/num2)*1000;
        return (int)result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();

        Solution3 solution3 = new Solution3();

        System.out.println(solution3.solution(num1, num2));

    }

}
