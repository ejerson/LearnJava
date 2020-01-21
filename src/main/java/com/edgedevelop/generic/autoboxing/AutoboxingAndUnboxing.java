package com.edgedevelop.generic.autoboxing;

import java.util.*;

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        // autoboxes 1 into an Integer wrapper object
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.add(10);
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);

        // autoboxing demo
        int num = numbers.get(0);
        System.out.println(num);

    }
}
