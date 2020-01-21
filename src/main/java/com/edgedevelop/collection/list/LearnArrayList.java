package com.edgedevelop.collection.list;

import java.util.*;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {
        String[] array = { "gerbil", "mouse" };           // [gerbil, mouse]
        List<String> list = Arrays.asList(array);              // returns fixed size list
        list.set(1, "test");                          // [gerbil, test]
        array[0] = "new";                               // [new, test]
        String[] array2 = (String[]) list.toArray();    // [new, test]

        System.out.println(array[0]);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
//        list.remove(1);


        // ArrayList
        ArrayList arrList = new ArrayList();

        // add items to the ArrayList
        arrList.add("hello");
        arrList.add(3);
        arrList.add(true);
        arrList.add(1010101);

        arrList.remove(2);
        // Use Iterator interface to iterate over an arraylist
        Iterator iterate = arrList.iterator();

        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }



    }
}
