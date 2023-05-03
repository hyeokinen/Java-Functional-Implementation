package Engineer_Information_Processing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 진법 변환
// 10진수를 2진수로 변환하기
public class numberConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        while (num > 0){
            if (num % 2 == 1 ){
                list.add(1);
                num /=2;
            }
            else if (num % 2 == 0){
                list.add(0);
                num /=2;
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
