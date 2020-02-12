package com.edgedevelop.lambda;

public class LearnLambda {

    public interface  PerformOperation {
        boolean check(int a);
    }

    public static void main(String[] args) {

    }

    public static PerformOperation isPalindrome() {
        return (int a) -> new StringBuilder(Integer.toString(a)).reverse().toString().equals(Integer.toString(a));
    }

}
