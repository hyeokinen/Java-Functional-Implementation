package Engineer_Information_Processing;

// 1의 보수 2의 보수 구하는 알고리즘

import java.util.Scanner;

public class complement {
    public static void main(String[] args) {
        // 2의 보수를 구할때 +1을 할경우 2가 되면 0으로 그리고 다음 값에
        // 올림을 해줘야 하는 부분을 구현해야 한다.
        Scanner scan = new Scanner(System.in);
        // 보수값 입력
        System.out.println("값을 입력하세요.");
        String str = scan.next();
        // str배열과 int배열 선언
        String[] strArray = str.split("");
        int[] intArray = new int[strArray.length];

        // 1의 보수값, 2의 보수값 변수 선언
        int[] oneComplement = new int[intArray.length];
        int[] twoComplement = new int[intArray.length];

        // 반복문을 통해서 자료형 변경
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        // 1의 보수 구하기
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                oneComplement[i] = 1;
            } else oneComplement[i] = 0;

            twoComplement[i] = oneComplement[i];
        }


        // 2의 보수 구하기
        twoComplement[intArray.length - 1] = twoComplement[intArray.length - 1] + 1;
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (twoComplement[i] == 2) {
                twoComplement[i] = 0;
                twoComplement[i - 1]++;
            }
        }


        // 결과값 출력
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(oneComplement[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(twoComplement[i] + " ");
        }
        

    }
}

