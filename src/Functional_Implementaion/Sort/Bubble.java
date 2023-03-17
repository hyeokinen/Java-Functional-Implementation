package Functional_Implementaion.Sort;

public class Bubble {


    private static void bubleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{3,6,41,2,4,1,5,743};
        Bubble.bubleSort(arr1);
        for(int k : arr1) {
            System.out.print(k+" ");
        }
    }

}
