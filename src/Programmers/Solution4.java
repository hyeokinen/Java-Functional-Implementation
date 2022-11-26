package Programmers;


import java.util.Scanner;

public class Solution4 {
    //정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.


    public int result(int num1, int num2){
        if (num1 == num2){
            return 1;
        }
        else {
            return -1;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.result(num1,num2));






        //        System.out.println("Enter the value");
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//
//        if(num1 == num2){
//            System.out.println("1");
//        }
//        else {
//            System.out.println("-1");
//        }
    }



}
