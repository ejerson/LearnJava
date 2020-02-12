package com.edgedevelop.collection.list;

import java.util.*;

public class SortArrayList {


    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "StudentA", 3.5));
        students.add(new Student(2, "StudentB", 3.6));
        students.add(new Student(3, "StudentC", 3.4));

        Collections.sort(students, new Checker());

        for (Student student : students) {
            System.out.println(student.getFname());
        }
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
