package Engineer_Information_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 약수 구하는 알고리즘
// 약수란 나머지가 0이 되게 하는 제수들이 약수이다.
public class divisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("수를 입력하시오.");
        int num = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
