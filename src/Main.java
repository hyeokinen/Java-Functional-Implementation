import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void test(int a, int b){
        if (a>1){
            a++;
            b++;
        }
        System.out.println(a +" " +b);
    }



    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scan.nextInt();
        int b = 0;

//        Main main = new Main();
        Main.test(a, b);

//        System.out.println(a + "  " +b);





    }
}