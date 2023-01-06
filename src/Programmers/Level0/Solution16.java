package Programmers.Level0;

import java.util.Scanner;

// 아이스 아메리카노
// 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
class Solution16 {

    public static void main(String[] args) {
        int money = 0;




        System.out.println("enter the money");
        Scanner scan = new Scanner(System.in);
        money = scan.nextInt();
        int americano = 0;

        if (money >= 5500){
            americano = money/5500;
        }
        for (int i =0 ; i < 1000000; i++){
            if (money >= 5500 ){
                money=money-5500;
            }
        }
        System.out.println(americano+" "+ money);



    }




}

