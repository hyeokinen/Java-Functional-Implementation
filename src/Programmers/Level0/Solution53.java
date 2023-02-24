package Programmers.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution53 {

    // 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
    //
    //암호화된 문자열 cipher를 주고받습니다.
    //그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
    //문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String str = "";

        List<String> list = new ArrayList<String>(Arrays.asList(cipher.split("")));
        for (int i = 0; i < cipher.length(); i++){
            if ((i+1) % code == 0){
                str += list.get(i);
            }
        }
        System.out.println(str);

    }
}
