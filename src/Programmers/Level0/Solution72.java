package Programmers.Level0;

// 가장 큰 수 찾기

// 정수 배열 array가 매개변수로 주어질 때,
// 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class Solution72 {
    public static void main(String[] args) {
        int[] array = new int[]{9,10,11,8};
        int[] result = new int[2];

        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < array.length; i++){
            if (num1 < array[i]){
                num1 = array[i];
                num2 = i;
            }
        }
        result[0] = num1;
        result[1] = num2;
        System.out.println("가장 큰수는 " + num1 + " 위치는 " + num2 + "번째");
        System.out.println(result[0]+" "+result[1]);

    }
}
