package Samsung;

import java.util.Arrays;
import java.util.Scanner;

public class SW_1966 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int N = sc.nextInt();
        int[] array = new int[N];

        for (int test_case = 0; test_case < T; test_case++){
            for (int i = 0; i < N; i++){
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);

            System.out.print("#"+(test_case+1)+" ");
            for (int i = 0; i < N; i++){
                System.out.print(array[i]+" ");

            }
            System.out.println();
        }




    }
}
