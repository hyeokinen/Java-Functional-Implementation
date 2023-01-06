package Programmers.Level0;

public class Solution27_1 {
    public static void main(String[] args) {
        int age = 23;
        String[] array = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        int[] age2 = new int[age];

        for (int i = 0 ; i < 100; i++){
            age2[i] = age%10;
            age = age/10;
            System.out.println(age2[i]);
        }


    }
}
