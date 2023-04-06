package Programmers.Level0;

// 문자열 계산하기

// my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
// 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
public class Solution73 {
    public static void main(String[] args) {

        String my_string = "3 + 7 - 6";
        String[] array = my_string.split(" ");
        int answer = Integer.parseInt(array[0]);
        for (int i = 1; i < array.length; i = i +2){
            if (array[i].equals("+")){
                answer += Integer.parseInt(array[i+1]);
            } else {
                answer -= Integer.parseInt(array[i+1]);
            }
        }
        System.out.println(answer);


    }
}
