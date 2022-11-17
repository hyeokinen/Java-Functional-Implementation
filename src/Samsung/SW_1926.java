package Samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SW_1926 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int number = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= number; i++){
            list.add(i);

            Iterator<Integer> iter = list.iterator();

            while (iter.hasNext()){
                int test = iter.next();
                if (test == 3){
                    list.set(i,0);
                }
                else if (test == 6){
                    list.set(i,0);
                }
                else if (test == 9){
                    list.set(i,0);
                }
            }
            System.out.println(list);


        }


    }





//    static void game(int number){
//        if (number)
//    }



}
