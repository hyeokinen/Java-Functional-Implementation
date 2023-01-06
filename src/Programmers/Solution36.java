package Programmers;
//배열의 유사도
//문제 설명
//두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
public class Solution36 {
    public static void main(String[] args) {
        String[] str1 = new String[]{"a", "b", "c"};
        String[] str2 = new String[]{"com", "b", "d", "p", "c"};

        int count = 0;

        for (int i = 0; i < str1.length; i++){
            for (int j = 0; j < str2.length; j++){
                if (str1[i] == str2[j]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
