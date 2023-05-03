package Engineer_Information_Processing;

// 소인수 분해하기
// 정수를 입력 받아 소인수를 구해 출력하는 순서도를 작성.
// 입력한 정수를 제곱근으로 나누고 나머지가 0일경우 그 몫을 다시 제곱근으로
// 나눠서 계산하는 방식을 이용한다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 20일경우 20의 제곱근의 정수는 4이다.
 2부터 20을 나눌경우 2에서부터 20의 나머지 0이 나온다.
 그러면 2를 저장하고 몫 10에 대해서 다시 제곱근 정수를 구한다.
 만약에 제곱근으로 나머지 0이 나오지 않으면 그 자체가 소인수가 된다.
 */
public class integerFactorization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("수를 입력하세요.");

        List<Integer> list = new ArrayList<>();
        // 입력할 수
        int num = scan.nextInt();
        // 입력한 수의 제곱근
        int sqrt = (int)Math.sqrt(num);

        boolean a = true;

        // while 에서 계산을 하고 조건이 맞지 않으면 다시 반복문을 수행하지만
        // 나누기로 초기화가 되었기 때문에 다시 num의 값에 계산된 값이 들어간다.
            for (int i = 2; i <= num; i++){
                if (num % i == 0){
                    while (num %i == 0){
                        num /= i;
                    }
                    list.add(i);
                }
            }


        System.out.println(list);

    }
}
