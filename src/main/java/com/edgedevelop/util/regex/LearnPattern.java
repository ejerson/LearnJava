package com.edgedevelop.util.regex;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class LearnPattern {

    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

        // This checks if a regex pattern is valid or invalid
        try {
            Pattern.compile("([A-Z])(.+)");
            System.out.println("Valid");

        } catch (Exception e) {
            System.out.println("Invalid");
        }

    }


}
