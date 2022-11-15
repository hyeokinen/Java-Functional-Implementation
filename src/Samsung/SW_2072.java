package Samsung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SW_2072 {
    // 홀수만 더하기

    public static void main(String[] args) {
        int hap=0;
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int num1 = iterator.next();
            if ((num1 % 2) !=0){
                hap += num1;
            }

        }
        System.out.println(hap);
    }
}
