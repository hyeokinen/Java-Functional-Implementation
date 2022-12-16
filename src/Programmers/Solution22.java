package Programmers;
// 특정 문자 제거하기
class Solution22 {
    public String solution(String my_string, String letter) {
        my_string = my_string.replace(letter,"");
        return my_string;
    }
}