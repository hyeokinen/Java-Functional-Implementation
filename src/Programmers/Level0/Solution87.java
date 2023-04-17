package Programmers.Level0;

//저주의 숫자 3

import java.util.ArrayList;
import java.util.List;

// 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
// 3x 마을 사람들의 숫자는 다음과 같습니다.
// 정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
public class Solution87 {
    public static void main(String[] args) {
        // 3의 배수를 삭제해야한다.
        // 자리수에 3이 들어가면 안된다.
        // 130의 경우 while문을 이용하여서 3이 포함되어있는지를 판단한다.
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 500; i++) {
            if (i % 3 != 0 && !Integer.toString(i).contains("3")) {
                list.add(i);
            }
        }
        System.out.println(list);
        System.out.println(list.get(160));
    }
}
