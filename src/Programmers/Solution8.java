package Programmers;

import java.util.Scanner;

public class Solution8 {
    // 짝수는 싫어요
    // 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arrays = new int[n];
        for (int i = 1; i <= n; i+=2){
            if (i%2 != 0){
                arrays[i] = i;
            }
            System.out.println(arrays[i]);
        }


    }
}
