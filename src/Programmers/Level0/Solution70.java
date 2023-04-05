package Programmers.Level0;

// 한 번만 등장한 문자

import java.lang.reflect.Array;
import java.util.*;

// 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
// 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
public class Solution70 {
    public static void main(String[] args) {
        String s = "hello";
        List<String > array = Arrays.asList(s.split(""));
        Collections.sort(array);
        for (int i = 0; i < array.size()-1; i++ ){
            if (Objects.equals(array.get(i), array.get(i + 1))){
                array.remove(i);
                array.remove(i+1);
                i = 0;
            }
        }
        System.out.println(array);


        //        HashSet<String> str = new HashSet<>();
//        for (int i = 0; i < array.length; i++){
//            str.add(array[i]);
//        }
//
//        ArrayList<String> list = new ArrayList<>(str);
//        Collections.sort(list);
//        System.out.println(list);



    }
}
