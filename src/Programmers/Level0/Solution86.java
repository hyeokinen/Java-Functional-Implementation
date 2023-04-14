package Programmers.Level0;
// 등수 매기기

import java.util.ArrayList;
import java.util.List;

// 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
// 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
public class Solution86 {
    public static void main(String[] args) {
        // 2차원 배열을 통해서 반복문을 통해서 각각의 점수의 평균을 새로운 배열에 담고 등수를 매겨야 한다.
        // 조건문을 통해서 동일점수일경우 처리를 하는 부분이 관건일듯 하다.
//        int[]/] score = new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
//        int[][] score = new int[][]{{1,1},{1,1},{1,2}};
        int[][] score = new int[][]{{0,20},{80,100},{10,10},{90,90},{20,0}};
//        int[][] score = new int[][]{{1,1},{2,1},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1},{9,1},{0,0}};

        double[] avg = new double[score.length];
        int[] rank = new int[score.length];

        // 이중배열 평균을 낸뒤에 배열에다가 대입
        for (int i = 0; i < score.length; i++) {
            avg[i] = (double) (score[i][0] + score[i][1]) / 2;
//            if (score[i][0] != 0 && score[i][1] != 0){
//            }
//            else if (score[i][0] == 0 && score[i][1] == 0){
//                avg[i] = 0;
//            }
        }

        // 배열 끼리 비교하여서 순위를 담는 처리
        for (int i = 0; i < score.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < score.length; j++) {
                if (avg[i] < avg[j]) {
                    rank[i]++;
                }
            }
        }
        for (int i = 0; i < score.length; i++){
//            System.out.println(avg[i]);
            System.out.println(rank[i]);
        }
    }
}
