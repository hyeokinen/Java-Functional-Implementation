package Programmers.Level0;

import java.util.Arrays;
import java.util.Scanner;

public class Solution7 {
    // 중앙값 구하기
    // 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.




    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int max = 0;
        int[] arrays = new int[T];
        for (int i = 0; i < T; i++){

            arrays[i] = scan.nextInt();

        }
        Arrays.sort(arrays);

        for (int j = 0; j < (T+1)/2; j++){

            if (arrays[j] > max){
                max = arrays[j];

            }

        }
        System.out.println(max);

    }


}

// 1 2 3 4 5