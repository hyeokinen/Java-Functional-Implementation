package Programmers;

//배열 원소의 길이
//문제 설명
//문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.


class Solution32 {
    public int[] solution(String[] strlist) {
        int count = 0;
        int[] result = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++){
            count = strlist[i].length();
            result[i] = count;
        }
        return result;

    }
}