package Engineer_Information_Processing;

import java.util.Scanner;

// 2진수를 10진수로 변환하기
// 2진수 값을 문자로 받아서 숫자로 변경후에 자리수 마다 값을 처리하자.
// 2진수의 값은 무조건 10자리로 받아야 한다.
public class numberConversaion2 {
    public static void main(String[] args) {

        int a = 4;
        double hap = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("2진수 10자리를 입력하세요.");
        // 2진수 입력받는 변수
        String str = scan.next();
        // split을 사용하여 배열에 저장
        String[] array = str.split("");
        int[] intArray = new int[array.length];
        // 반복문을 사용하여 int 형에 넣는다.
        for (int i = 0; i < array.length; i++){
            intArray[i] = Integer.parseInt(array[i]);
        }

        for (int i = 0; i < 10; i++){
            if (intArray[i] == 1){
                hap += Math.pow(2,a);
                a--;
            }
            else a--;
        }

        System.out.println(hap);

    }
}
