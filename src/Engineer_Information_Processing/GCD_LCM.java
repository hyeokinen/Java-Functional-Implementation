package Engineer_Information_Processing;

import java.util.Scanner;

// 최대공약수와 최소공배수 구하는 알고리즘
/*
최대 공약수는 말 그대로 공통인 약수중에서 최대를 의미한다.
최소 공배수는 공통인 배수중에서 최소를 의미한다.
 */
public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.(a>b)");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int gcd = 0;
        int lcm = a*b;
        int nmg = 0;
        while (a%b > 0){
            if (a%b != 0){
                nmg = a%b;
                a = b;
                b =nmg;
            }
            if (a%b == 0){
                gcd = b;
            }
        }
        lcm = lcm/gcd;
        System.out.println(gcd+" "+lcm);
    }
}
