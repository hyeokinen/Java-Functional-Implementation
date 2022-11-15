package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class number_10773 {
        // 스택 문제
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Stirng");
        String M = br.readLine();
        System.out.println(M);

        System.out.println("Enter the number");

        // BufferedReader은 String타입 이므로 정수형으로 변경
        // 테스트코드 K 만큼 반복문 반복을 도는것이다.
        int K = Integer.parseInt(br.readLine());

        // Stack 클래스 사용
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<K; i++) {
            int temp = Integer.parseInt(br.readLine());

            if(temp == 0) {
                stack.pop();
            }
            else {
                stack.push(temp);
            }

        }

        int sum = 0;
        for(int num : stack) {
            sum += num;
        }

        System.out.println(sum);

    }
}
