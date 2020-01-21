package com.edgedevelop.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LearnRegex {

    public static void main(String[] args) {

        String s = "He is a very very good! boy, isn't he?";

        String patternString = "[ !,?._'@]";
        String matcherString = "[A-Za-z]";

        // create an instance of Pattern by using the Pattern.compile() method
        Pattern pattern = Pattern.compile(patternString);

        // split the text
        String[] split = pattern.split(s);



        int splitLength = split.length;
        System.out.println("split.length = " + splitLength);

        for(String element : split) {
            if (element.equals("")) {
                splitLength = splitLength - 1;
                continue;
            }
        }

        // http://tutorials.jenkov.com/java-regex/matcher.html
        // http://tutorials.jenkov.com/java-regex/pattern.html













        // 1. Create a string that is split, using a
        //    space a s a delimiter
//        String[] splitString = testString.split("[ '?]");
//
//        for (String indString : splitString) {
//
//            if (indString.contains(",")) {
//                String removeExtra = indString.replace(",", "");
//                System.out.println(removeExtra);
//                continue;
//            } else if (indString.contains("!")) {
//                String removeExtra = indString.replace("!", "");
//                System.out.println(removeExtra);
//                continue;
//            }
//            System.out.println(indString);
//        }
    }

}
