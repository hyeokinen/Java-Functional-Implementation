package Programmers.Level0;

// 숫자 찾기
// 정수 num과 k가 매개변수로 주어질 때,
// num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록
// solution 함수를 완성해보세요.


public class Solution74 {
    public static void main(String[] args) {

        // 정수를 string타입으로 변경한후에 split을 사용하여 배열에 저장한뒤.
        // contain과 반복문을 사용하여 값이 포함되어있으면 위치 반환 아니면 -1반환

        int num = 29183;
        int k = 7;
        int result = 0;


        String kstr = Integer.toString(k);
        String[] str = Integer.toString(num).split("");
        for (int i = 0; i < str.length; i++){
            if (str[i].contains(kstr)){
                result = i+1;
                break;
            }
        }
        if (result == 0){
            result = -1;
        }

        System.out.println(result);
    }
}


