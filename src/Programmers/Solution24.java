package Programmers;

// 양꼬치
// 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.


public class Solution24 {



    public static void main(String[] args) {


        int n = 10;
        int k = 3;
        int result = 0;
        if (n/10 >= 1){
            result = (n*12000)+((k-n/10)*2000);

        }
        System.out.println(result);

    }
}
