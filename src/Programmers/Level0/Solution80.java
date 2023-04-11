package Programmers.Level0;

import java.util.Arrays;

public class Solution80 {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        String kS = Integer.toString(k);
        int f = 0;

        int[] array = new int[j-i+1];
        String[] str = new String[array.length];
        for (int start = 0; start < array.length; start++){
            array[start] = i;
            i++;
            str[start] = Integer.toString(array[start]);
        }
        String answer = String.join("",str);
        String[] finalAnswer = answer.split("");
        for (int m = 0; m < finalAnswer.length; m++){
            if (finalAnswer[m].equals(kS)){
                f++;
            }
        }
        System.out.println(f);
    }
}
