package Samsung;


import java.util.Scanner;

// 369 구하기 게임
public class SW_1926 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 1; i <= T; i++) {
            int a = i / 10; // 몫
            int b = i % 10; // 나머지

            if( a == 3 || a == 6 || a == 9) {
                if(b == 3|| b == 6 || b == 9) {
                    System.out.print("-- ");
                    continue;
                }

                System.out.print("- ");


            }
            else if (b == 3 || b == 6 || b== 9)
                System.out.print("- ");

            else {
                System.out.print(i+" ");
            }
        }}}