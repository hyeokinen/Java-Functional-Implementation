package Engineer_Information_Processing;

import java.util.Scanner;

// 소수의 합 구하기
// 숫자를 입력하고 그 숫자 까지의 소수를 전부 더하는 문제이다.
public class decimalHap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        // 입력할 숫자
        int num = scan.nextInt();
//        int sqrt = (int) Math.sqrt(num);
        // 소수를 저장할 값.
        int hap = 2;
        // 소수 판별 변수
        int x = 0;

        for (int i = 3; i <= num; i++){
            if (num == 2) {
                System.out.println("2");
                break;
            }
            for (int j = 2;  j < i; j++){
                if (i % j == 0){
                    x++;
                    if (x == 0){
                        hap += i;
                    }
                    break;
                }
            }
        }
        System.out.println(hap);


    }
}
