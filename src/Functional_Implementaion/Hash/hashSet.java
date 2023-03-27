package Functional_Implementaion.Hash;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        Set<String> hset = new HashSet<>();
        hset.add(new String("a"));
        hset.add(new String("a"));
        hset.add("b");
        hset.add("c");
        hset.add("d");
        hset.add("e");
        hset.add("f");
        System.out.println(hset);
        System.out.println(hset.contains("s"));
        hset.toArray();
        System.out.println(hset);
        for (String s : hset){
            System.out.print(s + " ");
        }
        System.out.println();
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        List<String> list = new ArrayList<>(Arrays.asList("hi", "hello", "everybody", "let", "me", "b"));
        System.out.println(list);
        System.out.println(hset.size());

        for (int i = 0; i < list.size(); i++){
            hset.add(list.get(i));
        }
        System.out.println(hset);
        System.out.println(hset.size());





    }
}
