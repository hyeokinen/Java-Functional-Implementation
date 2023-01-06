package Programmers.Level0;
// 문자열 뒤집기
//문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
public class Solution18 {

    public static void main(String[] args) {
//        String s1 = "Hello";
//        String[] s2 = s1.split("");
//        String[] s3 = new String[s2.length];
//        for (int i = 0; i <= s2.length-1; i++){
//            s3[i] = s2[s2.length-i-1];
//            System.out.print(s3[i]);
//        }


        // StringBuffer 자료형을 사용할수 있다.
        // String 자료형과는 다르기 때문에 다시 자료형을 바꾸고 싶다면 tostring을 사용하면 된다.

        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.reverse();
        System.out.println(sb);

    }

}
