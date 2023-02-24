package Programmers.Level0;

public class Solution54 {
    public static void main(String[] args) {

        // a ~ z 97 ~122
        // A ~ Z 65~90
        String answer ="";
        String test = "aBCDefg";

        char[] arry = test.toCharArray();
        String temp ="";
        //char 배열로 만들어서 하나씩 꺼내고 (asci 코드 사용) 대소문자 변환하기.
        for(int i = 0; i<arry.length; i++) {
            if( arry[i] >= 97 && arry[i] <= 122 ) {
                temp = arry[i] + "";
                answer += temp.toUpperCase();
            } else if( arry[i] >=65 && arry[i] <= 90){
                temp = arry[i] + "";
                answer += temp.toLowerCase();
            }
        }
        System.out.println(answer);
    }
}
