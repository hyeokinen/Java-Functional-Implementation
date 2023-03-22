package Functional_Implementaion.Stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class joining {
    public static void main(String[] args) {
        int[] array = new int[]{7,17,26,34,87};

        // stream배열을 string에 값을 넣는다.
        long str = Arrays.stream(Arrays.stream(array)
                // int 값을 string 값으로 변환
                .mapToObj(String::valueOf)
                // stream에서 작업한 결과를 하나의 스트링으로 이어 붙인다.
                // 출력 : 717263487
                .collect(Collectors.joining())
                // 각 자리수를 자른후에 배열에 넣는다.
                .split(""))
                // filter을 사용하여 문자열 7과 동일한경우를 찾은뒤 count를 한다.
                .filter(s -> s.equals("7"))
                .count();
        System.out.println(str);



    }
}
