package Programmers.Level0;
// 배열 자르기
//정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

import java.util.ArrayList;
import java.util.List;

public class Solution26 {
    public static void main(String[] args) {
        int numbers[] = new int[]{1,2,3,4,5};


        int num1= 1;
        int num2= 3;
        int arrays[] = new int[num2];
        int index = 0;

        for (int i = num1; i <= num2; i++){
            arrays[index] = numbers[i];
            index++;
        }

        for (int i = 0; i < 100; i++){
            System.out.print(arrays[i]+" ");
        }


    }

}
