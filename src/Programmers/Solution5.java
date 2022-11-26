package Programmers;

import java.util.Scanner;

public class Solution5 {
    // 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        int[] numbers = new int[T];
        for (int i = 0; i < T; i++){
            int N = scan.nextInt();
            numbers[i] = N;

        }
        for (int j = 0; j < numbers.length; j++){
            System.out.print(numbers[j]*2+" ");
        }
    }




}
