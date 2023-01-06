package Programmers.Level0;
// 점의 위치 구하기

class Solution31 {
    public int solution(int[] dot) {
        int result = 0;
        for(int i = 0; i < dot.length; i++){
            if(dot[i] > 0 && dot[i+1] > 0) return 1;
            if(dot[i] > 0 && dot[i+1] < 0) return 4;
            if(dot[i] < 0 && dot[i+1] > 0) return 2;
            if(dot[i] < 0 && dot[i+1] < 0) return 3;
        }
        return result;
    }
}