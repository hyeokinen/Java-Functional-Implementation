package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;

// 약수 구하기
// 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
public class Solution71 {
    public static void main(String[] args) {
        int n = 24;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n%i==0){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }


    }
}
