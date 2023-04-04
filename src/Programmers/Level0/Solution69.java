package Programmers.Level0;
// 인덱스 바꾸기

// 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
// my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
public class Solution69 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        String temp = "";
        String[] array = my_string.split("");
        temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
        String answer = String.join("",array);
//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
        System.out.println(answer);
    }
}
