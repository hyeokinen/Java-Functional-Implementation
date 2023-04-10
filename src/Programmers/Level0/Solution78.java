package Programmers.Level0;

// 직사각형 넓이 구하기
// 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
// 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
// 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
public class Solution78 {
    public static void main(String[] args) {
        int[][] dot = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int width = 0;
        int length = 0;
        int answer = 1;
        int x = dot[0][0];
        int y = dot[0][1];
        for (int i = 0; i < dot.length; i++){
            if (x != dot[i][0]) width = Math.abs(x - dot[i][0]);
            if (y != dot[i][1]) length = Math.abs(y - dot[i][1]);
        }
        answer = width*length;
        System.out.println(answer);

    }
}
