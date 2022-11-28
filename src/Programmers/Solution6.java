package Programmers;

import java.util.Scanner;

public class Solution6 {
    // 나머지 구하기
    // 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int num1, int num2){
        int result;
        return result = num1%num2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        Solution6 solution6 = new Solution6();

        System.out.println(solution6.solution(num1, num2));
    }



}
