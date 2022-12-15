package Programmers;
//찍스 홀수 개수
// 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class Solution20 {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int[] array2 = new int[2];





        for (int i = 0; i < array.length; i++){
            if (array[i]%2 == 0){
                array2[0]++;
            }
            if (array[i]%2 != 0){
                array2[1]++;
            }

        }
        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }



    }


}
