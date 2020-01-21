package com.edgedevelop.map;

import java.util.*;


public class LearnMap {

    public static void main(String[] args) {
        Map< String,Integer> hm =
                new HashMap< String,Integer>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        // Returns Set view
        Set< Map.Entry< String,Integer> > st = hm.entrySet();

        for (Map.Entry< String,Integer> me:st)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }


        // See if I can increment a value if the key is the same for map

        String hello = "hello";


        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < hello.length(); i++) {

            map.put(hello.charAt(i) + "", 1);
        }

        System.out.println(map.values());
        System.out.println(map.keySet());

        map.get("h");

        char[] test = hello.toCharArray();
        System.out.println(test);


        // HASHMAP
        Map<String, Integer> map3 = new HashMap<String, Integer>();
        map3.put("l", 1);

        System.out.println(map3.get("l"));


        if (map3.containsKey("l")) {
            map3.put("l", map3.get("l") + 1);
        }


        System.out.println(map3.get("l"));

        // TREE MAP
        Map<String, Integer> mapTree1 = new TreeMap<>();
        mapTree1.put("a", 1);
        mapTree1.put("b", 1);
        mapTree1.put("c", 1);

        Map<String, Integer> mapTree2 = new TreeMap();
        mapTree2.put("d", 1);
        mapTree2.put("x", 1);
        mapTree2.put("a", 1);

        for (String key: mapTree1.keySet())
            System.out.print(key + ","); // giraffe,koala,lion,


        System.out.println(mapTree2.entrySet() == mapTree1.entrySet());
    }
}
