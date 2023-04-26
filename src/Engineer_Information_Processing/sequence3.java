package Engineer_Information_Processing;

/*
수열 1+2+4+7+11+16+~~로 증가하는 수열을 구하시오
수열에 숫자가 이전 값과의 차이가 증가값 만큼 차이가 난다.
 */
public class sequence3 {
    public static void main(String[] args) {
        int hap = 0;
        int j = 1;
        for (int i = 0; i < 20; i++){
            hap += j+i;
            j += i;
        }
        System.out.println(hap);

    }
}
