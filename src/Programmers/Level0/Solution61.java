package Programmers.Level0;

import java.util.ArrayList;
import java.util.Collections;

// 소인수분해
// 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
public class Solution61 {

    // 리스트를 뒤집어서 한번 해보기
    public static void main(String[] args) {
        int num = 17;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = num; i >= 2; i--){
            if (num % i == 0){
                list.add(i);
            }
        }
        Collections.reverse(list);

        int a = 0;
        for (int i = 0; i < list.size(); i++){
            for (int j = 2; j <= 2; j++){
                if (list.get(i) == 2){
                    list1.add(2);
                    break;
                }
                else if (list.get(i) == 17){
                    list1.add(17);
                    break;
                }
                else if (list.get(i) % j != 0 && list.get(i) <=11){
                    list1.add(list.get(i));
                    break;
                }
            }
        }
        int[] answer = new int[list1.size()];
        for (int i = 0 ; i < list1.size(); i++){
            answer[i] = list1.get(i);
        }


        System.out.println(list1);

    }
}
