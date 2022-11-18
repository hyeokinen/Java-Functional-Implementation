package Samsung;

import java.util.Scanner;
public class BubbleSort {

    public static int Sort(int[] array){

        int count = 0;

        for (int i = 0 ; i < array.length; i++){
            boolean swapped = false;
            for (int j = 0; j < array.length -i -1; j++){
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if (! swapped )
                break;
            count++;
        }

        return count;

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


        count1 = BubbleSort.Sort(array1);
        System.out.printf("회전 횟수는: %d\n", count1);
        System.out.printf(
                "(정렬이 완료됐는지 알려면 한 번 더 돌아야 하므로)\n" +
                        "전체 회전 횟수는: %d \n", count1 + 1);

        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }

    }


}