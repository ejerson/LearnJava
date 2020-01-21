package com.edgedevelop.string;

import java.util.*;

public class CharArray {

    public static void main(String[] args) {

        String hello = "hello";
        String helloAm = "elloh";

        char[] test = hello.toCharArray();
        char[] test2 = helloAm.toCharArray();

        Arrays.sort(test);
        Arrays.sort(test2);
        System.out.println(String.valueOf(test).equals(String.valueOf(test2)));

    }
}
