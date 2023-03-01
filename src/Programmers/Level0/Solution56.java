package Programmers.Level0;
import java.util.ArrayList;

//n의배수 구하기
class Solution56 {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                arrayList.add(num);
            }
        }
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}