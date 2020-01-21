package com.edgedevelop.generic;

import java.util.*;

public class DiamondOperator {

    public static void main(String[] args) {


        HashMap<String, HashMap<String, String>> map1 = new HashMap<String, HashMap<String, String>>();
        HashMap<String, HashMap<String, String>> map2 = new HashMap<>();

        Doggies dogs = new Doggies();
        dogs.names.add("hello");
        String hello = dogs.names.get(0);
        System.out.println(hello);
    }
}

class Doggies {
    List<String> names;
    Doggies() {
        names = new ArrayList<>();          // matches instance variable declaration
    }
    public void copyNames() {
        ArrayList<String> copyOfNames;
        copyOfNames = new ArrayList<>();   // matches local variable declaration
    }
}