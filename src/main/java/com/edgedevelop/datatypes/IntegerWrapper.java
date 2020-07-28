package com.edgedevelop.datatypes;

public class IntegerWrapper {
    public static void main(String[] args) {

        Integer i1 = new Integer("20");
        Integer i2 = Integer.decode("20");
        Integer i3 = Integer.valueOf("20");

        System.out.println(i1 + 12 + i3);

    }
}
