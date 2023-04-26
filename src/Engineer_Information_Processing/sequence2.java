package Engineer_Information_Processing;

// 수열2 - 1-2+3-4+~~-100의 합계
public class sequence2 {
    public static void main(String[] args) {
        /*
        +와 -가 반복적으로 계산된다.
         */

        // sw 가 0이면 +, 1일경우 -
        int sw = 0;
        int hap = 0;
        for (int i = 1; i <= 100; i++ ){
            if (sw == 0){
                hap += i;
                sw = 1;
            } else if (sw == 1) {
                hap -= i;
                sw = 0;
            }
        }
        System.out.println(hap);
    }
}
