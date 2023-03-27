package Programmers.Level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// 소인수분해
// 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

/**
 * 소수를 구하는 방법으로 set을 이용할수있다.
 * 어떤 방식을 이용할수 있을까?
 * set은 중복을 제거 해준다 그러면 배열에 저장된 값 또는 리스트에 저장된 값을 set으로 넣어버리면 값이 하나만 출력이 된다.
 * 그러면 정해지 값의 소수를 구하는 방법만 찾으면 된다.
 */

public class Solution61 {

    // 리스트를 뒤집어서 한번 해보기
    public static void main(String[] args) {
//        int num = 17;
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = num; i >= 2; i--){
//            if (num % i == 0){
//                list.add(i);
//            }
//        }
//        Collections.reverse(list);
//
//        int a = 0;
//        for (int i = 0; i < list.size(); i++){
//            for (int j = 2; j <= 2; j++){
//                if (list.get(i) == 2){
//                    list1.add(2);
//                    break;
//                }
//                else if (list.get(i) == 17){
//                    list1.add(17);
//                    break;
//                }
//                else if (list.get(i) % j != 0 && list.get(i) <=11){
//                    list1.add(list.get(i));
//                    break;
//                }
//            }
//        }
//        int[] answer = new int[list1.size()];
//        for (int i = 0 ; i < list1.size(); i++){
//            answer[i] = list1.get(i);
//        }
//
//
//        System.out.println(list1);


        // 2번째 방법
//        int num = 17;
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = num; i >= 2; i--){
//            if (num % i == 0){
//                list.add(i);
//            }
//        }
//        Collections.reverse(list);
////        System.out.println(list);
////        System.out.println(list.size());
//        int count = 0;
//        for (int i = 0; i <= list.size(); i++){
//            for (int j = 1; j <= list.get(i); j++){
//                if (i%j == 0){
//                    count++;
//                }
//            }
//            if (count==1){
//                list1.add(list.get(i));
//                System.out.println(list1+" ");
//            }
//            count=0;
//        }

//        int count=0;
//        for(int i=2; i<=12; i++){
//            for(int j=2; j<=i; j++){
//                if(i%j == 0){
//                    count ++;
//                }
//            }
//
//            // 핵심 : 1을 제외하고 자기 자신으로 한 번만 나눠질때 소수
//            if(count==1){
//                System.out.print(i+" ");
//            }
//            count=0;
//        }


        // 3번째 방법
//        int num = 420;
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = num; i >= 2; i--) {
//            if (num % i == 0) {
//                list.add(i);
//            }
//        }
//        Collections.reverse(list);
//
//        boolean isPrirmeNumber = true;
//        for (int i = 0; i < list.size(); i++){
//            for (int j = 2; j <= Math.sqrt(list.get(i)); j++){
//                if (list.get(i) % j == 0){
//                    isPrirmeNumber = false;
//                    break;
//                }
//
//            }
//            if (isPrirmeNumber){
//                list1.add(list.get(i));
//            }
//        }
//        System.out.println(list1);


        // 4번째 방법  (set을활용)
        int num = 17;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 2; i <= num; i++){
            if (num % i == 0 ){
                hashSet.add(i);
                num = num / i;
            }
        }
        System.out.println(hashSet);


    }
}
