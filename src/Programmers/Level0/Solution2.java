package Programmers.Level0;

import java.util.Scanner;

public class Solution2 {
    public int Share(int num1, int num2){
        int result = num1/num2;
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        Solution2 Share = new Solution2();
        System.out.println(Share.Share(num1, num2));
    }


}
