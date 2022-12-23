package Programmers;

public class Solution28 {
    public static void main(String[] args) {
        int[] emergency = new int[]{3,76,24};
        int[] array = new int[emergency.length];
        int max = 0;

        for (int i = 0 ; i < 100; i++){
            if (emergency[i] < emergency[i+1]){
                max = emergency[i+1];
            }
            System.out.println(max);
        }
    }
}
