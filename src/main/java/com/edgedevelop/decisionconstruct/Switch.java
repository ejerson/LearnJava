package com.edgedevelop.decisionconstruct;

public class Switch {

    public static void main(String[] args) {
        final int x = 0;
        final int y = 2;
        final String s = "hello";

        int i = (int)(Math.random() * 4);

        switch (i) {
            case x: {
                System.out.print("A");
            }
                break;
            case 1: System.out.print("B");
            case 4: System.out.print("C"); break;
            case y: System.out.print("C");

        }
    }
}
