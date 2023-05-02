package Engineer_Information_Processing;

// 제곱근을 활용한 소수 구하기

// 제곱근을 활용하여 입력한 수가 소수인지를 판별한다.

import java.util.Scanner;

public class sqrtDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요!");
        // 입력 받는 수
        int num = scan.nextInt();
        // 제곱근을 담는 값
        int sqrt = (int) Math.sqrt(num);
        // 소수인지를 판별하는 수
        int result = 0;

        for (int i = 2; i <= sqrt; i++){
            if (num % i == 0){
                result = 0;
                break;
            }
            else result = 1;
        }
        if (result == 0) System.out.println(num + "은 소수가 아닙니다.");
        if (result == 1) System.out.println(num + "은 소수 입니다.");
    }
}
