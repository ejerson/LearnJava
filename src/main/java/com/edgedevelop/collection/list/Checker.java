package com.edgedevelop.collection.list;

import java.util.Comparator;

public class Checker implements Comparator<Student> {

    /*
     * x.compareTo(y)
     *
     *      negative value: if x < y (x should appear first)
     *      zero: if x == y
     *      positive value: if x > y (y should appear second)
     *
     */
    @Override
    public int compare(Student a, Student b) {
        if (a.getCgpa() == b.getCgpa()) {
            return a.getFname().compareTo(b.getFname());
        }

        if (a.getCgpa() > b.getCgpa()) {
            return -1;
        } else {
            return 1;
        }

    }
}
