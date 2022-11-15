package Samsung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    public static void Sort(int[] array, int count){

        for (int i = 0 ; i < array.length; i++){
            for (int j = 0; j < array.length -i -1; j++){
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    count++;
                }
            }

        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        int count1=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the arraySize");
        int nx = scan.nextInt();
        int[] array1 = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.println("Enter the number");
            array1[i] = scan.nextInt();
        }

        System.out.print("회전 횟수는: ");
        BubbleSort.Sort(array1,count1);

        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }

    }


}
