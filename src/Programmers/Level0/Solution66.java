package Programmers.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 가까운 수
// 정수 배열 array와 정수 n이 매개변수로 주어질 때,
// array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
// 가장 가까운 수가 여러 개일 경우에는 더 작은 수를 return
class Solution66 {

    public static void main(String[] args) {
        int min=100;
        int[] array = new int[]{3, 5,8};
        int n = 4;
        for(int i=0; i<array.length; i++) {
            if(Math.abs(array[i]-n)<min) {            //array의 i번째 정수와 n의 차가 min보다 작으면
                min=Math.abs(array[i]-n);             //min 에 저장
            }
        }

        ArrayList<Integer> arr=new ArrayList<Integer>();  //가까운 수 최대 2개를 저장할 list
        for(int i=0; i<array.length; i++) {
            if((Math.abs(array[i]-n))==(min)) {       //정수n과의 차가 min 이면
                arr.add(array[i]);                    //list에 저장
            }
        }
        Collections.sort(arr);                            //오름차순으로 나열
        System.out.println(arr.get(0));

    }
}