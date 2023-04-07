package Programmers.Level0;

import java.util.Scanner;

public class Solution1 {
    public int solution(int num1, int num2){
        int answer = (num1 + num2);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        Solution1 solution = new Solution1();

        System.out.println(solution.solution(num1, num2));
    }
}
