package Engineer_Information_Processing;

// 수열 1+2+3+~~+100 까지의 합계 구하기
public class sequence1 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i <= 100; i++){
            num += i;
        }
        System.out.println(num);
    }
}
