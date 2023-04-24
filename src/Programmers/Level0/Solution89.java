package Programmers.Level0;

// 다항식 더하기

// 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
// 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
// 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
// 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
public class Solution89 {
    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        String[] str = polynomial.split(" +");

//        for (int i = 0; i < str.length; i++){
//            System.out.println(str[i]);
//        }
        System.out.println(str[0].contains("x"));
    }
}
