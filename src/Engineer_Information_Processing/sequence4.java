package Engineer_Information_Processing;


// 수열 1!+2!+3!+~~+10! 의 합계를 구하시오.
// 팩토리얼의 합계를 구하는 문제이다.
public class sequence4 {
    public static void main(String[] args) {
        int factorial = 0;
        int hap = 1;
        for (int i = 1; i <= 10; i++){
            for (int j = i; j > 0; j--){
                hap *= j;
            }
            factorial += hap;
            hap = 1;
        }
        System.out.println(factorial);

//        for (int k = 3; k > 0; k--){
//            hap *= k;
//        }
//        System.out.println(hap);



    }
}
