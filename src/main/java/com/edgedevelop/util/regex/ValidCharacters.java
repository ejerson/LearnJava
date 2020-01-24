package com.edgedevelop.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidCharacters {

    public static void main(String[] args) {
        String pattern = "[^\\d+][]{8,30}d+]";

        System.out.println(Pattern.matches(pattern, "Samantha"));

    }
}
