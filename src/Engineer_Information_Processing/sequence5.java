package Engineer_Information_Processing;

// 피보나치 수열
// 1+1+2+3+5+8+13+~~ 20번째 항을 만들때까지 합하시오.
public class sequence5 {
    public static void main(String[] args) {
        int a, b, y, n, k, c;
        a =1;
        b =1;
        y=2;
        n = 10;
        for (k = 3; k<= n; k++){
            c = a +b;
            y += c;
            a = b;
            b= c;
        }
        System.out.println(y);
    }
}
