package Engineer_Information_Processing;

import java.util.Scanner;

// 소수의 합 구하기
// 숫자를 입력하고 그 숫자 까지의 소수를 전부 더하는 문제이다.
public class decimalHap {
    public static void main(String[] args) {
       int hap, k, j;
        System.out.println("숫자를 입력하세요.");
       Scanner scan = new Scanner(System.in);
       hap = 0;
       int a = scan.nextInt();
       k = 2;

       while (true)
       {
           j = 2;
           while (k % j != 0)
               j++;
           if (k == j)
               hap += k;
           if (k < a)
               k++;
           else {
               System.out.println(hap);
               break;
           }
       }
    }
}
