package Programmers.Level0;

import java.util.Scanner;

public class Solution52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("세균의 마리수를 입력하세요.");
        int n = scan.nextInt();
        System.out.println("시간을 입력하세요.");
        int t = scan.nextInt();
        
        int count = n;



        for (int i = 1; i <= t; i++ ){
            count *= 2;
        }

        System.out.println(count);
    }
}
