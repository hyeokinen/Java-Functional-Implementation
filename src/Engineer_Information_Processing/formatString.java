package Engineer_Information_Processing;

public class formatString {
    public static void main(String[] args) {
        /*
        서식 문자열 %f 에 대응하는 실수형 변수 a의 값을 출력한다.
        이어서 서식 문자열의 공백만큼 두 칸을 띄고 서식 문자열 %e
        에 대응하는 실수형 변수 a의 값을 소수점 이상 한 자리만 표시하는
        지수 형태로 출력한다. 서식 문자열에 자릿수가 지정되어 있지 않으면
        소수 이하는 6자리만 표시한다.
         */
        float a = 123456789.0e-5f;
        System.out.printf("%f %e\n",a,a);

        System.out.println(a);

    }
}
