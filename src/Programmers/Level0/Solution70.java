package Programmers.Level0;

// 한 번만 등장한 문자

import java.lang.reflect.Array;
import java.util.*;

// 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
// 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
public class Solution70 {
    public static void main(String[] args) {
        String s = "hello";
//        List<String > array = Arrays.asList(s.split(""));
//        Collections.sort(array);
//        for (int i = 0; i < array.size()-1; i++ ){
//            if (Objects.equals(array.get(i), array.get(i + 1))){
//                array.remove(i);
//                array.remove(i+1);
//                i = 0;
//            }
//        }
//        System.out.println(array);


        HashMap<String, Integer> map = new HashMap<>();

        // 문자열 s를 나눈것을 key 값으로 하여 해시맵에 값을 추가한다.
        // getOrDefault(key, defaultValue)
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본 값
        // 반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환된다.
        for (String str : s.split("")){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        System.out.println(map);




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
