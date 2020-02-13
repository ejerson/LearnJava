package com.edgedevelop.exceptions;

public class ExceptionHandlingThrows {

    public static void main(String[] args) {

        try {
            System.out.println(power(0, 0));

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static long power(int n, int p) throws Exception {

        if (n < 0 | p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);
    }

}
