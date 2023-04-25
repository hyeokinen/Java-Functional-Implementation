package Engineer_Information_Processing;

public class postModification {
    public static void main(String[] args) {

//        int a, b = 10;
//        System.out.printf("%02d",b);
//        System.out.println();
//        for (a = 0; a < 5; ++a, b-=a){
//            System.out.printf("%d, %d\n",a,b);
//        }

        double a = 987.765;
        System.out.printf("%5.2f", a);

        // 반복문을 벗어날 때 반복 변수는 a < 5의 결과가 거짓이 되도록 증가한 후 빠져
        // 나간다는 것이다. 여기서는  a가 5보다 작은 동안에는 반복문을 실행했고, a 가 1증가하여
        // 5가 되었을 때 b-=a를 수행한 다음 반복문을 탈출한다는 것이다.

    }
}
