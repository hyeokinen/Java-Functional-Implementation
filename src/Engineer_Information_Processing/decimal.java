package Engineer_Information_Processing;

public class decimal {
    public static void main(String[] args) {
        int num = 8;
        int decimal = 0;
        for (int i = 2; i<num; i++){
            if (num % i != 0){
                System.out.println("소수입니다.");
            }
            else {
                System.out.println("소수가 아닙니다.");
            }
        }
    }
}
