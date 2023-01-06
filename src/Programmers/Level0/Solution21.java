package Programmers.Level0;

// 문자열배열 다시 합치는법
//방법 1. String.join()
//String.join()은 합친 문자열을 반환합니다. join()의 첫 번째 인자로 배열의 원소간 연결할 구분 문자, 두 번째 인자로 배열을 넣습니다.
//
//String[] company = { "Apple", "Amazon", "Google", "Microsoft"};
//String joinString = String.join(", ", company);
//
//System.out.println(joinString);
//Apple, Amazon, Google, Microsoft


//
// 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
// 문자열 반복을 하기위해서는 repeat를 사용하면 된다.

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s3 = "";
        String[] s2 = s1.split("");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i=0; i < s2.length; i++){
            s3 += s2[i].repeat(num);

        }
        System.out.println(s3);

    }
}
